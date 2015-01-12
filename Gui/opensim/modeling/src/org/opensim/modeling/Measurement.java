/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Measurement extends OpenSimObject {
  private long swigCPtr;

  public Measurement(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Measurement_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Measurement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Measurement(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Measurement safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Measurement_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Measurement(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Measurement_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Measurement_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Measurement_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Measurement(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Measurement_getConcreteClassName(swigCPtr, this);
  }

  public Measurement() {
    this(opensimModelJNI.new_Measurement__SWIG_0(), true);
  }

  public Measurement(Measurement aMeasurement) {
    this(opensimModelJNI.new_Measurement__SWIG_1(Measurement.getCPtr(aMeasurement), aMeasurement), true);
  }

  public void copyData(Measurement aMeasurement) {
    opensimModelJNI.Measurement_copyData(swigCPtr, this, Measurement.getCPtr(aMeasurement), aMeasurement);
  }

  public BodyScaleSet getBodyScaleSet() {
    return new BodyScaleSet(opensimModelJNI.Measurement_getBodyScaleSet(swigCPtr, this), false);
  }

  public MarkerPairSet getMarkerPairSet() {
    return new MarkerPairSet(opensimModelJNI.Measurement_getMarkerPairSet(swigCPtr, this), false);
  }

  public int getNumMarkerPairs() {
    return opensimModelJNI.Measurement_getNumMarkerPairs(swigCPtr, this);
  }

  public MarkerPair getMarkerPair(int aIndex) {
    return new MarkerPair(opensimModelJNI.Measurement_getMarkerPair(swigCPtr, this, aIndex), false);
  }

  public boolean getApply() {
    return opensimModelJNI.Measurement_getApply(swigCPtr, this);
  }

  public void setApply(boolean aApply) {
    opensimModelJNI.Measurement_setApply(swigCPtr, this, aApply);
  }

  public void applyScaleFactor(double aFactor, ScaleSet aScaleSet) {
    opensimModelJNI.Measurement_applyScaleFactor(swigCPtr, this, aFactor, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

  public static void registerTypes() {
    opensimModelJNI.Measurement_registerTypes();
  }

}