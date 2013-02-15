/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MassProperties {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public MassProperties(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(MassProperties obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_MassProperties(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MassProperties() {
    this(opensimModelJNI.new_MassProperties(), true);
  }

  public boolean isExactlyMassless() {
    return opensimModelJNI.MassProperties_isExactlyMassless(swigCPtr, this);
  }

  public boolean isNearlyMassless(double tol) {
    return opensimModelJNI.MassProperties_isNearlyMassless__SWIG_0(swigCPtr, this, tol);
  }

  public boolean isNearlyMassless() {
    return opensimModelJNI.MassProperties_isNearlyMassless__SWIG_1(swigCPtr, this);
  }

  public boolean isExactlyCentral() {
    return opensimModelJNI.MassProperties_isExactlyCentral(swigCPtr, this);
  }

  public boolean isNearlyCentral(double tol) {
    return opensimModelJNI.MassProperties_isNearlyCentral__SWIG_0(swigCPtr, this, tol);
  }

  public boolean isNearlyCentral() {
    return opensimModelJNI.MassProperties_isNearlyCentral__SWIG_1(swigCPtr, this);
  }

  public boolean isNaN() {
    return opensimModelJNI.MassProperties_isNaN(swigCPtr, this);
  }

  public boolean isInf() {
    return opensimModelJNI.MassProperties_isInf(swigCPtr, this);
  }

  public boolean isFinite() {
    return opensimModelJNI.MassProperties_isFinite(swigCPtr, this);
  }

}
