/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MarkerSet extends ModelComponentSetMarkers {
  private transient long swigCPtr;

  protected MarkerSet(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.MarkerSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MarkerSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_MarkerSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MarkerSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.MarkerSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MarkerSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.MarkerSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.MarkerSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.MarkerSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MarkerSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.MarkerSet_getConcreteClassName(swigCPtr, this);
  }

  public MarkerSet() {
    this(opensimSimulationJNI.new_MarkerSet__SWIG_0(), true);
  }

  public MarkerSet(Model aModel, String aMarkersFileName) throws java.io.IOException {
    this(opensimSimulationJNI.new_MarkerSet__SWIG_1(Model.getCPtr(aModel), aModel, aMarkersFileName), true);
  }

  public MarkerSet(MarkerSet aMarkerSet) {
    this(opensimSimulationJNI.new_MarkerSet__SWIG_2(MarkerSet.getCPtr(aMarkerSet), aMarkerSet), true);
  }

  public void getMarkerNames(ArrayStr aMarkerNamesArray) {
    opensimSimulationJNI.MarkerSet_getMarkerNames(swigCPtr, this, ArrayStr.getCPtr(aMarkerNamesArray), aMarkerNamesArray);
  }

  public void addNamePrefix(String prefix) {
    opensimSimulationJNI.MarkerSet_addNamePrefix(swigCPtr, this, prefix);
  }

}
