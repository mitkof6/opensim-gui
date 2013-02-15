/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ConditionalPathPoint extends PathPoint {
  private long swigCPtr;

  public ConditionalPathPoint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ConditionalPathPoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ConditionalPathPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ConditionalPathPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ConditionalPathPoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ConditionalPathPoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ConditionalPathPoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ConditionalPathPoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ConditionalPathPoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ConditionalPathPoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ConditionalPathPoint(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ConditionalPathPoint_getConcreteClassName(swigCPtr, this);
  }

  public ConditionalPathPoint() {
    this(opensimModelJNI.new_ConditionalPathPoint__SWIG_0(), true);
  }

  public ConditionalPathPoint(ConditionalPathPoint aPoint) {
    this(opensimModelJNI.new_ConditionalPathPoint__SWIG_1(ConditionalPathPoint.getCPtr(aPoint), aPoint), true);
  }

  public void copyData(ConditionalPathPoint aPoint) {
    opensimModelJNI.ConditionalPathPoint_copyData(swigCPtr, this, ConditionalPathPoint.getCPtr(aPoint), aPoint);
  }

  public void init(PathPoint aPoint) {
    opensimModelJNI.ConditionalPathPoint_init(swigCPtr, this, PathPoint.getCPtr(aPoint), aPoint);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimModelJNI.ConditionalPathPoint_updateFromXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode) {
    opensimModelJNI.ConditionalPathPoint_updateFromXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode));
  }

  public ArrayDouble getRange() {
    return new ArrayDouble(opensimModelJNI.ConditionalPathPoint_getRange(swigCPtr, this), false);
  }

  public Coordinate getCoordinate() {
    long cPtr = opensimModelJNI.ConditionalPathPoint_getCoordinate(swigCPtr, this);
    return (cPtr == 0) ? null : new Coordinate(cPtr, false);
  }

  public String getCoordinateName() {
    return opensimModelJNI.ConditionalPathPoint_getCoordinateName(swigCPtr, this);
  }

}
