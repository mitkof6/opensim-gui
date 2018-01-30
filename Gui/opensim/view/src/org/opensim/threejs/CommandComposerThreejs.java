/* -------------------------------------------------------------------------- *
 * OpenSim: CommandComposerThreejs.java                                       *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib                                                     *
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.threejs;

import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.opensim.modeling.AbstractProperty;
import org.opensim.modeling.OpenSimObject;
import org.opensim.modeling.PropertyHelper;
import org.opensim.modeling.Vec3;

/**
 *
 * @author Ayman
 */
public class CommandComposerThreejs {

    static public JSONObject createSetVisibleCommandJson(boolean newValue, UUID uuid) {
        JSONObject commandJson = new JSONObject();
        commandJson.put("type", "SetValueCommand");
        commandJson.put("name", "SetVisible");
        commandJson.put("attributeName", "visible");
        commandJson.put("newValue", newValue);
        commandJson.put("objectUuid", uuid.toString());
        return commandJson;
    }

    static public JSONObject createTranslateObjectCommandJson(Vec3 newValue, UUID objectuuid) {
        JSONObject commandJson = new JSONObject();
        commandJson.put("type", "SetPositionCommand");
        commandJson.put("name", "Set Position");        
        JSONArray jsonVec3 = new JSONArray();
        jsonVec3.add(newValue.get(0));
        jsonVec3.add(newValue.get(1));
        jsonVec3.add(newValue.get(2));
        JSONArray jsonVec3Old = new JSONArray();
        jsonVec3Old.add(0.); jsonVec3Old.add(0.); jsonVec3Old.add(0.);
        commandJson.put("oldPosition", jsonVec3Old);
        commandJson.put("newPosition", jsonVec3);
        commandJson.put("objectUuid", objectuuid.toString());
        return commandJson;
    }

    static JSONObject createAppearanceChangeJson(AbstractProperty prop, UUID objectUuid) {
        // Map prop.name to threejs command as follows
         boolean visibilityChange = prop.getName().equalsIgnoreCase("visible");
         if (visibilityChange){
             boolean newValue = PropertyHelper.getValueBool(prop);
             return createSetVisibleCommandJson(newValue, objectUuid);
         }
         boolean scaleChange = prop.getName().equalsIgnoreCase("scale_factors");
         if (scaleChange){
             JSONObject commandJson = new JSONObject();
             commandJson.put("type", "SetScaleCommand");
             commandJson.put("objectUuid", objectUuid.toString());
             JSONArray jsonVec3 = new JSONArray();
             for (int i=0; i<3; i++)
                 jsonVec3.add(PropertyHelper.getValueVec3(prop, i));
             commandJson.put("oldScale", jsonVec3);
             commandJson.put("newScale", jsonVec3);
             return commandJson;
         }
         boolean opacityChange = prop.getName().equalsIgnoreCase("opacity");
         boolean representationChange = prop.getName().equalsIgnoreCase("representation");
         if ( opacityChange || representationChange){
             JSONObject commandJson = new JSONObject();
             commandJson.put("type", "SetMaterialValueCommand");
             commandJson.put("objectUuid", objectUuid.toString());
             if (opacityChange){
                 commandJson.put("name", "SetMaterialOpacity");
                 commandJson.put("attributeName", "opacity");
                 commandJson.put("newValue", PropertyHelper.getValueDouble(prop));
             }
             else { // RepresentationChange
                 commandJson.put("name", "SetMaterialShading");
                 commandJson.put("attributeName", "wireframe");
                 commandJson.put("newValue", PropertyHelper.getValueInt(prop)==2);
             }
             return commandJson;
         }
         if (prop.getName().equalsIgnoreCase("color")){
             Vec3 newColor = new Vec3();
             for (int i=0; i<3; i++)
                newColor.set(i, PropertyHelper.getValueVec3(prop, i));
             return createSetMaterialColorCommand(newColor, objectUuid);            
         }
         JSONObject commandJson = new JSONObject();
         return commandJson;
    }

    public static JSONObject createSetMaterialColorCommand(Vec3 newColor, UUID objectUuid) {
        JSONObject commandJson = new JSONObject();
        commandJson.put("type", "SetMaterialColorCommand");
        commandJson.put("name", "SetMaterialColor");
        commandJson.put("attributeName", "color");
        commandJson.put("newValue", JSONUtilities.mapColorToRGBA(newColor));
        commandJson.put("objectUuid", objectUuid.toString());
        return commandJson;
    }

    static JSONObject createAddObjectCommandJson(JSONObject newObject) {
        JSONObject commandJson = new JSONObject();
        commandJson.put("type", "AddObjectCommand");
        JSONObject obj = (JSONObject) newObject.get("object");
        commandJson.put("objectUuid", obj.get("uuid").toString());
        commandJson.put("object", newObject);
        return commandJson;
    }

    static JSONObject createRemoveObjectCommandJson(JSONObject object2Remove, String parent) {
        JSONObject commandJson = new JSONObject();
        commandJson.put("type", "RemoveObjectCommand");
        commandJson.put("parentUuid", parent);
        JSONObject dObject = new JSONObject();
        dObject.put("object", object2Remove);
        commandJson.put("object", dObject);
        return commandJson;
    }

    static JSONObject createRemoveObjectByUUIDCommandJson(UUID object2Remove, UUID parent) {
        JSONObject commandJson = new JSONObject();
        commandJson.put("type", "RemoveObjectCommand");
        commandJson.put("parentUuid", parent.toString());
        JSONObject dObject = new JSONObject();
        JSONObject dObjectObject = new JSONObject();
        dObject.put("object", dObjectObject);
        dObjectObject.put("uuid", object2Remove.toString());
        commandJson.put("object", dObject);
        return commandJson;
    } 
    
    static JSONObject createMoveObjectByUUIDCommandJson(UUID object2Move, UUID parent) {
        JSONObject commandJson = new JSONObject();
        commandJson.put("type", "MoveObjectCommand");
        commandJson.put("newParentUuid", parent.toString());
        commandJson.put("objectUuid", object2Move.toString());
        JSONObject dObject = new JSONObject();
        JSONObject dObjectObject = new JSONObject();
        dObject.put("object", dObjectObject);
        dObjectObject.put("uuid", object2Move.toString());
        commandJson.put("object", dObject);
        return commandJson;
    } 

    static JSONObject createScaleObjectCommand(double newScale, double oldScale, UUID objectUUID) {
        JSONObject commandJson = new JSONObject();
        commandJson.put("type", "SetScaleCommand");
        commandJson.put("objectUuid", objectUUID.toString());
        JSONArray jsonVec3 = new JSONArray();
             for (int i=0; i<3; i++)
                 jsonVec3.add(newScale);        
        commandJson.put("newScale", jsonVec3);
        JSONArray jsonVec3o = new JSONArray();
             for (int i=0; i<3; i++)
                 jsonVec3o.add(oldScale);
        commandJson.put("oldScale", jsonVec3o);
       return commandJson;
    }
    
}
