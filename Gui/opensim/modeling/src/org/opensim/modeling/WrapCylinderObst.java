/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WrapCylinderObst extends WrapObject {
  private transient long swigCPtr;

  public WrapCylinderObst(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.WrapCylinderObst_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapCylinderObst obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_WrapCylinderObst(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapCylinderObst safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.WrapCylinderObst_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapCylinderObst(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.WrapCylinderObst_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.WrapCylinderObst_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.WrapCylinderObst_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapCylinderObst(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.WrapCylinderObst_getConcreteClassName(swigCPtr, this);
  }

  public void copyData(WrapCylinderObst aWrapCylinderObst) {
    opensimModelSimulationJNI.WrapCylinderObst_copyData(swigCPtr, this, WrapCylinderObst.getCPtr(aWrapCylinderObst), aWrapCylinderObst);
  }

  public double getRadius() {
    return opensimModelSimulationJNI.WrapCylinderObst_getRadius(swigCPtr, this);
  }

  public void setRadius(double aRadius) {
    opensimModelSimulationJNI.WrapCylinderObst_setRadius(swigCPtr, this, aRadius);
  }

  public double getLength() {
    return opensimModelSimulationJNI.WrapCylinderObst_getLength(swigCPtr, this);
  }

  public void setLength(double aLength) {
    opensimModelSimulationJNI.WrapCylinderObst_setLength(swigCPtr, this, aLength);
  }

  public int getWrapDirection() {
    return opensimModelSimulationJNI.WrapCylinderObst_getWrapDirection(swigCPtr, this);
  }

  public String getWrapTypeName() {
    return opensimModelSimulationJNI.WrapCylinderObst_getWrapTypeName(swigCPtr, this);
  }

  public String getDimensionsString() {
    return opensimModelSimulationJNI.WrapCylinderObst_getDimensionsString(swigCPtr, this);
  }

  public void scale(Vec3 aScaleFactors) {
    opensimModelSimulationJNI.WrapCylinderObst_scale(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public void connectToModelAndBody(Model aModel, PhysicalFrame aBody) {
    opensimModelSimulationJNI.WrapCylinderObst_connectToModelAndBody(swigCPtr, this, Model.getCPtr(aModel), aModel, PhysicalFrame.getCPtr(aBody), aBody);
  }

}
