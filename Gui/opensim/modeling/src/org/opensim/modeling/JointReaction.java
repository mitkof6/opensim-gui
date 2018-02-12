/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class JointReaction extends Analysis {
  private transient long swigCPtr;

  protected JointReaction(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.JointReaction_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(JointReaction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_JointReaction(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static JointReaction safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.JointReaction_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new JointReaction(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.JointReaction_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.JointReaction_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.JointReaction_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new JointReaction(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.JointReaction_getConcreteClassName(swigCPtr, this);
  }

  public JointReaction(Model aModel) {
    this(opensimActuatorsAnalysesToolsJNI.new_JointReaction__SWIG_0(Model.getCPtr(aModel), aModel), true);
  }

  public JointReaction() {
    this(opensimActuatorsAnalysesToolsJNI.new_JointReaction__SWIG_1(), true);
  }

  public JointReaction(String aFileName) {
    this(opensimActuatorsAnalysesToolsJNI.new_JointReaction__SWIG_2(aFileName), true);
  }

  public JointReaction(JointReaction aObject) {
    this(opensimActuatorsAnalysesToolsJNI.new_JointReaction__SWIG_3(JointReaction.getCPtr(aObject), aObject), true);
  }

  public void setModel(Model aModel) {
    opensimActuatorsAnalysesToolsJNI.JointReaction_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public String getForcesFileName() {
    return opensimActuatorsAnalysesToolsJNI.JointReaction_getForcesFileName(swigCPtr, this);
  }

  public void setForcesFileName(String newForcesFile) {
    opensimActuatorsAnalysesToolsJNI.JointReaction_setForcesFileName(swigCPtr, this, newForcesFile);
  }

  public ArrayStr getJointNames() {
    return new ArrayStr(opensimActuatorsAnalysesToolsJNI.JointReaction_getJointNames(swigCPtr, this), false);
  }

  public void setJointNames(ArrayStr jointNames) {
    opensimActuatorsAnalysesToolsJNI.JointReaction_setJointNames(swigCPtr, this, ArrayStr.getCPtr(jointNames), jointNames);
  }

  public ArrayStr getOnBody() {
    return new ArrayStr(opensimActuatorsAnalysesToolsJNI.JointReaction_getOnBody(swigCPtr, this), false);
  }

  public void setOnBody(ArrayStr onBody) {
    opensimActuatorsAnalysesToolsJNI.JointReaction_setOnBody(swigCPtr, this, ArrayStr.getCPtr(onBody), onBody);
  }

  public ArrayStr getInFrame() {
    return new ArrayStr(opensimActuatorsAnalysesToolsJNI.JointReaction_getInFrame(swigCPtr, this), false);
  }

  public void setInFrame(ArrayStr inFrame) {
    opensimActuatorsAnalysesToolsJNI.JointReaction_setInFrame(swigCPtr, this, ArrayStr.getCPtr(inFrame), inFrame);
  }

  public int begin(State s) {
    return opensimActuatorsAnalysesToolsJNI.JointReaction_begin(swigCPtr, this, State.getCPtr(s), s);
  }

  public int step(State s, int setNumber) {
    return opensimActuatorsAnalysesToolsJNI.JointReaction_step(swigCPtr, this, State.getCPtr(s), s, setNumber);
  }

  public int end(State s) {
    return opensimActuatorsAnalysesToolsJNI.JointReaction_end(swigCPtr, this, State.getCPtr(s), s);
  }

  public int printResults(String aBaseName, String aDir, double aDT, String aExtension) {
    return opensimActuatorsAnalysesToolsJNI.JointReaction_printResults__SWIG_0(swigCPtr, this, aBaseName, aDir, aDT, aExtension);
  }

  public int printResults(String aBaseName, String aDir, double aDT) {
    return opensimActuatorsAnalysesToolsJNI.JointReaction_printResults__SWIG_1(swigCPtr, this, aBaseName, aDir, aDT);
  }

  public int printResults(String aBaseName, String aDir) {
    return opensimActuatorsAnalysesToolsJNI.JointReaction_printResults__SWIG_2(swigCPtr, this, aBaseName, aDir);
  }

  public int printResults(String aBaseName) {
    return opensimActuatorsAnalysesToolsJNI.JointReaction_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

}
