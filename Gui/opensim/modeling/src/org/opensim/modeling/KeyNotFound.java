/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class KeyNotFound extends OpenSimException {
  private transient long swigCPtr;

  protected KeyNotFound(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.KeyNotFound_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(KeyNotFound obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_KeyNotFound(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public KeyNotFound(String file, long line, String func, String key) {
    this(opensimCommonJNI.new_KeyNotFound(file, line, func, key), true);
  }

}
