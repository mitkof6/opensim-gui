/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetConstraints extends OpenSimObject {
  private transient long swigCPtr;

  protected SetConstraints(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.SetConstraints_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SetConstraints obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_SetConstraints(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetConstraints safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.SetConstraints_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetConstraints(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.SetConstraints_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.SetConstraints_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.SetConstraints_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetConstraints(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.SetConstraints_getConcreteClassName(swigCPtr, this);
  }

  public SetConstraints() {
    this(opensimSimulationJNI.new_SetConstraints__SWIG_0(), true);
  }

  public SetConstraints(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimSimulationJNI.new_SetConstraints__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetConstraints(String aFileName) {
    this(opensimSimulationJNI.new_SetConstraints__SWIG_2(aFileName), true);
  }

  public SetConstraints(SetConstraints aSet) {
    this(opensimSimulationJNI.new_SetConstraints__SWIG_3(SetConstraints.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimSimulationJNI.SetConstraints_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimSimulationJNI.SetConstraints_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimSimulationJNI.SetConstraints_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimSimulationJNI.SetConstraints_getSize(swigCPtr, this);
  }

  public int getIndex(Constraint aObject, int aStartIndex) {
    return opensimSimulationJNI.SetConstraints_getIndex__SWIG_0(swigCPtr, this, Constraint.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Constraint aObject) {
    return opensimSimulationJNI.SetConstraints_getIndex__SWIG_1(swigCPtr, this, Constraint.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimSimulationJNI.SetConstraints_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimSimulationJNI.SetConstraints_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimSimulationJNI.SetConstraints_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(Constraint aObject) {
    return opensimSimulationJNI.SetConstraints_adoptAndAppend(swigCPtr, this, Constraint.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(Constraint aObject) {
    return opensimSimulationJNI.SetConstraints_cloneAndAppend(swigCPtr, this, Constraint.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Constraint aObject) {
    return opensimSimulationJNI.SetConstraints_insert(swigCPtr, this, aIndex, Constraint.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimSimulationJNI.SetConstraints_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Constraint aObject) {
    return opensimSimulationJNI.SetConstraints_remove__SWIG_1(swigCPtr, this, Constraint.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimSimulationJNI.SetConstraints_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Constraint aObject, boolean preserveGroups) {
    return opensimSimulationJNI.SetConstraints_set__SWIG_0(swigCPtr, this, aIndex, Constraint.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Constraint aObject) {
    return opensimSimulationJNI.SetConstraints_set__SWIG_1(swigCPtr, this, aIndex, Constraint.getCPtr(aObject), aObject);
  }

  public Constraint get(int aIndex) {
    return new Constraint(opensimSimulationJNI.SetConstraints_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Constraint get(String aName) {
    return new Constraint(opensimSimulationJNI.SetConstraints_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimSimulationJNI.SetConstraints_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimSimulationJNI.SetConstraints_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimSimulationJNI.SetConstraints_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimSimulationJNI.SetConstraints_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimSimulationJNI.SetConstraints_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimSimulationJNI.SetConstraints_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimSimulationJNI.SetConstraints_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimSimulationJNI.SetConstraints_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimSimulationJNI.SetConstraints_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimSimulationJNI.SetConstraints_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
