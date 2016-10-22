/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class STOFileAdapterQuaternion {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected STOFileAdapterQuaternion(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(STOFileAdapterQuaternion obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_STOFileAdapterQuaternion(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public STOFileAdapterQuaternion() {
    this(opensimModelCommonJNI.new_STOFileAdapterQuaternion__SWIG_0(), true);
  }

  public STOFileAdapterQuaternion(STOFileAdapterQuaternion arg0) {
    this(opensimModelCommonJNI.new_STOFileAdapterQuaternion__SWIG_1(STOFileAdapterQuaternion.getCPtr(arg0), arg0), true);
  }

  public STOFileAdapterQuaternion clone() {
    long cPtr = opensimModelCommonJNI.STOFileAdapterQuaternion_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new STOFileAdapterQuaternion(cPtr, true);
  }

  public static TimeSeriesTableQuaternion read(String fileName) {
    return new TimeSeriesTableQuaternion(opensimModelCommonJNI.STOFileAdapterQuaternion_read(fileName), true);
  }

  public static void write(TimeSeriesTableQuaternion table, String fileName) {
    opensimModelCommonJNI.STOFileAdapterQuaternion_write(TimeSeriesTableQuaternion.getCPtr(table), table, fileName);
  }

}