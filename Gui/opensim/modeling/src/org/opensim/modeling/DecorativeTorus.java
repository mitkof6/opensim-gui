/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DecorativeTorus extends DecorativeGeometry {
  private transient long swigCPtr;

  protected DecorativeTorus(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.DecorativeTorus_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DecorativeTorus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_DecorativeTorus(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DecorativeTorus(double torusR, double tubeR) {
    this(opensimSimbodyJNI.new_DecorativeTorus__SWIG_0(torusR, tubeR), true);
  }

  public DecorativeTorus(double torusR) {
    this(opensimSimbodyJNI.new_DecorativeTorus__SWIG_1(torusR), true);
  }

  public DecorativeTorus() {
    this(opensimSimbodyJNI.new_DecorativeTorus__SWIG_2(), true);
  }

  public DecorativeTorus setTorusRadius(double arg0) {
    return new DecorativeTorus(opensimSimbodyJNI.DecorativeTorus_setTorusRadius(swigCPtr, this, arg0), false);
  }

  public DecorativeTorus setTubeRadius(double arg0) {
    return new DecorativeTorus(opensimSimbodyJNI.DecorativeTorus_setTubeRadius(swigCPtr, this, arg0), false);
  }

  public double getTorusRadius() {
    return opensimSimbodyJNI.DecorativeTorus_getTorusRadius(swigCPtr, this);
  }

  public double getTubeRadius() {
    return opensimSimbodyJNI.DecorativeTorus_getTubeRadius(swigCPtr, this);
  }

  public DecorativeTorus setBodyId(int b) {
    return new DecorativeTorus(opensimSimbodyJNI.DecorativeTorus_setBodyId(swigCPtr, this, b), false);
  }

  public DecorativeTorus setIndexOnBody(int x) {
    return new DecorativeTorus(opensimSimbodyJNI.DecorativeTorus_setIndexOnBody(swigCPtr, this, x), false);
  }

  public DecorativeTorus setUserRef(SWIGTYPE_p_void p) {
    return new DecorativeTorus(opensimSimbodyJNI.DecorativeTorus_setUserRef(swigCPtr, this, SWIGTYPE_p_void.getCPtr(p)), false);
  }

  public DecorativeTorus setTransform(Transform X_BD) {
    return new DecorativeTorus(opensimSimbodyJNI.DecorativeTorus_setTransform(swigCPtr, this, Transform.getCPtr(X_BD), X_BD), false);
  }

  public DecorativeTorus setResolution(double r) {
    return new DecorativeTorus(opensimSimbodyJNI.DecorativeTorus_setResolution(swigCPtr, this, r), false);
  }

  public DecorativeTorus setScaleFactors(Vec3 s) {
    return new DecorativeTorus(opensimSimbodyJNI.DecorativeTorus_setScaleFactors(swigCPtr, this, Vec3.getCPtr(s), s), false);
  }

  public DecorativeTorus setColor(Vec3 rgb) {
    return new DecorativeTorus(opensimSimbodyJNI.DecorativeTorus_setColor(swigCPtr, this, Vec3.getCPtr(rgb), rgb), false);
  }

  public DecorativeTorus setOpacity(double o) {
    return new DecorativeTorus(opensimSimbodyJNI.DecorativeTorus_setOpacity(swigCPtr, this, o), false);
  }

  public DecorativeTorus setLineThickness(double t) {
    return new DecorativeTorus(opensimSimbodyJNI.DecorativeTorus_setLineThickness(swigCPtr, this, t), false);
  }

  public DecorativeTorus setRepresentation(DecorativeGeometry.Representation r) {
    return new DecorativeTorus(opensimSimbodyJNI.DecorativeTorus_setRepresentation(swigCPtr, this, r.swigValue()), false);
  }

  public DecorativeTorus clone() {
    long cPtr = opensimSimbodyJNI.DecorativeTorus_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new DecorativeTorus(cPtr, false);
  }

}
