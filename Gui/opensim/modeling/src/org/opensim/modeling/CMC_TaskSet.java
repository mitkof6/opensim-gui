/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class CMC_TaskSet extends SetTrackingTasks {
  private transient long swigCPtr;

  protected CMC_TaskSet(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CMC_TaskSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_CMC_TaskSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static CMC_TaskSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new CMC_TaskSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new CMC_TaskSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getConcreteClassName(swigCPtr, this);
  }

  public CMC_TaskSet() {
    this(opensimActuatorsAnalysesToolsJNI.new_CMC_TaskSet__SWIG_0(), true);
  }

  public CMC_TaskSet(String aFileName) {
    this(opensimActuatorsAnalysesToolsJNI.new_CMC_TaskSet__SWIG_1(aFileName), true);
  }

  public CMC_TaskSet(CMC_TaskSet aCMCTaskSet) {
    this(opensimActuatorsAnalysesToolsJNI.new_CMC_TaskSet__SWIG_2(CMC_TaskSet.getCPtr(aCMCTaskSet), aCMCTaskSet), true);
  }

  public void setModel(Model aModel) {
    opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public Model getModel() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getModel(swigCPtr, this);
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  public String getDataFileName() {
    return opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getDataFileName(swigCPtr, this);
  }

  public void setFunctions(FunctionSet aFuncSet) {
    opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_setFunctions(swigCPtr, this, FunctionSet.getCPtr(aFuncSet), aFuncSet);
  }

  public void setFunctionsForVelocity(FunctionSet aFuncSet) {
    opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_setFunctionsForVelocity(swigCPtr, this, FunctionSet.getCPtr(aFuncSet), aFuncSet);
  }

  public void setFunctionsForAcceleration(FunctionSet aFuncSet) {
    opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_setFunctionsForAcceleration(swigCPtr, this, FunctionSet.getCPtr(aFuncSet), aFuncSet);
  }

  public int getNumActiveTaskFunctions() {
    return opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getNumActiveTaskFunctions(swigCPtr, this);
  }

  public ArrayDouble getTaskPositions(double aT) {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getTaskPositions(swigCPtr, this, aT), false);
  }

  public ArrayDouble getTaskVelocities(double aT) {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getTaskVelocities(swigCPtr, this, aT), false);
  }

  public ArrayDouble getTaskAccelerations(double aT) {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getTaskAccelerations(swigCPtr, this, aT), false);
  }

  public ArrayDouble getPositionGains() {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getPositionGains(swigCPtr, this), false);
  }

  public ArrayDouble getVelocityGains() {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getVelocityGains(swigCPtr, this), false);
  }

  public ArrayDouble getAccelerationGains() {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getAccelerationGains(swigCPtr, this), false);
  }

  public ArrayDouble getPositionErrorsLast() {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getPositionErrorsLast(swigCPtr, this), false);
  }

  public ArrayDouble getPositionErrors() {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getPositionErrors(swigCPtr, this), false);
  }

  public ArrayDouble getVelocityErrorsLast() {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getVelocityErrorsLast(swigCPtr, this), false);
  }

  public ArrayDouble getVelocityErrors() {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getVelocityErrors(swigCPtr, this), false);
  }

  public ArrayDouble getWeights() {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getWeights(swigCPtr, this), false);
  }

  public ArrayDouble getDesiredAccelerations() {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getDesiredAccelerations(swigCPtr, this), false);
  }

  public ArrayDouble getAccelerations() {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_getAccelerations(swigCPtr, this), false);
  }

  public void recordErrorsAsLastErrors() {
    opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_recordErrorsAsLastErrors(swigCPtr, this);
  }

  public void computeErrors(State s, double aT) {
    opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_computeErrors(swigCPtr, this, State.getCPtr(s), s, aT);
  }

  public void computeDesiredAccelerations(State s, double aT) {
    opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_computeDesiredAccelerations__SWIG_0(swigCPtr, this, State.getCPtr(s), s, aT);
  }

  public void computeDesiredAccelerations(State s, double aTCurrent, double aTFuture) {
    opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_computeDesiredAccelerations__SWIG_1(swigCPtr, this, State.getCPtr(s), s, aTCurrent, aTFuture);
  }

  public void computeAccelerations(State s) {
    opensimActuatorsAnalysesToolsJNI.CMC_TaskSet_computeAccelerations(swigCPtr, this, State.getCPtr(s), s);
  }

}
