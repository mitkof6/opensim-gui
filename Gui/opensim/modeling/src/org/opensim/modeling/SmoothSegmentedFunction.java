/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SmoothSegmentedFunction {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public SmoothSegmentedFunction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SmoothSegmentedFunction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_SmoothSegmentedFunction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SmoothSegmentedFunction() {
    this(opensimModelJNI.new_SmoothSegmentedFunction(), true);
  }

  public double calcValue(double x) {
    return opensimModelJNI.SmoothSegmentedFunction_calcValue(swigCPtr, this, x);
  }

  public double calcDerivative(double x, int order) {
    return opensimModelJNI.SmoothSegmentedFunction_calcDerivative(swigCPtr, this, x, order);
  }

  public double calcIntegral(double x) {
    return opensimModelJNI.SmoothSegmentedFunction_calcIntegral(swigCPtr, this, x);
  }

  public boolean isIntegralAvailable() {
    return opensimModelJNI.SmoothSegmentedFunction_isIntegralAvailable(swigCPtr, this);
  }

  public boolean isIntegralComputedLeftToRight() {
    return opensimModelJNI.SmoothSegmentedFunction_isIntegralComputedLeftToRight(swigCPtr, this);
  }

  public String getName() {
    return opensimModelJNI.SmoothSegmentedFunction_getName(swigCPtr, this);
  }

  public void setName(SWIGTYPE_p_std__string name) {
    opensimModelJNI.SmoothSegmentedFunction_setName(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(name));
  }

  public SWIGTYPE_p_SimTK__VecT_2_double_1_t getCurveDomain() {
    return new SWIGTYPE_p_SimTK__VecT_2_double_1_t(opensimModelJNI.SmoothSegmentedFunction_getCurveDomain(swigCPtr, this), true);
  }

  public void printMuscleCurveToCSVFile(String path, double domainMin, double domainMax) {
    opensimModelJNI.SmoothSegmentedFunction_printMuscleCurveToCSVFile(swigCPtr, this, path, domainMin, domainMax);
  }

  public Matrix calcSampledMuscleCurve(int maxOrder, double domainMin, double domainMax) {
    return new Matrix(opensimModelJNI.SmoothSegmentedFunction_calcSampledMuscleCurve(swigCPtr, this, maxOrder, domainMin, domainMax), true);
  }

}
