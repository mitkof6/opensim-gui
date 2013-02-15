/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class EllipsoidJoint extends Joint {
  private long swigCPtr;

  public EllipsoidJoint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.EllipsoidJoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(EllipsoidJoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_EllipsoidJoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static EllipsoidJoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.EllipsoidJoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new EllipsoidJoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.EllipsoidJoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.EllipsoidJoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.EllipsoidJoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new EllipsoidJoint(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.EllipsoidJoint_getConcreteClassName(swigCPtr, this);
  }

  public void setPropertyIndex_radii_x_y_z(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.EllipsoidJoint_PropertyIndex_radii_x_y_z_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_radii_x_y_z() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.EllipsoidJoint_PropertyIndex_radii_x_y_z_get(swigCPtr, this), true);
  }

  public void copyProperty_radii_x_y_z(EllipsoidJoint source) {
    opensimModelJNI.EllipsoidJoint_copyProperty_radii_x_y_z(swigCPtr, this, EllipsoidJoint.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__VecT_3_double_1_t_t getProperty_radii_x_y_z() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__VecT_3_double_1_t_t(opensimModelJNI.EllipsoidJoint_getProperty_radii_x_y_z(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__VecT_3_double_1_t_t updProperty_radii_x_y_z() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__VecT_3_double_1_t_t(opensimModelJNI.EllipsoidJoint_updProperty_radii_x_y_z(swigCPtr, this), false);
  }

  public Vec3 get_radii_x_y_z(int i) {
    return new Vec3(opensimModelJNI.EllipsoidJoint_get_radii_x_y_z__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_radii_x_y_z(int i) {
    return new Vec3(opensimModelJNI.EllipsoidJoint_upd_radii_x_y_z__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_radii_x_y_z(int i, Vec3 value) {
    opensimModelJNI.EllipsoidJoint_set_radii_x_y_z__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_radii_x_y_z(Vec3 value) {
    return opensimModelJNI.EllipsoidJoint_append_radii_x_y_z(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_radii_x_y_z(Vec3 initValue) {
    opensimModelJNI.EllipsoidJoint_constructProperty_radii_x_y_z(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_radii_x_y_z() {
    return new Vec3(opensimModelJNI.EllipsoidJoint_get_radii_x_y_z__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_radii_x_y_z() {
    return new Vec3(opensimModelJNI.EllipsoidJoint_upd_radii_x_y_z__SWIG_1(swigCPtr, this), false);
  }

  public void set_radii_x_y_z(Vec3 value) {
    opensimModelJNI.EllipsoidJoint_set_radii_x_y_z__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public EllipsoidJoint() {
    this(opensimModelJNI.new_EllipsoidJoint__SWIG_0(), true);
  }

  public EllipsoidJoint(String name, Body parent, Vec3 locationInParent, Vec3 orientationInParent, Body body, Vec3 locationInBody, Vec3 orientationInBody, Vec3 ellipsoidRadii, boolean reverse) {
    this(opensimModelJNI.new_EllipsoidJoint__SWIG_1(name, Body.getCPtr(parent), parent, Vec3.getCPtr(locationInParent), locationInParent, Vec3.getCPtr(orientationInParent), orientationInParent, Body.getCPtr(body), body, Vec3.getCPtr(locationInBody), locationInBody, Vec3.getCPtr(orientationInBody), orientationInBody, Vec3.getCPtr(ellipsoidRadii), ellipsoidRadii, reverse), true);
  }

  public EllipsoidJoint(String name, Body parent, Vec3 locationInParent, Vec3 orientationInParent, Body body, Vec3 locationInBody, Vec3 orientationInBody, Vec3 ellipsoidRadii) {
    this(opensimModelJNI.new_EllipsoidJoint__SWIG_2(name, Body.getCPtr(parent), parent, Vec3.getCPtr(locationInParent), locationInParent, Vec3.getCPtr(orientationInParent), orientationInParent, Body.getCPtr(body), body, Vec3.getCPtr(locationInBody), locationInBody, Vec3.getCPtr(orientationInBody), orientationInBody, Vec3.getCPtr(ellipsoidRadii), ellipsoidRadii), true);
  }

  public int numCoordinates() {
    return opensimModelJNI.EllipsoidJoint_numCoordinates(swigCPtr, this);
  }

  public void setEllipsoidRadii(Vec3 radii) {
    opensimModelJNI.EllipsoidJoint_setEllipsoidRadii(swigCPtr, this, Vec3.getCPtr(radii), radii);
  }

  public void scale(ScaleSet aScaleSet) {
    opensimModelJNI.EllipsoidJoint_scale(swigCPtr, this, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

}
