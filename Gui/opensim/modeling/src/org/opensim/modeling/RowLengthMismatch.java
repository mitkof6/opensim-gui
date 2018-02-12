/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class RowLengthMismatch extends IOError {
  private transient long swigCPtr;

  protected RowLengthMismatch(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.RowLengthMismatch_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RowLengthMismatch obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_RowLengthMismatch(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RowLengthMismatch(String file, long line, String func, String filename, long line_num, long expected, long received) {
    this(opensimCommonJNI.new_RowLengthMismatch(file, line, func, filename, line_num, expected, received), true);
  }

}
