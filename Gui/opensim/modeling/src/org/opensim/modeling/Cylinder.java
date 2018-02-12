/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Cylinder extends AnalyticGeometry {
  private transient long swigCPtr;

  protected Cylinder(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Cylinder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Cylinder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_Cylinder(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Cylinder safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Cylinder_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Cylinder(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Cylinder_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Cylinder_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Cylinder_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Cylinder(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Cylinder_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_radius(Cylinder source) {
    opensimSimulationJNI.Cylinder_copyProperty_radius(swigCPtr, this, Cylinder.getCPtr(source), source);
  }

  public double get_radius(int i) {
    return opensimSimulationJNI.Cylinder_get_radius__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_radius(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Cylinder_upd_radius__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_radius(int i, double value) {
    opensimSimulationJNI.Cylinder_set_radius__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_radius(double value) {
    return opensimSimulationJNI.Cylinder_append_radius(swigCPtr, this, value);
  }

  public void constructProperty_radius(double initValue) {
    opensimSimulationJNI.Cylinder_constructProperty_radius(swigCPtr, this, initValue);
  }

  public double get_radius() {
    return opensimSimulationJNI.Cylinder_get_radius__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_radius() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Cylinder_upd_radius__SWIG_1(swigCPtr, this), false);
  }

  public void set_radius(double value) {
    opensimSimulationJNI.Cylinder_set_radius__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_half_height(Cylinder source) {
    opensimSimulationJNI.Cylinder_copyProperty_half_height(swigCPtr, this, Cylinder.getCPtr(source), source);
  }

  public double get_half_height(int i) {
    return opensimSimulationJNI.Cylinder_get_half_height__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_half_height(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Cylinder_upd_half_height__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_half_height(int i, double value) {
    opensimSimulationJNI.Cylinder_set_half_height__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_half_height(double value) {
    return opensimSimulationJNI.Cylinder_append_half_height(swigCPtr, this, value);
  }

  public void constructProperty_half_height(double initValue) {
    opensimSimulationJNI.Cylinder_constructProperty_half_height(swigCPtr, this, initValue);
  }

  public double get_half_height() {
    return opensimSimulationJNI.Cylinder_get_half_height__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_half_height() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Cylinder_upd_half_height__SWIG_1(swigCPtr, this), false);
  }

  public void set_half_height(double value) {
    opensimSimulationJNI.Cylinder_set_half_height__SWIG_1(swigCPtr, this, value);
  }

  public Cylinder() {
    this(opensimSimulationJNI.new_Cylinder__SWIG_0(), true);
  }

  public Cylinder(double radius, double hheight) {
    this(opensimSimulationJNI.new_Cylinder__SWIG_1(radius, hheight), true);
  }

  public void getCylinderParams(Vec2 params) {
    opensimSimulationJNI.Cylinder_getCylinderParams(swigCPtr, this, Vec2.getCPtr(params), params);
  }

}
