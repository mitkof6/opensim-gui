/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class InverseKinematicsTool extends Tool {
  private transient long swigCPtr;

  public InverseKinematicsTool(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(InverseKinematicsTool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_InverseKinematicsTool(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static InverseKinematicsTool safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new InverseKinematicsTool(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new InverseKinematicsTool(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_getConcreteClassName(swigCPtr, this);
  }

  public InverseKinematicsTool() {
    this(opensimActuatorsAnalysesToolsJNI.new_InverseKinematicsTool__SWIG_0(), true);
  }

  public InverseKinematicsTool(String aFileName, boolean aLoadModel) throws java.io.IOException {
    this(opensimActuatorsAnalysesToolsJNI.new_InverseKinematicsTool__SWIG_1(aFileName, aLoadModel), true);
  }

  public InverseKinematicsTool(String aFileName) throws java.io.IOException {
    this(opensimActuatorsAnalysesToolsJNI.new_InverseKinematicsTool__SWIG_2(aFileName), true);
  }

  public InverseKinematicsTool(InverseKinematicsTool aObject) {
    this(opensimActuatorsAnalysesToolsJNI.new_InverseKinematicsTool__SWIG_3(InverseKinematicsTool.getCPtr(aObject), aObject), true);
  }

  public static void registerTypes() {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_registerTypes();
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_updateFromXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_updateFromXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode));
  }

  public void setModel(Model aModel) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public void setStartTime(double d) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_setStartTime(swigCPtr, this, d);
  }

  public double getStartTime() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_getStartTime(swigCPtr, this);
  }

  public void setEndTime(double d) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_setEndTime(swigCPtr, this, d);
  }

  public double getEndTime() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_getEndTime(swigCPtr, this);
  }

  public void setMarkerDataFileName(String markerDataFileName) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_setMarkerDataFileName(swigCPtr, this, markerDataFileName);
  }

  public String getMarkerDataFileName() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_getMarkerDataFileName(swigCPtr, this);
  }

  public void setCoordinateFileName(String coordDataFileName) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_setCoordinateFileName(swigCPtr, this, coordDataFileName);
  }

  public String getCoordinateFileName() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_getCoordinateFileName(swigCPtr, this);
  }

  public void setOutputMotionFileName(String aOutputMotionFileName) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_setOutputMotionFileName(swigCPtr, this, aOutputMotionFileName);
  }

  public String getOutputMotionFileName() {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_getOutputMotionFileName(swigCPtr, this);
  }

  public IKTaskSet getIKTaskSet() {
    return new IKTaskSet(opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_getIKTaskSet(swigCPtr, this), false);
  }

  public boolean run() throws java.io.IOException {
    return opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_run(swigCPtr, this);
  }

  public void populateReferences(MarkersReference markersReference, SimTKArrayCoordinateReference coordinateReferences) {
    opensimActuatorsAnalysesToolsJNI.InverseKinematicsTool_populateReferences(swigCPtr, this, MarkersReference.getCPtr(markersReference), markersReference, SimTKArrayCoordinateReference.getCPtr(coordinateReferences), coordinateReferences);
  }

}
