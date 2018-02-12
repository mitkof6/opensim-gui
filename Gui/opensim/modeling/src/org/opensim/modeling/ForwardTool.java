/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ForwardTool extends AbstractTool {
  private transient long swigCPtr;

  protected ForwardTool(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.ForwardTool_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ForwardTool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_ForwardTool(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ForwardTool safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ForwardTool_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ForwardTool(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.ForwardTool_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.ForwardTool_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ForwardTool_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ForwardTool(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.ForwardTool_getConcreteClassName(swigCPtr, this);
  }

  public ForwardTool() {
    this(opensimActuatorsAnalysesToolsJNI.new_ForwardTool__SWIG_0(), true);
  }

  public ForwardTool(String aFileName, boolean aUpdateFromXMLNode, boolean aLoadModel) throws java.io.IOException {
    this(opensimActuatorsAnalysesToolsJNI.new_ForwardTool__SWIG_1(aFileName, aUpdateFromXMLNode, aLoadModel), true);
  }

  public ForwardTool(String aFileName, boolean aUpdateFromXMLNode) throws java.io.IOException {
    this(opensimActuatorsAnalysesToolsJNI.new_ForwardTool__SWIG_2(aFileName, aUpdateFromXMLNode), true);
  }

  public ForwardTool(String aFileName) throws java.io.IOException {
    this(opensimActuatorsAnalysesToolsJNI.new_ForwardTool__SWIG_3(aFileName), true);
  }

  public ForwardTool(ForwardTool aObject) {
    this(opensimActuatorsAnalysesToolsJNI.new_ForwardTool__SWIG_4(ForwardTool.getCPtr(aObject), aObject), true);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimActuatorsAnalysesToolsJNI.ForwardTool_updateFromXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode) {
    opensimActuatorsAnalysesToolsJNI.ForwardTool_updateFromXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode));
  }

  public void setManager(Manager m) {
    opensimActuatorsAnalysesToolsJNI.ForwardTool_setManager(swigCPtr, this, Manager.getCPtr(m), m);
  }

  public Manager getManager() {
    return new Manager(opensimActuatorsAnalysesToolsJNI.ForwardTool_getManager(swigCPtr, this), false);
  }

  public String getStatesFileName() {
    return opensimActuatorsAnalysesToolsJNI.ForwardTool_getStatesFileName(swigCPtr, this);
  }

  public void setStatesFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.ForwardTool_setStatesFileName(swigCPtr, this, aFileName);
  }

  public boolean getUseSpecifiedDt() {
    return opensimActuatorsAnalysesToolsJNI.ForwardTool_getUseSpecifiedDt(swigCPtr, this);
  }

  public void setUseSpecifiedDt(boolean aUseSpecifiedDt) {
    opensimActuatorsAnalysesToolsJNI.ForwardTool_setUseSpecifiedDt(swigCPtr, this, aUseSpecifiedDt);
  }

  public void setPrintResultFiles(boolean aToWrite) {
    opensimActuatorsAnalysesToolsJNI.ForwardTool_setPrintResultFiles(swigCPtr, this, aToWrite);
  }

  public boolean run() throws java.io.IOException {
    return opensimActuatorsAnalysesToolsJNI.ForwardTool_run(swigCPtr, this);
  }

  public void printResults() {
    opensimActuatorsAnalysesToolsJNI.ForwardTool_printResults(swigCPtr, this);
  }

  public static double Step(double t, double t0, double t1) {
    return opensimActuatorsAnalysesToolsJNI.ForwardTool_Step(t, t0, t1);
  }

  public static double SigmaUp(double tau, double to, double t) {
    return opensimActuatorsAnalysesToolsJNI.ForwardTool_SigmaUp(tau, to, t);
  }

  public static double SigmaDn(double tau, double to, double t) {
    return opensimActuatorsAnalysesToolsJNI.ForwardTool_SigmaDn(tau, to, t);
  }

  public void loadStatesStorage(SWIGTYPE_p_std__string statesFileName, SWIGTYPE_p_p_OpenSim__Storage rYStore) {
    opensimActuatorsAnalysesToolsJNI.ForwardTool_loadStatesStorage(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(statesFileName), SWIGTYPE_p_p_OpenSim__Storage.getCPtr(rYStore));
  }

  public String getParsingLog() {
    return opensimActuatorsAnalysesToolsJNI.ForwardTool_getParsingLog(swigCPtr, this);
  }

}
