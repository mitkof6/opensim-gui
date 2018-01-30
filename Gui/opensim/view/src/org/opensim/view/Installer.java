/* -------------------------------------------------------------------------- *
 * OpenSim: Installer.java                                                    *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib, Christopher Dembia                                 *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may    *
 * not use this file except in compliance with the License. You may obtain a  *
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0          *
 *                                                                            *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 * -------------------------------------------------------------------------- */

package org.opensim.view;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.prefs.Preferences;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.openide.modules.ModuleInstall;
import org.openide.util.NbBundle;
import org.opensim.modeling.OpenSimObject;
import org.opensim.utils.ApplicationState;
import org.opensim.utils.TheApp;
import org.opensim.view.actions.ApplicationExit;
import org.opensim.view.base.OpenSimBaseCanvas;
import org.opensim.view.editors.BodyNameEditor;
import org.opensim.view.editors.FrameNameEditor;
import org.opensim.view.motions.MotionsDB;
import org.opensim.view.motions.MotionsDBDescriptor;
import org.opensim.view.nodes.EditorRegistry;
import org.opensim.view.pub.GeometryFileLocator;
import org.opensim.view.pub.OpenSimDB;
import org.opensim.view.pub.OpenSimDBDescriptor;
import org.opensim.view.pub.PluginsDB;
import org.opensim.view.pub.ViewDB;
import org.opensim.view.pub.ViewDBDescriptor;

/**
 * Manages a module's lifecycle. Remember that an installer is optional and
 * often not needed at all.
 */
public class Installer extends ModuleInstall {
    
   // Enable popups to display on top of heavy weight component/canvas
   static {
      JPopupMenu.setDefaultLightWeightPopupEnabled(false);
      javax.swing.ToolTipManager.sharedInstance().setLightWeightPopupEnabled(false);
      javax.swing.ToolTipManager.sharedInstance().setDismissDelay(600000); // keep tooltips up for a minute!
   }

   // This function is called when File...Exit is chosen.
   public boolean closing() {
      return ApplicationExit.confirmExit();
   }

    public void restored() {
        super.restored();
        System.setProperty ("netbeans.buildnumber", "4.0.Beta"); // Should get that from JNI but sometimes doesn't work'
        try {
             // Put your startup code here.
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
            if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
                // The native slider on macOS looks somewhat nice.
                UIManager.put("SliderUI", "org.opensim.view.OpenSimSliderUI");
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        // Force creation of Model-database OpenSimDB 
        // and a View-database ViewDB
        // and register View as Observer of Model
        OpenSimDB.getInstance().addObserver(ViewDB.getInstance());
        /**
         * @todo open explorer window, Restore default directory and Bones directories, ..
         */
        restorePrefs();
        
        String saved = Preferences.userNodeForPackage(TheApp.class).get("Persist Models", "On");
        if (false){ // FIX40 Disable for ISB for startup issue 305
            /** Restore from file */            
            try {
                XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(
                        new FileInputStream(TheApp.getUserDir()+"AppState.xml")));
                ApplicationState readState= (ApplicationState)decoder.readObject();
                PluginsDB.getInstance().loadPlugins();
                OpenSimDB.getInstance().rebuild((OpenSimDBDescriptor) readState.getObject("OpenSimDB"));
                ViewDB.getInstance().rebuild((ViewDBDescriptor) readState.getObject("ViewDB"));
                decoder.close();
            } catch (FileNotFoundException ex) {
                // First time, no file yet
                ApplicationState as = ApplicationState.getInstance();
                as.addObject("OpenSimDB", new OpenSimDBDescriptor(OpenSimDB.getInstance()));
                as.addObject("ViewDB", new ViewDBDescriptor(ViewDB.getInstance()));
                as.addObject("PluginsDB", PluginsDB.getInstance());
                as.addObject("MotionsDB", new MotionsDBDescriptor(MotionsDB.getInstance()));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        //
        //PropertyEditorManager.registerEditor(OpenSimObject.class, OpenSimObjectEditor.class);
        EditorRegistry.addEditor("Body", new BodyNameEditor());
        EditorRegistry.addEditor("PhysicalFrame", new FrameNameEditor());
    }
    /**
     * restorePrefs is primarily used for the first time around where there are no pref values
     * stored in the backing file/registry. It sets values in the backing store based on the resource/Bundle files
     * built nito the application */
    private void restorePrefs()
    {
         String currentVersionStr = NbBundle.getMessage(TheApp.class, "CTL_BuildDate");
         String savedVersionStr = Preferences.userNodeForPackage(TheApp.class).get("BuildDate", null);
         if (!currentVersionStr.equalsIgnoreCase(savedVersionStr)){
             // First launch, copy resources to User selected folder and save that as OpenSimUserDir
             String userDir = TheApp.installResources();
             Preferences.userNodeForPackage(TheApp.class).put("OpenSimResourcesDir", userDir);
         }
         Preferences.userNodeForPackage(TheApp.class).put("BuildDate", currentVersionStr);
         
         String AAFRamesDefaultStr = NbBundle.getMessage(OpenSimBaseCanvas.class, "CTL_AAFrames");        
         String saved=Preferences.userNodeForPackage(TheApp.class).get("AntiAliasingFrames", AAFRamesDefaultStr);
         Preferences.userNodeForPackage(TheApp.class).put("AntiAliasingFrames", saved);
         
         String defaultOffsetDirection = NbBundle.getMessage(ViewDB.class,"CTL_DisplayOffsetDir");
         saved=Preferences.userNodeForPackage(TheApp.class).get("DisplayOffsetDir", defaultOffsetDirection);
         Preferences.userNodeForPackage(TheApp.class).put("DisplayOffsetDir", saved);
         
         String nonCurrentModelOpacityStr = NbBundle.getMessage(ViewDB.class,"CTL_NonCurrentModelOpacity");
         saved = Preferences.userNodeForPackage(TheApp.class).get("NonCurrentModelOpacity", nonCurrentModelOpacityStr);
         Preferences.userNodeForPackage(TheApp.class).put("NonCurrentModelOpacity", saved);

         String defaultGeometryPath = TheApp.getDefaultGeometrySearchPath();
         saved=Preferences.userNodeForPackage(TheApp.class).get("Geometry Path", defaultGeometryPath);
         if (saved.isEmpty()||saved.equalsIgnoreCase("")){
             saved = TheApp.getDefaultGeometrySearchPath();
         }
         else if (!saved.contains(defaultGeometryPath))
             saved.concat(File.pathSeparator+defaultGeometryPath);
         Preferences.userNodeForPackage(TheApp.class).put("Geometry Path", saved);
         // Push changes to API side
         GeometryFileLocator.updateGeometrySearchPathsFromPreferences();
         String defaultBgColor = NbBundle.getMessage(OpenSimBaseCanvas.class, "CTL_BackgroundColorRGB");        
         saved = Preferences.userNodeForPackage(TheApp.class).get("BackgroundColor", defaultBgColor);
         Preferences.userNodeForPackage(TheApp.class).put("BackgroundColor", saved);

         String muscleRadius = NbBundle.getMessage(ViewDB.class, "CTL_MuscleRadius");        
         saved = Preferences.userNodeForPackage(TheApp.class).get("Muscle Display Radius", muscleRadius);
         Preferences.userNodeForPackage(TheApp.class).put("Muscle Display Radius", saved);

         String markerRadius = NbBundle.getMessage(ViewDB.class, "CTL_MarkerRadius");        
         saved = Preferences.userNodeForPackage(TheApp.class).get("Marker Display Radius", markerRadius);
         Preferences.userNodeForPackage(TheApp.class).put("Marker Display Radius", saved);

         String markerColor = NbBundle.getMessage(ViewDB.class, "CTL_MarkersColorRGB");        
         saved = Preferences.userNodeForPackage(TheApp.class).get("Markers Color", markerColor);
         Preferences.userNodeForPackage(TheApp.class).put("Markers Color", saved);

         String experimentalMarkerDisplayScaleStr="1.0";
         saved=Preferences.userNodeForPackage(TheApp.class).get("Experimental Marker Size", experimentalMarkerDisplayScaleStr);
         Preferences.userNodeForPackage(TheApp.class).put("Experimental Marker Size", saved);
         
         String persistModels = "On";        
         saved = Preferences.userNodeForPackage(TheApp.class).get("Persist Models", persistModels);
         Preferences.userNodeForPackage(TheApp.class).put("Persist Models", saved);

         String refreshRateInMS = "100";        
         saved = Preferences.userNodeForPackage(TheApp.class).get("Refresh Rate (ms.)", refreshRateInMS);
         Preferences.userNodeForPackage(TheApp.class).put("Refresh Rate (ms.)", saved);

         String debugLevel = "0";        
         saved = Preferences.userNodeForPackage(TheApp.class).get("Debug", debugLevel);
         if (saved.equalsIgnoreCase("Off")) saved="0";
         Preferences.userNodeForPackage(TheApp.class).put("Debug", saved);
         int debugLevelInt = Integer.parseInt(saved);
         OpenSimObject.setDebugLevel(debugLevelInt);
         
         String defaultJointFrameSize = "1.0";
         saved = Preferences.userNodeForPackage(TheApp.class).get("Joint Frame Scale", defaultJointFrameSize);
         Preferences.userNodeForPackage(TheApp.class).put("Joint Frame Scale", saved);

         String displayContactGeometry = "On";
         saved = Preferences.userNodeForPackage(TheApp.class).get("Display Contact Geometry", displayContactGeometry);
         Preferences.userNodeForPackage(TheApp.class).put("Display Contact Geometry", saved);
         
         String saveMovieAsFrames = "Off";
         saved = Preferences.userNodeForPackage(TheApp.class).get("Save Movie Frames", saveMovieAsFrames);
         Preferences.userNodeForPackage(TheApp.class).put("Save Movie Frames", saved);
    }
}
