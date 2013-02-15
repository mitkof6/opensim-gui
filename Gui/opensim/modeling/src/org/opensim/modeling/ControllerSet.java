/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ControllerSet extends ModelComponentSetControllers {
  private long swigCPtr;

  public ControllerSet(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ControllerSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ControllerSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ControllerSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ControllerSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ControllerSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ControllerSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ControllerSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ControllerSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ControllerSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ControllerSet(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ControllerSet_getConcreteClassName(swigCPtr, this);
  }

  public ControllerSet() {
    this(opensimModelJNI.new_ControllerSet__SWIG_0(), true);
  }

  public ControllerSet(Model model) {
    this(opensimModelJNI.new_ControllerSet__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ControllerSet(ControllerSet aControllerSet) {
    this(opensimModelJNI.new_ControllerSet__SWIG_2(ControllerSet.getCPtr(aControllerSet), aControllerSet), true);
  }

  public ControllerSet(Model model, String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_ControllerSet__SWIG_3(Model.getCPtr(model), model, aFileName, aUpdateFromXMLNode), true);
  }

  public ControllerSet(Model model, String aFileName) {
    this(opensimModelJNI.new_ControllerSet__SWIG_4(Model.getCPtr(model), model, aFileName), true);
  }

  public void copyData(ControllerSet aAbsControllerSet) {
    opensimModelJNI.ControllerSet_copyData(swigCPtr, this, ControllerSet.getCPtr(aAbsControllerSet), aAbsControllerSet);
  }

  public boolean set(int aIndex, Controller aController) {
    return opensimModelJNI.ControllerSet_set(swigCPtr, this, aIndex, Controller.getCPtr(aController), aController);
  }

  public boolean addController(Controller aController) {
    return opensimModelJNI.ControllerSet_addController(swigCPtr, this, Controller.getCPtr(aController), aController);
  }

  public void constructStorage() {
    opensimModelJNI.ControllerSet_constructStorage(swigCPtr, this);
  }

  public void storeControls(State s, int step) {
    opensimModelJNI.ControllerSet_storeControls(swigCPtr, this, State.getCPtr(s), s, step);
  }

  public void printControlStorage(String fileName) {
    opensimModelJNI.ControllerSet_printControlStorage(swigCPtr, this, fileName);
  }

  public void setActuators(SetActuators arg0) {
    opensimModelJNI.ControllerSet_setActuators(swigCPtr, this, SetActuators.getCPtr(arg0), arg0);
  }

  public boolean check() {
    return opensimModelJNI.ControllerSet_check(swigCPtr, this);
  }

  public void setDesiredStates(Storage yStore) {
    opensimModelJNI.ControllerSet_setDesiredStates(swigCPtr, this, Storage.getCPtr(yStore), yStore);
  }

  public void computeControls(State s, Vector controls) {
    opensimModelJNI.ControllerSet_computeControls(swigCPtr, this, State.getCPtr(s), s, Vector.getCPtr(controls), controls);
  }

  public void printInfo() {
    opensimModelJNI.ControllerSet_printInfo(swigCPtr, this);
  }

}
