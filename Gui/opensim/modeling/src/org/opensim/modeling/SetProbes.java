/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetProbes extends OpenSimObject {
  private long swigCPtr;

  public SetProbes(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.SetProbes_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetProbes obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_SetProbes(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetProbes safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.SetProbes_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetProbes(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.SetProbes_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.SetProbes_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.SetProbes_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetProbes(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.SetProbes_getConcreteClassName(swigCPtr, this);
  }

  public SetProbes() {
    this(opensimModelJNI.new_SetProbes__SWIG_0(), true);
  }

  public SetProbes(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_SetProbes__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetProbes(String aFileName) {
    this(opensimModelJNI.new_SetProbes__SWIG_2(aFileName), true);
  }

  public SetProbes(SetProbes aSet) {
    this(opensimModelJNI.new_SetProbes__SWIG_3(SetProbes.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimModelJNI.SetProbes_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelJNI.SetProbes_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimModelJNI.SetProbes_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelJNI.SetProbes_getSize(swigCPtr, this);
  }

  public int getIndex(Probe aObject, int aStartIndex) {
    return opensimModelJNI.SetProbes_getIndex__SWIG_0(swigCPtr, this, Probe.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Probe aObject) {
    return opensimModelJNI.SetProbes_getIndex__SWIG_1(swigCPtr, this, Probe.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelJNI.SetProbes_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelJNI.SetProbes_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimModelJNI.SetProbes_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(Probe aObject) {
    return opensimModelJNI.SetProbes_adoptAndAppend(swigCPtr, this, Probe.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(Probe aObject) {
    return opensimModelJNI.SetProbes_cloneAndAppend(swigCPtr, this, Probe.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Probe aObject) {
    return opensimModelJNI.SetProbes_insert(swigCPtr, this, aIndex, Probe.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelJNI.SetProbes_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Probe aObject) {
    return opensimModelJNI.SetProbes_remove__SWIG_1(swigCPtr, this, Probe.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimModelJNI.SetProbes_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Probe aObject, boolean preserveGroups) {
    return opensimModelJNI.SetProbes_set__SWIG_0(swigCPtr, this, aIndex, Probe.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Probe aObject) {
    return opensimModelJNI.SetProbes_set__SWIG_1(swigCPtr, this, aIndex, Probe.getCPtr(aObject), aObject);
  }

  public Probe get(int aIndex) {
    return new Probe(opensimModelJNI.SetProbes_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Probe get(String aName) {
    return new Probe(opensimModelJNI.SetProbes_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimModelJNI.SetProbes_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimModelJNI.SetProbes_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimModelJNI.SetProbes_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimModelJNI.SetProbes_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimModelJNI.SetProbes_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimModelJNI.SetProbes_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimModelJNI.SetProbes_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimModelJNI.SetProbes_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimModelJNI.SetProbes_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimModelJNI.SetProbes_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}