/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WrapObjectSet extends SetWrapObject {
  private long swigCPtr;

  public WrapObjectSet(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.WrapObjectSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapObjectSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_WrapObjectSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapObjectSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.WrapObjectSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapObjectSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.WrapObjectSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.WrapObjectSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.WrapObjectSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapObjectSet(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.WrapObjectSet_getConcreteClassName(swigCPtr, this);
  }

  public WrapObjectSet() {
    this(opensimModelJNI.new_WrapObjectSet__SWIG_0(), true);
  }

  public WrapObjectSet(WrapObjectSet aWrapObjectSet) {
    this(opensimModelJNI.new_WrapObjectSet__SWIG_1(WrapObjectSet.getCPtr(aWrapObjectSet), aWrapObjectSet), true);
  }

}
