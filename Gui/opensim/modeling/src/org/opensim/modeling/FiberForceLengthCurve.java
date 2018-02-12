/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class FiberForceLengthCurve extends Function {
  private transient long swigCPtr;

  protected FiberForceLengthCurve(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.FiberForceLengthCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FiberForceLengthCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_FiberForceLengthCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static FiberForceLengthCurve safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.FiberForceLengthCurve_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new FiberForceLengthCurve(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.FiberForceLengthCurve_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.FiberForceLengthCurve_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.FiberForceLengthCurve_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new FiberForceLengthCurve(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.FiberForceLengthCurve_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_strain_at_zero_force(FiberForceLengthCurve source) {
    opensimSimulationJNI.FiberForceLengthCurve_copyProperty_strain_at_zero_force(swigCPtr, this, FiberForceLengthCurve.getCPtr(source), source);
  }

  public double get_strain_at_zero_force(int i) {
    return opensimSimulationJNI.FiberForceLengthCurve_get_strain_at_zero_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_strain_at_zero_force(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_strain_at_zero_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_strain_at_zero_force(int i, double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_strain_at_zero_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_strain_at_zero_force(double value) {
    return opensimSimulationJNI.FiberForceLengthCurve_append_strain_at_zero_force(swigCPtr, this, value);
  }

  public void constructProperty_strain_at_zero_force(double initValue) {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_strain_at_zero_force(swigCPtr, this, initValue);
  }

  public double get_strain_at_zero_force() {
    return opensimSimulationJNI.FiberForceLengthCurve_get_strain_at_zero_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_strain_at_zero_force() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_strain_at_zero_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_strain_at_zero_force(double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_strain_at_zero_force__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_strain_at_one_norm_force(FiberForceLengthCurve source) {
    opensimSimulationJNI.FiberForceLengthCurve_copyProperty_strain_at_one_norm_force(swigCPtr, this, FiberForceLengthCurve.getCPtr(source), source);
  }

  public double get_strain_at_one_norm_force(int i) {
    return opensimSimulationJNI.FiberForceLengthCurve_get_strain_at_one_norm_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_strain_at_one_norm_force(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_strain_at_one_norm_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_strain_at_one_norm_force(int i, double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_strain_at_one_norm_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_strain_at_one_norm_force(double value) {
    return opensimSimulationJNI.FiberForceLengthCurve_append_strain_at_one_norm_force(swigCPtr, this, value);
  }

  public void constructProperty_strain_at_one_norm_force(double initValue) {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_strain_at_one_norm_force(swigCPtr, this, initValue);
  }

  public double get_strain_at_one_norm_force() {
    return opensimSimulationJNI.FiberForceLengthCurve_get_strain_at_one_norm_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_strain_at_one_norm_force() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_strain_at_one_norm_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_strain_at_one_norm_force(double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_strain_at_one_norm_force__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_stiffness_at_low_force(FiberForceLengthCurve source) {
    opensimSimulationJNI.FiberForceLengthCurve_copyProperty_stiffness_at_low_force(swigCPtr, this, FiberForceLengthCurve.getCPtr(source), source);
  }

  public double get_stiffness_at_low_force(int i) {
    return opensimSimulationJNI.FiberForceLengthCurve_get_stiffness_at_low_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_stiffness_at_low_force(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_stiffness_at_low_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_stiffness_at_low_force(int i, double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_stiffness_at_low_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_stiffness_at_low_force(double value) {
    return opensimSimulationJNI.FiberForceLengthCurve_append_stiffness_at_low_force(swigCPtr, this, value);
  }

  public void constructProperty_stiffness_at_low_force() {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_stiffness_at_low_force__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_stiffness_at_low_force(double initValue) {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_stiffness_at_low_force__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_stiffness_at_low_force() {
    return opensimSimulationJNI.FiberForceLengthCurve_get_stiffness_at_low_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_stiffness_at_low_force() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_stiffness_at_low_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_stiffness_at_low_force(double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_stiffness_at_low_force__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_stiffness_at_one_norm_force(FiberForceLengthCurve source) {
    opensimSimulationJNI.FiberForceLengthCurve_copyProperty_stiffness_at_one_norm_force(swigCPtr, this, FiberForceLengthCurve.getCPtr(source), source);
  }

  public double get_stiffness_at_one_norm_force(int i) {
    return opensimSimulationJNI.FiberForceLengthCurve_get_stiffness_at_one_norm_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_stiffness_at_one_norm_force(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_stiffness_at_one_norm_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_stiffness_at_one_norm_force(int i, double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_stiffness_at_one_norm_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_stiffness_at_one_norm_force(double value) {
    return opensimSimulationJNI.FiberForceLengthCurve_append_stiffness_at_one_norm_force(swigCPtr, this, value);
  }

  public void constructProperty_stiffness_at_one_norm_force() {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_stiffness_at_one_norm_force__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_stiffness_at_one_norm_force(double initValue) {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_stiffness_at_one_norm_force__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_stiffness_at_one_norm_force() {
    return opensimSimulationJNI.FiberForceLengthCurve_get_stiffness_at_one_norm_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_stiffness_at_one_norm_force() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_stiffness_at_one_norm_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_stiffness_at_one_norm_force(double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_stiffness_at_one_norm_force__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_curviness(FiberForceLengthCurve source) {
    opensimSimulationJNI.FiberForceLengthCurve_copyProperty_curviness(swigCPtr, this, FiberForceLengthCurve.getCPtr(source), source);
  }

  public double get_curviness(int i) {
    return opensimSimulationJNI.FiberForceLengthCurve_get_curviness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_curviness(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_curviness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_curviness(int i, double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_curviness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_curviness(double value) {
    return opensimSimulationJNI.FiberForceLengthCurve_append_curviness(swigCPtr, this, value);
  }

  public void constructProperty_curviness() {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_curviness__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_curviness(double initValue) {
    opensimSimulationJNI.FiberForceLengthCurve_constructProperty_curviness__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_curviness() {
    return opensimSimulationJNI.FiberForceLengthCurve_get_curviness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_curviness() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FiberForceLengthCurve_upd_curviness__SWIG_1(swigCPtr, this), false);
  }

  public void set_curviness(double value) {
    opensimSimulationJNI.FiberForceLengthCurve_set_curviness__SWIG_1(swigCPtr, this, value);
  }

  public FiberForceLengthCurve() {
    this(opensimSimulationJNI.new_FiberForceLengthCurve__SWIG_0(), true);
  }

  public FiberForceLengthCurve(double strainAtZeroForce, double strainAtOneNormForce, double stiffnessAtLowForce, double stiffnessAtOneNormForce, double curviness) {
    this(opensimSimulationJNI.new_FiberForceLengthCurve__SWIG_1(strainAtZeroForce, strainAtOneNormForce, stiffnessAtLowForce, stiffnessAtOneNormForce, curviness), true);
  }

  public double getStrainAtZeroForce() {
    return opensimSimulationJNI.FiberForceLengthCurve_getStrainAtZeroForce(swigCPtr, this);
  }

  public double getStrainAtOneNormForce() {
    return opensimSimulationJNI.FiberForceLengthCurve_getStrainAtOneNormForce(swigCPtr, this);
  }

  public double getStiffnessAtLowForceInUse() {
    return opensimSimulationJNI.FiberForceLengthCurve_getStiffnessAtLowForceInUse(swigCPtr, this);
  }

  public double getStiffnessAtOneNormForceInUse() {
    return opensimSimulationJNI.FiberForceLengthCurve_getStiffnessAtOneNormForceInUse(swigCPtr, this);
  }

  public double getCurvinessInUse() {
    return opensimSimulationJNI.FiberForceLengthCurve_getCurvinessInUse(swigCPtr, this);
  }

  public boolean isFittedCurveBeingUsed() {
    return opensimSimulationJNI.FiberForceLengthCurve_isFittedCurveBeingUsed(swigCPtr, this);
  }

  public void setCurveStrains(double aStrainAtZeroForce, double aStrainAtOneNormForce) {
    opensimSimulationJNI.FiberForceLengthCurve_setCurveStrains(swigCPtr, this, aStrainAtZeroForce, aStrainAtOneNormForce);
  }

  public void setOptionalProperties(double stiffnessAtLowForce, double stiffnessAtOneNormForce, double curviness) {
    opensimSimulationJNI.FiberForceLengthCurve_setOptionalProperties(swigCPtr, this, stiffnessAtLowForce, stiffnessAtOneNormForce, curviness);
  }

  public double calcValue(Vector x) {
    return opensimSimulationJNI.FiberForceLengthCurve_calcValue__SWIG_0(swigCPtr, this, Vector.getCPtr(x), x);
  }

  public double calcValue(double normFiberLength) {
    return opensimSimulationJNI.FiberForceLengthCurve_calcValue__SWIG_1(swigCPtr, this, normFiberLength);
  }

  public double calcDerivative(double normFiberLength, int order) {
    return opensimSimulationJNI.FiberForceLengthCurve_calcDerivative__SWIG_0(swigCPtr, this, normFiberLength, order);
  }

  public double calcDerivative(StdVectorInt derivComponents, Vector x) {
    return opensimSimulationJNI.FiberForceLengthCurve_calcDerivative__SWIG_1(swigCPtr, this, StdVectorInt.getCPtr(derivComponents), derivComponents, Vector.getCPtr(x), x);
  }

  public double calcIntegral(double normFiberLength) {
    return opensimSimulationJNI.FiberForceLengthCurve_calcIntegral(swigCPtr, this, normFiberLength);
  }

  public Vec2 getCurveDomain() {
    return new Vec2(opensimSimulationJNI.FiberForceLengthCurve_getCurveDomain(swigCPtr, this), true);
  }

  public void printMuscleCurveToCSVFile(String path) {
    opensimSimulationJNI.FiberForceLengthCurve_printMuscleCurveToCSVFile(swigCPtr, this, path);
  }

  public void ensureCurveUpToDate() {
    opensimSimulationJNI.FiberForceLengthCurve_ensureCurveUpToDate(swigCPtr, this);
  }

}
