/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class StdMapStringAbstractDataTable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StdMapStringAbstractDataTable(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StdMapStringAbstractDataTable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_StdMapStringAbstractDataTable(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StdMapStringAbstractDataTable() {
    this(opensimCommonJNI.new_StdMapStringAbstractDataTable__SWIG_0(), true);
  }

  public StdMapStringAbstractDataTable(StdMapStringAbstractDataTable arg0) {
    this(opensimCommonJNI.new_StdMapStringAbstractDataTable__SWIG_1(StdMapStringAbstractDataTable.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return opensimCommonJNI.StdMapStringAbstractDataTable_size(swigCPtr, this);
  }

  public boolean empty() {
    return opensimCommonJNI.StdMapStringAbstractDataTable_empty(swigCPtr, this);
  }

  public void clear() {
    opensimCommonJNI.StdMapStringAbstractDataTable_clear(swigCPtr, this);
  }

  public AbstractDataTable get(String key) {
    long cPtr = opensimCommonJNI.StdMapStringAbstractDataTable_get(swigCPtr, this, key);
    return (cPtr == 0) ? null : new AbstractDataTable(cPtr, true);
  }

  public void set(String key, AbstractDataTable x) {
    opensimCommonJNI.StdMapStringAbstractDataTable_set(swigCPtr, this, key, AbstractDataTable.getCPtr(x), x);
  }

  public void del(String key) {
    opensimCommonJNI.StdMapStringAbstractDataTable_del(swigCPtr, this, key);
  }

  public boolean has_key(String key) {
    return opensimCommonJNI.StdMapStringAbstractDataTable_has_key(swigCPtr, this, key);
  }

}
