/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Ligament extends Force {
  private transient long swigCPtr;

  protected Ligament(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Ligament_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Ligament obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_Ligament(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Ligament safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Ligament_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Ligament(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Ligament_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Ligament_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Ligament_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Ligament(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Ligament_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_GeometryPath(Ligament source) {
    opensimSimulationJNI.Ligament_copyProperty_GeometryPath(swigCPtr, this, Ligament.getCPtr(source), source);
  }

  public GeometryPath get_GeometryPath(int i) {
    return new GeometryPath(opensimSimulationJNI.Ligament_get_GeometryPath__SWIG_0(swigCPtr, this, i), false);
  }

  public GeometryPath upd_GeometryPath(int i) {
    return new GeometryPath(opensimSimulationJNI.Ligament_upd_GeometryPath__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_GeometryPath(int i, GeometryPath value) {
    opensimSimulationJNI.Ligament_set_GeometryPath__SWIG_0(swigCPtr, this, i, GeometryPath.getCPtr(value), value);
  }

  public int append_GeometryPath(GeometryPath value) {
    return opensimSimulationJNI.Ligament_append_GeometryPath(swigCPtr, this, GeometryPath.getCPtr(value), value);
  }

  public void constructProperty_GeometryPath(GeometryPath initValue) {
    opensimSimulationJNI.Ligament_constructProperty_GeometryPath(swigCPtr, this, GeometryPath.getCPtr(initValue), initValue);
  }

  public GeometryPath get_GeometryPath() {
    return new GeometryPath(opensimSimulationJNI.Ligament_get_GeometryPath__SWIG_1(swigCPtr, this), false);
  }

  public GeometryPath upd_GeometryPath() {
    return new GeometryPath(opensimSimulationJNI.Ligament_upd_GeometryPath__SWIG_1(swigCPtr, this), false);
  }

  public void set_GeometryPath(GeometryPath value) {
    opensimSimulationJNI.Ligament_set_GeometryPath__SWIG_1(swigCPtr, this, GeometryPath.getCPtr(value), value);
  }

  public void copyProperty_resting_length(Ligament source) {
    opensimSimulationJNI.Ligament_copyProperty_resting_length(swigCPtr, this, Ligament.getCPtr(source), source);
  }

  public double get_resting_length(int i) {
    return opensimSimulationJNI.Ligament_get_resting_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_resting_length(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Ligament_upd_resting_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_resting_length(int i, double value) {
    opensimSimulationJNI.Ligament_set_resting_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_resting_length(double value) {
    return opensimSimulationJNI.Ligament_append_resting_length(swigCPtr, this, value);
  }

  public void constructProperty_resting_length(double initValue) {
    opensimSimulationJNI.Ligament_constructProperty_resting_length(swigCPtr, this, initValue);
  }

  public double get_resting_length() {
    return opensimSimulationJNI.Ligament_get_resting_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_resting_length() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Ligament_upd_resting_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_resting_length(double value) {
    opensimSimulationJNI.Ligament_set_resting_length__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_pcsa_force(Ligament source) {
    opensimSimulationJNI.Ligament_copyProperty_pcsa_force(swigCPtr, this, Ligament.getCPtr(source), source);
  }

  public double get_pcsa_force(int i) {
    return opensimSimulationJNI.Ligament_get_pcsa_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_pcsa_force(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Ligament_upd_pcsa_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_pcsa_force(int i, double value) {
    opensimSimulationJNI.Ligament_set_pcsa_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_pcsa_force(double value) {
    return opensimSimulationJNI.Ligament_append_pcsa_force(swigCPtr, this, value);
  }

  public void constructProperty_pcsa_force(double initValue) {
    opensimSimulationJNI.Ligament_constructProperty_pcsa_force(swigCPtr, this, initValue);
  }

  public double get_pcsa_force() {
    return opensimSimulationJNI.Ligament_get_pcsa_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_pcsa_force() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Ligament_upd_pcsa_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_pcsa_force(double value) {
    opensimSimulationJNI.Ligament_set_pcsa_force__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_force_length_curve(Ligament source) {
    opensimSimulationJNI.Ligament_copyProperty_force_length_curve(swigCPtr, this, Ligament.getCPtr(source), source);
  }

  public Function get_force_length_curve(int i) {
    return new Function(opensimSimulationJNI.Ligament_get_force_length_curve__SWIG_0(swigCPtr, this, i), false);
  }

  public Function upd_force_length_curve(int i) {
    return new Function(opensimSimulationJNI.Ligament_upd_force_length_curve__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_force_length_curve(int i, Function value) {
    opensimSimulationJNI.Ligament_set_force_length_curve__SWIG_0(swigCPtr, this, i, Function.getCPtr(value), value);
  }

  public int append_force_length_curve(Function value) {
    return opensimSimulationJNI.Ligament_append_force_length_curve(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void constructProperty_force_length_curve(Function initValue) {
    opensimSimulationJNI.Ligament_constructProperty_force_length_curve(swigCPtr, this, Function.getCPtr(initValue), initValue);
  }

  public Function get_force_length_curve() {
    return new Function(opensimSimulationJNI.Ligament_get_force_length_curve__SWIG_1(swigCPtr, this), false);
  }

  public Function upd_force_length_curve() {
    return new Function(opensimSimulationJNI.Ligament_upd_force_length_curve__SWIG_1(swigCPtr, this), false);
  }

  public void set_force_length_curve(Function value) {
    opensimSimulationJNI.Ligament_set_force_length_curve__SWIG_1(swigCPtr, this, Function.getCPtr(value), value);
  }

  public Ligament() {
    this(opensimSimulationJNI.new_Ligament(), true);
  }

  public GeometryPath getGeometryPath() {
    return new GeometryPath(opensimSimulationJNI.Ligament_getGeometryPath(swigCPtr, this), false);
  }

  public GeometryPath updGeometryPath() {
    return new GeometryPath(opensimSimulationJNI.Ligament_updGeometryPath(swigCPtr, this), false);
  }

  public boolean hasGeometryPath() {
    return opensimSimulationJNI.Ligament_hasGeometryPath(swigCPtr, this);
  }

  public double getLength(State s) {
    return opensimSimulationJNI.Ligament_getLength(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getRestingLength() {
    return opensimSimulationJNI.Ligament_getRestingLength(swigCPtr, this);
  }

  public boolean setRestingLength(double aRestingLength) {
    return opensimSimulationJNI.Ligament_setRestingLength(swigCPtr, this, aRestingLength);
  }

  public double getMaxIsometricForce() {
    return opensimSimulationJNI.Ligament_getMaxIsometricForce(swigCPtr, this);
  }

  public boolean setMaxIsometricForce(double aMaxIsometricForce) {
    return opensimSimulationJNI.Ligament_setMaxIsometricForce(swigCPtr, this, aMaxIsometricForce);
  }

  public Function getForceLengthCurve() {
    return new Function(opensimSimulationJNI.Ligament_getForceLengthCurve(swigCPtr, this), false);
  }

  public boolean setForceLengthCurve(Function aForceLengthCurve) {
    return opensimSimulationJNI.Ligament_setForceLengthCurve(swigCPtr, this, Function.getCPtr(aForceLengthCurve), aForceLengthCurve);
  }

  public double getTension(State s) {
    return opensimSimulationJNI.Ligament_getTension(swigCPtr, this, State.getCPtr(s), s);
  }

  public double computeMomentArm(State s, Coordinate aCoord) {
    return opensimSimulationJNI.Ligament_computeMomentArm(swigCPtr, this, State.getCPtr(s), s, Coordinate.getCPtr(aCoord), aCoord);
  }

  public void computeForce(State s, VectorOfSpatialVec bodyForces, Vector generalizedForces) {
    opensimSimulationJNI.Ligament_computeForce(swigCPtr, this, State.getCPtr(s), s, VectorOfSpatialVec.getCPtr(bodyForces), bodyForces, Vector.getCPtr(generalizedForces), generalizedForces);
  }

  public void extendPostScale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.Ligament_extendPostScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

}
