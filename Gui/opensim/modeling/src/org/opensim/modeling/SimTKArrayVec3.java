/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SimTKArrayVec3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SimTKArrayVec3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SimTKArrayVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_SimTKArrayVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SimTKArrayVec3() {
    this(opensimSimbodyJNI.new_SimTKArrayVec3__SWIG_0(), true);
  }

  public SimTKArrayVec3(long n) {
    this(opensimSimbodyJNI.new_SimTKArrayVec3__SWIG_1(n), true);
  }

  public SimTKArrayVec3(long n, Vec3 initVal) {
    this(opensimSimbodyJNI.new_SimTKArrayVec3__SWIG_2(n, Vec3.getCPtr(initVal), initVal), true);
  }

  public SimTKArrayVec3(SimTKArrayVec3 src) {
    this(opensimSimbodyJNI.new_SimTKArrayVec3__SWIG_3(SimTKArrayVec3.getCPtr(src), src), true);
  }

  public SimTKArrayVec3(Vec3 first, Vec3 last1, DontCopy arg2) {
    this(opensimSimbodyJNI.new_SimTKArrayVec3__SWIG_4(Vec3.getCPtr(first), first, Vec3.getCPtr(last1), last1, DontCopy.getCPtr(arg2), arg2), true);
  }

  public SimTKArrayVec3 deallocate() {
    return new SimTKArrayVec3(opensimSimbodyJNI.SimTKArrayVec3_deallocate(swigCPtr, this), false);
  }

  public void assign(long n, Vec3 fillValue) {
    opensimSimbodyJNI.SimTKArrayVec3_assign(swigCPtr, this, n, Vec3.getCPtr(fillValue), fillValue);
  }

  public void fill(Vec3 fillValue) {
    opensimSimbodyJNI.SimTKArrayVec3_fill(swigCPtr, this, Vec3.getCPtr(fillValue), fillValue);
  }

  public void swap(SimTKArrayVec3 other) {
    opensimSimbodyJNI.SimTKArrayVec3_swap(swigCPtr, this, SimTKArrayVec3.getCPtr(other), other);
  }

  public SimTKArrayVec3 adoptData(Vec3 newData, long dataSize, long dataCapacity) {
    return new SimTKArrayVec3(opensimSimbodyJNI.SimTKArrayVec3_adoptData__SWIG_0(swigCPtr, this, Vec3.getCPtr(newData), newData, dataSize, dataCapacity), false);
  }

  public SimTKArrayVec3 adoptData(Vec3 newData, long dataSize) {
    return new SimTKArrayVec3(opensimSimbodyJNI.SimTKArrayVec3_adoptData__SWIG_1(swigCPtr, this, Vec3.getCPtr(newData), newData, dataSize), false);
  }

  public SimTKArrayVec3 shareData(Vec3 newData, long dataSize) {
    return new SimTKArrayVec3(opensimSimbodyJNI.SimTKArrayVec3_shareData__SWIG_0(swigCPtr, this, Vec3.getCPtr(newData), newData, dataSize), false);
  }

  public SimTKArrayVec3 shareData(Vec3 first, Vec3 last1) {
    return new SimTKArrayVec3(opensimSimbodyJNI.SimTKArrayVec3_shareData__SWIG_1(swigCPtr, this, Vec3.getCPtr(first), first, Vec3.getCPtr(last1), last1), false);
  }

  public long size() {
    return opensimSimbodyJNI.SimTKArrayVec3_size(swigCPtr, this);
  }

  public long max_size() {
    return opensimSimbodyJNI.SimTKArrayVec3_max_size(swigCPtr, this);
  }

  public boolean empty() {
    return opensimSimbodyJNI.SimTKArrayVec3_empty(swigCPtr, this);
  }

  public long capacity() {
    return opensimSimbodyJNI.SimTKArrayVec3_capacity(swigCPtr, this);
  }

  public void resize(long n) {
    opensimSimbodyJNI.SimTKArrayVec3_resize__SWIG_0(swigCPtr, this, n);
  }

  public void resize(long n, Vec3 initVal) {
    opensimSimbodyJNI.SimTKArrayVec3_resize__SWIG_1(swigCPtr, this, n, Vec3.getCPtr(initVal), initVal);
  }

  public void reserve(long n) {
    opensimSimbodyJNI.SimTKArrayVec3_reserve(swigCPtr, this, n);
  }

  public void shrink_to_fit() {
    opensimSimbodyJNI.SimTKArrayVec3_shrink_to_fit(swigCPtr, this);
  }

  public long allocated() {
    return opensimSimbodyJNI.SimTKArrayVec3_allocated(swigCPtr, this);
  }

  public boolean isOwner() {
    return opensimSimbodyJNI.SimTKArrayVec3_isOwner(swigCPtr, this);
  }

  public Vec3 cbegin() {
    long cPtr = opensimSimbodyJNI.SimTKArrayVec3_cbegin(swigCPtr, this);
    return (cPtr == 0) ? null : new Vec3(cPtr, false);
  }

  public Vec3 begin() {
    long cPtr = opensimSimbodyJNI.SimTKArrayVec3_begin__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new Vec3(cPtr, false);
  }

  public Vec3 cend() {
    long cPtr = opensimSimbodyJNI.SimTKArrayVec3_cend(swigCPtr, this);
    return (cPtr == 0) ? null : new Vec3(cPtr, false);
  }

  public Vec3 end() {
    long cPtr = opensimSimbodyJNI.SimTKArrayVec3_end__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new Vec3(cPtr, false);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_SimTK__VecT_3_double_1_t_const_p_t crbegin() {
    return new SWIGTYPE_p_std__reverse_iteratorT_SimTK__VecT_3_double_1_t_const_p_t(opensimSimbodyJNI.SimTKArrayVec3_crbegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_SimTK__VecT_3_double_1_t_const_p_t rbegin() {
    return new SWIGTYPE_p_std__reverse_iteratorT_SimTK__VecT_3_double_1_t_const_p_t(opensimSimbodyJNI.SimTKArrayVec3_rbegin__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_SimTK__VecT_3_double_1_t_const_p_t crend() {
    return new SWIGTYPE_p_std__reverse_iteratorT_SimTK__VecT_3_double_1_t_const_p_t(opensimSimbodyJNI.SimTKArrayVec3_crend(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_SimTK__VecT_3_double_1_t_const_p_t rend() {
    return new SWIGTYPE_p_std__reverse_iteratorT_SimTK__VecT_3_double_1_t_const_p_t(opensimSimbodyJNI.SimTKArrayVec3_rend__SWIG_0(swigCPtr, this), true);
  }

  public Vec3 cdata() {
    long cPtr = opensimSimbodyJNI.SimTKArrayVec3_cdata(swigCPtr, this);
    return (cPtr == 0) ? null : new Vec3(cPtr, false);
  }

  public Vec3 data() {
    long cPtr = opensimSimbodyJNI.SimTKArrayVec3_data__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new Vec3(cPtr, false);
  }

  public Vec3 at(long i) {
    return new Vec3(opensimSimbodyJNI.SimTKArrayVec3_at__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 getElt(long i) {
    return new Vec3(opensimSimbodyJNI.SimTKArrayVec3_getElt(swigCPtr, this, i), false);
  }

  public Vec3 updElt(long i) {
    return new Vec3(opensimSimbodyJNI.SimTKArrayVec3_updElt(swigCPtr, this, i), false);
  }

  public Vec3 front() {
    return new Vec3(opensimSimbodyJNI.SimTKArrayVec3_front__SWIG_0(swigCPtr, this), false);
  }

  public Vec3 back() {
    return new Vec3(opensimSimbodyJNI.SimTKArrayVec3_back__SWIG_0(swigCPtr, this), false);
  }

  public void push_back(Vec3 value) {
    opensimSimbodyJNI.SimTKArrayVec3_push_back__SWIG_0(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void push_back() {
    opensimSimbodyJNI.SimTKArrayVec3_push_back__SWIG_1(swigCPtr, this);
  }

  public Vec3 raw_push_back() {
    long cPtr = opensimSimbodyJNI.SimTKArrayVec3_raw_push_back(swigCPtr, this);
    return (cPtr == 0) ? null : new Vec3(cPtr, false);
  }

  public void pop_back() {
    opensimSimbodyJNI.SimTKArrayVec3_pop_back(swigCPtr, this);
  }

  public Vec3 erase(Vec3 first, Vec3 last1) {
    long cPtr = opensimSimbodyJNI.SimTKArrayVec3_erase__SWIG_0(swigCPtr, this, Vec3.getCPtr(first), first, Vec3.getCPtr(last1), last1);
    return (cPtr == 0) ? null : new Vec3(cPtr, false);
  }

  public Vec3 erase(Vec3 p) {
    long cPtr = opensimSimbodyJNI.SimTKArrayVec3_erase__SWIG_1(swigCPtr, this, Vec3.getCPtr(p), p);
    return (cPtr == 0) ? null : new Vec3(cPtr, false);
  }

  public Vec3 eraseFast(Vec3 p) {
    long cPtr = opensimSimbodyJNI.SimTKArrayVec3_eraseFast(swigCPtr, this, Vec3.getCPtr(p), p);
    return (cPtr == 0) ? null : new Vec3(cPtr, false);
  }

  public void clear() {
    opensimSimbodyJNI.SimTKArrayVec3_clear(swigCPtr, this);
  }

  public Vec3 insert(Vec3 p, long n, Vec3 value) {
    long cPtr = opensimSimbodyJNI.SimTKArrayVec3_insert__SWIG_0(swigCPtr, this, Vec3.getCPtr(p), p, n, Vec3.getCPtr(value), value);
    return (cPtr == 0) ? null : new Vec3(cPtr, false);
  }

  public Vec3 insert(Vec3 p, Vec3 value) {
    long cPtr = opensimSimbodyJNI.SimTKArrayVec3_insert__SWIG_1(swigCPtr, this, Vec3.getCPtr(p), p, Vec3.getCPtr(value), value);
    return (cPtr == 0) ? null : new Vec3(cPtr, false);
  }

}
