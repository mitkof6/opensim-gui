/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SliderJoint extends Joint {
  private long swigCPtr;

  public SliderJoint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.SliderJoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SliderJoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_SliderJoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SliderJoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.SliderJoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SliderJoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.SliderJoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.SliderJoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.SliderJoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SliderJoint(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.SliderJoint_getConcreteClassName(swigCPtr, this);
  }

  public SliderJoint() {
    this(opensimModelJNI.new_SliderJoint__SWIG_0(), true);
  }

  public SliderJoint(String name, Body parent, Vec3 locationInParent, Vec3 orientationInParent, Body body, Vec3 locationInBody, Vec3 orientationInBody, boolean reverse) {
    this(opensimModelJNI.new_SliderJoint__SWIG_1(name, Body.getCPtr(parent), parent, Vec3.getCPtr(locationInParent), locationInParent, Vec3.getCPtr(orientationInParent), orientationInParent, Body.getCPtr(body), body, Vec3.getCPtr(locationInBody), locationInBody, Vec3.getCPtr(orientationInBody), orientationInBody, reverse), true);
  }

  public SliderJoint(String name, Body parent, Vec3 locationInParent, Vec3 orientationInParent, Body body, Vec3 locationInBody, Vec3 orientationInBody) {
    this(opensimModelJNI.new_SliderJoint__SWIG_2(name, Body.getCPtr(parent), parent, Vec3.getCPtr(locationInParent), locationInParent, Vec3.getCPtr(orientationInParent), orientationInParent, Body.getCPtr(body), body, Vec3.getCPtr(locationInBody), locationInBody, Vec3.getCPtr(orientationInBody), orientationInBody), true);
  }

  public int numCoordinates() {
    return opensimModelJNI.SliderJoint_numCoordinates(swigCPtr, this);
  }

  public void scale(ScaleSet aScaleSet) {
    opensimModelJNI.SliderJoint_scale(swigCPtr, this, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

  public void connectToModel(Model aModel) {
    opensimModelJNI.SliderJoint_connectToModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

}
