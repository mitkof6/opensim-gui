/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ExpressionBasedBushingForce extends TwoFrameLinkerForce {
  private transient long swigCPtr;

  protected ExpressionBasedBushingForce(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ExpressionBasedBushingForce_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExpressionBasedBushingForce obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ExpressionBasedBushingForce(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ExpressionBasedBushingForce safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ExpressionBasedBushingForce_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ExpressionBasedBushingForce(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ExpressionBasedBushingForce_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ExpressionBasedBushingForce_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ExpressionBasedBushingForce(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_Mx_expression(ExpressionBasedBushingForce source) {
    opensimSimulationJNI.ExpressionBasedBushingForce_copyProperty_Mx_expression(swigCPtr, this, ExpressionBasedBushingForce.getCPtr(source), source);
  }

  public String get_Mx_expression(int i) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_Mx_expression__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_Mx_expression(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedBushingForce_upd_Mx_expression__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_Mx_expression(int i, String value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_Mx_expression__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_Mx_expression(String value) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_append_Mx_expression(swigCPtr, this, value);
  }

  public void constructProperty_Mx_expression(String initValue) {
    opensimSimulationJNI.ExpressionBasedBushingForce_constructProperty_Mx_expression(swigCPtr, this, initValue);
  }

  public String get_Mx_expression() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_Mx_expression__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_Mx_expression() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedBushingForce_upd_Mx_expression__SWIG_1(swigCPtr, this), false);
  }

  public void set_Mx_expression(String value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_Mx_expression__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_My_expression(ExpressionBasedBushingForce source) {
    opensimSimulationJNI.ExpressionBasedBushingForce_copyProperty_My_expression(swigCPtr, this, ExpressionBasedBushingForce.getCPtr(source), source);
  }

  public String get_My_expression(int i) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_My_expression__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_My_expression(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedBushingForce_upd_My_expression__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_My_expression(int i, String value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_My_expression__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_My_expression(String value) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_append_My_expression(swigCPtr, this, value);
  }

  public void constructProperty_My_expression(String initValue) {
    opensimSimulationJNI.ExpressionBasedBushingForce_constructProperty_My_expression(swigCPtr, this, initValue);
  }

  public String get_My_expression() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_My_expression__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_My_expression() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedBushingForce_upd_My_expression__SWIG_1(swigCPtr, this), false);
  }

  public void set_My_expression(String value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_My_expression__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_Mz_expression(ExpressionBasedBushingForce source) {
    opensimSimulationJNI.ExpressionBasedBushingForce_copyProperty_Mz_expression(swigCPtr, this, ExpressionBasedBushingForce.getCPtr(source), source);
  }

  public String get_Mz_expression(int i) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_Mz_expression__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_Mz_expression(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedBushingForce_upd_Mz_expression__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_Mz_expression(int i, String value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_Mz_expression__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_Mz_expression(String value) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_append_Mz_expression(swigCPtr, this, value);
  }

  public void constructProperty_Mz_expression(String initValue) {
    opensimSimulationJNI.ExpressionBasedBushingForce_constructProperty_Mz_expression(swigCPtr, this, initValue);
  }

  public String get_Mz_expression() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_Mz_expression__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_Mz_expression() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedBushingForce_upd_Mz_expression__SWIG_1(swigCPtr, this), false);
  }

  public void set_Mz_expression(String value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_Mz_expression__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_Fx_expression(ExpressionBasedBushingForce source) {
    opensimSimulationJNI.ExpressionBasedBushingForce_copyProperty_Fx_expression(swigCPtr, this, ExpressionBasedBushingForce.getCPtr(source), source);
  }

  public String get_Fx_expression(int i) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_Fx_expression__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_Fx_expression(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedBushingForce_upd_Fx_expression__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_Fx_expression(int i, String value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_Fx_expression__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_Fx_expression(String value) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_append_Fx_expression(swigCPtr, this, value);
  }

  public void constructProperty_Fx_expression(String initValue) {
    opensimSimulationJNI.ExpressionBasedBushingForce_constructProperty_Fx_expression(swigCPtr, this, initValue);
  }

  public String get_Fx_expression() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_Fx_expression__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_Fx_expression() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedBushingForce_upd_Fx_expression__SWIG_1(swigCPtr, this), false);
  }

  public void set_Fx_expression(String value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_Fx_expression__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_Fy_expression(ExpressionBasedBushingForce source) {
    opensimSimulationJNI.ExpressionBasedBushingForce_copyProperty_Fy_expression(swigCPtr, this, ExpressionBasedBushingForce.getCPtr(source), source);
  }

  public String get_Fy_expression(int i) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_Fy_expression__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_Fy_expression(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedBushingForce_upd_Fy_expression__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_Fy_expression(int i, String value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_Fy_expression__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_Fy_expression(String value) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_append_Fy_expression(swigCPtr, this, value);
  }

  public void constructProperty_Fy_expression(String initValue) {
    opensimSimulationJNI.ExpressionBasedBushingForce_constructProperty_Fy_expression(swigCPtr, this, initValue);
  }

  public String get_Fy_expression() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_Fy_expression__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_Fy_expression() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedBushingForce_upd_Fy_expression__SWIG_1(swigCPtr, this), false);
  }

  public void set_Fy_expression(String value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_Fy_expression__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_Fz_expression(ExpressionBasedBushingForce source) {
    opensimSimulationJNI.ExpressionBasedBushingForce_copyProperty_Fz_expression(swigCPtr, this, ExpressionBasedBushingForce.getCPtr(source), source);
  }

  public String get_Fz_expression(int i) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_Fz_expression__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_Fz_expression(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedBushingForce_upd_Fz_expression__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_Fz_expression(int i, String value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_Fz_expression__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_Fz_expression(String value) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_append_Fz_expression(swigCPtr, this, value);
  }

  public void constructProperty_Fz_expression(String initValue) {
    opensimSimulationJNI.ExpressionBasedBushingForce_constructProperty_Fz_expression(swigCPtr, this, initValue);
  }

  public String get_Fz_expression() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_Fz_expression__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_Fz_expression() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedBushingForce_upd_Fz_expression__SWIG_1(swigCPtr, this), false);
  }

  public void set_Fz_expression(String value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_Fz_expression__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_visual_aspect_ratio(ExpressionBasedBushingForce source) {
    opensimSimulationJNI.ExpressionBasedBushingForce_copyProperty_visual_aspect_ratio(swigCPtr, this, ExpressionBasedBushingForce.getCPtr(source), source);
  }

  public double get_visual_aspect_ratio(int i) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_visual_aspect_ratio__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_visual_aspect_ratio(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ExpressionBasedBushingForce_upd_visual_aspect_ratio__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_visual_aspect_ratio(int i, double value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_visual_aspect_ratio__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_visual_aspect_ratio(double value) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_append_visual_aspect_ratio(swigCPtr, this, value);
  }

  public void constructProperty_visual_aspect_ratio() {
    opensimSimulationJNI.ExpressionBasedBushingForce_constructProperty_visual_aspect_ratio__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_visual_aspect_ratio(double initValue) {
    opensimSimulationJNI.ExpressionBasedBushingForce_constructProperty_visual_aspect_ratio__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_visual_aspect_ratio() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_visual_aspect_ratio__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_visual_aspect_ratio() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ExpressionBasedBushingForce_upd_visual_aspect_ratio__SWIG_1(swigCPtr, this), false);
  }

  public void set_visual_aspect_ratio(double value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_visual_aspect_ratio__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_moment_visual_scale(ExpressionBasedBushingForce source) {
    opensimSimulationJNI.ExpressionBasedBushingForce_copyProperty_moment_visual_scale(swigCPtr, this, ExpressionBasedBushingForce.getCPtr(source), source);
  }

  public double get_moment_visual_scale(int i) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_moment_visual_scale__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_moment_visual_scale(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ExpressionBasedBushingForce_upd_moment_visual_scale__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_moment_visual_scale(int i, double value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_moment_visual_scale__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_moment_visual_scale(double value) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_append_moment_visual_scale(swigCPtr, this, value);
  }

  public void constructProperty_moment_visual_scale() {
    opensimSimulationJNI.ExpressionBasedBushingForce_constructProperty_moment_visual_scale__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_moment_visual_scale(double initValue) {
    opensimSimulationJNI.ExpressionBasedBushingForce_constructProperty_moment_visual_scale__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_moment_visual_scale() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_moment_visual_scale__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_moment_visual_scale() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ExpressionBasedBushingForce_upd_moment_visual_scale__SWIG_1(swigCPtr, this), false);
  }

  public void set_moment_visual_scale(double value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_moment_visual_scale__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_force_visual_scale(ExpressionBasedBushingForce source) {
    opensimSimulationJNI.ExpressionBasedBushingForce_copyProperty_force_visual_scale(swigCPtr, this, ExpressionBasedBushingForce.getCPtr(source), source);
  }

  public double get_force_visual_scale(int i) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_force_visual_scale__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_force_visual_scale(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ExpressionBasedBushingForce_upd_force_visual_scale__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_force_visual_scale(int i, double value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_force_visual_scale__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_force_visual_scale(double value) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_append_force_visual_scale(swigCPtr, this, value);
  }

  public void constructProperty_force_visual_scale() {
    opensimSimulationJNI.ExpressionBasedBushingForce_constructProperty_force_visual_scale__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_force_visual_scale(double initValue) {
    opensimSimulationJNI.ExpressionBasedBushingForce_constructProperty_force_visual_scale__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_force_visual_scale() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_get_force_visual_scale__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_force_visual_scale() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ExpressionBasedBushingForce_upd_force_visual_scale__SWIG_1(swigCPtr, this), false);
  }

  public void set_force_visual_scale(double value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_force_visual_scale__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_rotational_damping(ExpressionBasedBushingForce source) {
    opensimSimulationJNI.ExpressionBasedBushingForce_copyProperty_rotational_damping(swigCPtr, this, ExpressionBasedBushingForce.getCPtr(source), source);
  }

  public Vec3 get_rotational_damping(int i) {
    return new Vec3(opensimSimulationJNI.ExpressionBasedBushingForce_get_rotational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_rotational_damping(int i) {
    return new Vec3(opensimSimulationJNI.ExpressionBasedBushingForce_upd_rotational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_rotational_damping(int i, Vec3 value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_rotational_damping__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_rotational_damping(Vec3 value) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_append_rotational_damping(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_rotational_damping(Vec3 initValue) {
    opensimSimulationJNI.ExpressionBasedBushingForce_constructProperty_rotational_damping(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_rotational_damping() {
    return new Vec3(opensimSimulationJNI.ExpressionBasedBushingForce_get_rotational_damping__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_rotational_damping() {
    return new Vec3(opensimSimulationJNI.ExpressionBasedBushingForce_upd_rotational_damping__SWIG_1(swigCPtr, this), false);
  }

  public void set_rotational_damping(Vec3 value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_rotational_damping__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_translational_damping(ExpressionBasedBushingForce source) {
    opensimSimulationJNI.ExpressionBasedBushingForce_copyProperty_translational_damping(swigCPtr, this, ExpressionBasedBushingForce.getCPtr(source), source);
  }

  public Vec3 get_translational_damping(int i) {
    return new Vec3(opensimSimulationJNI.ExpressionBasedBushingForce_get_translational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_translational_damping(int i) {
    return new Vec3(opensimSimulationJNI.ExpressionBasedBushingForce_upd_translational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_translational_damping(int i, Vec3 value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_translational_damping__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_translational_damping(Vec3 value) {
    return opensimSimulationJNI.ExpressionBasedBushingForce_append_translational_damping(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_translational_damping(Vec3 initValue) {
    opensimSimulationJNI.ExpressionBasedBushingForce_constructProperty_translational_damping(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_translational_damping() {
    return new Vec3(opensimSimulationJNI.ExpressionBasedBushingForce_get_translational_damping__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_translational_damping() {
    return new Vec3(opensimSimulationJNI.ExpressionBasedBushingForce_upd_translational_damping__SWIG_1(swigCPtr, this), false);
  }

  public void set_translational_damping(Vec3 value) {
    opensimSimulationJNI.ExpressionBasedBushingForce_set_translational_damping__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public ExpressionBasedBushingForce() {
    this(opensimSimulationJNI.new_ExpressionBasedBushingForce__SWIG_0(), true);
  }

  public ExpressionBasedBushingForce(String name, String frame1Name, String frame2Name) {
    this(opensimSimulationJNI.new_ExpressionBasedBushingForce__SWIG_1(name, frame1Name, frame2Name), true);
  }

  public ExpressionBasedBushingForce(String name, String frame1Name, Vec3 point1, Vec3 orientation1, String frame2Name, Vec3 point2, Vec3 orientation2) {
    this(opensimSimulationJNI.new_ExpressionBasedBushingForce__SWIG_2(name, frame1Name, Vec3.getCPtr(point1), point1, Vec3.getCPtr(orientation1), orientation1, frame2Name, Vec3.getCPtr(point2), point2, Vec3.getCPtr(orientation2), orientation2), true);
  }

  public ExpressionBasedBushingForce(String name, String frame1Name, Vec3 point1, Vec3 orientation1, String frame2Name, Vec3 point2, Vec3 orientation2, Vec3 transStiffness, Vec3 rotStiffness, Vec3 transDamping, Vec3 rotDamping) {
    this(opensimSimulationJNI.new_ExpressionBasedBushingForce__SWIG_3(name, frame1Name, Vec3.getCPtr(point1), point1, Vec3.getCPtr(orientation1), orientation1, frame2Name, Vec3.getCPtr(point2), point2, Vec3.getCPtr(orientation2), orientation2, Vec3.getCPtr(transStiffness), transStiffness, Vec3.getCPtr(rotStiffness), rotStiffness, Vec3.getCPtr(transDamping), transDamping, Vec3.getCPtr(rotDamping), rotDamping), true);
  }

  public void setMomentVisualScale(double scale) {
    opensimSimulationJNI.ExpressionBasedBushingForce_setMomentVisualScale(swigCPtr, this, scale);
  }

  public void setForceVisualScale(double scale) {
    opensimSimulationJNI.ExpressionBasedBushingForce_setForceVisualScale(swigCPtr, this, scale);
  }

  public void setVisualAspectRatio(double ratio) {
    opensimSimulationJNI.ExpressionBasedBushingForce_setVisualAspectRatio(swigCPtr, this, ratio);
  }

  public void setMxExpression(String expression) {
    opensimSimulationJNI.ExpressionBasedBushingForce_setMxExpression(swigCPtr, this, expression);
  }

  public void setMyExpression(String expression) {
    opensimSimulationJNI.ExpressionBasedBushingForce_setMyExpression(swigCPtr, this, expression);
  }

  public void setMzExpression(String expression) {
    opensimSimulationJNI.ExpressionBasedBushingForce_setMzExpression(swigCPtr, this, expression);
  }

  public void setFxExpression(String expression) {
    opensimSimulationJNI.ExpressionBasedBushingForce_setFxExpression(swigCPtr, this, expression);
  }

  public void setFyExpression(String expression) {
    opensimSimulationJNI.ExpressionBasedBushingForce_setFyExpression(swigCPtr, this, expression);
  }

  public void setFzExpression(String expression) {
    opensimSimulationJNI.ExpressionBasedBushingForce_setFzExpression(swigCPtr, this, expression);
  }

  public String getMxExpression() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_getMxExpression(swigCPtr, this);
  }

  public String getMyExpression() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_getMyExpression(swigCPtr, this);
  }

  public String getMzExpression() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_getMzExpression(swigCPtr, this);
  }

  public String getFxExpression() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_getFxExpression(swigCPtr, this);
  }

  public String getFyExpression() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_getFyExpression(swigCPtr, this);
  }

  public String getFzExpression() {
    return opensimSimulationJNI.ExpressionBasedBushingForce_getFzExpression(swigCPtr, this);
  }

  public Vec6 calcStiffnessForce(State state) {
    return new Vec6(opensimSimulationJNI.ExpressionBasedBushingForce_calcStiffnessForce(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public Vec6 calcDampingForce(State state) {
    return new Vec6(opensimSimulationJNI.ExpressionBasedBushingForce_calcDampingForce(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimSimulationJNI.ExpressionBasedBushingForce_getRecordLabels(swigCPtr, this), true);
  }

  public ArrayDouble getRecordValues(State state) {
    return new ArrayDouble(opensimSimulationJNI.ExpressionBasedBushingForce_getRecordValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

}
