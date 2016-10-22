/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TimeSeriesTableVec6 extends DataTableVec6 {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected TimeSeriesTableVec6(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.TimeSeriesTableVec6_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TimeSeriesTableVec6 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimModelCommonJNI.delete_TimeSeriesTableVec6(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TimeSeriesTableVec6() {
    this(opensimModelCommonJNI.new_TimeSeriesTableVec6__SWIG_0(), true);
  }

  public TimeSeriesTableVec6(TimeSeriesTableVec6 arg0) {
    this(opensimModelCommonJNI.new_TimeSeriesTableVec6__SWIG_1(TimeSeriesTableVec6.getCPtr(arg0), arg0), true);
  }

  public TimeSeriesTableVec6(DataTableVec6 datatable) {
    this(opensimModelCommonJNI.new_TimeSeriesTableVec6__SWIG_2(DataTableVec6.getCPtr(datatable), datatable), true);
  }

  public TimeSeriesTableVec6(String filename) {
    this(opensimModelCommonJNI.new_TimeSeriesTableVec6__SWIG_3(filename), true);
  }

  public TimeSeriesTableVec6(String filename, String tablename) {
    this(opensimModelCommonJNI.new_TimeSeriesTableVec6__SWIG_4(filename, tablename), true);
  }

}