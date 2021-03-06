/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Sine extends Function {
  private transient long swigCPtr;

  public Sine(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.Sine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Sine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_Sine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Sine safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.Sine_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Sine(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.Sine_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.Sine_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.Sine_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Sine(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.Sine_getConcreteClassName(swigCPtr, this);
  }

  public Sine() {
    this(opensimCommonJNI.new_Sine__SWIG_0(), true);
  }

  public Sine(double amplitude, double omega, double phase, double offset) {
    this(opensimCommonJNI.new_Sine__SWIG_1(amplitude, omega, phase, offset), true);
  }

  public Sine(double amplitude, double omega, double phase) {
    this(opensimCommonJNI.new_Sine__SWIG_2(amplitude, omega, phase), true);
  }

  public double calcValue(Vector x) {
    return opensimCommonJNI.Sine_calcValue(swigCPtr, this, Vector.getCPtr(x), x);
  }

  public double calcDerivative(StdVectorInt derivComponents, Vector x) {
    return opensimCommonJNI.Sine_calcDerivative(swigCPtr, this, StdVectorInt.getCPtr(derivComponents), derivComponents, Vector.getCPtr(x), x);
  }

  public SWIGTYPE_p_SimTK__Function createSimTKFunction() {
    long cPtr = opensimCommonJNI.Sine_createSimTKFunction(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SimTK__Function(cPtr, false);
  }

  public int getArgumentSize() {
    return opensimCommonJNI.Sine_getArgumentSize(swigCPtr, this);
  }

  public int getMaxDerivativeOrder() {
    return opensimCommonJNI.Sine_getMaxDerivativeOrder(swigCPtr, this);
  }

}
