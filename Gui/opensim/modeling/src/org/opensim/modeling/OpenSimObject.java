/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class OpenSimObject {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public OpenSimObject(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(OpenSimObject obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_OpenSimObject(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof OpenSimObject)
      equal = (((OpenSimObject)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  private int cacheId=-1;  // cache the Id to avoid recomputation for hashing purposes
 
  public int hashCode() {
     if (cacheId==-1)
        cacheId=(int)swigCPtr;
     
    return( cacheId );
  }
  // Flag to indicate if an object is pickable in the GUI
  // Example of a non-pickable object would be a PathWrapPoint
  private boolean pickable=true;
  
  public boolean isPickable() {
	 return pickable;
  }
  
  public void setPickable(boolean onOff) {
	 pickable=onOff;
  }
  public void markAdopted() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) swigCMemOwn = false;
    }
  }  


  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.OpenSimObject_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.OpenSimObject_getConcreteClassName(swigCPtr, this);
  }

  public VisibleObject getDisplayer() {
    long cPtr = opensimModelJNI.OpenSimObject_getDisplayer(swigCPtr, this);
    return (cPtr == 0) ? null : new VisibleObject(cPtr, false);
  }

  public VisibleObject updDisplayer() {
    long cPtr = opensimModelJNI.OpenSimObject_updDisplayer(swigCPtr, this);
    return (cPtr == 0) ? null : new VisibleObject(cPtr, false);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimModelJNI.OpenSimObject_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public void setName(String name) {
    opensimModelJNI.OpenSimObject_setName(swigCPtr, this, name);
  }

  public String getName() {
    return opensimModelJNI.OpenSimObject_getName(swigCPtr, this);
  }

  public void setDescription(String description) {
    opensimModelJNI.OpenSimObject_setDescription(swigCPtr, this, description);
  }

  public String getDescription() {
    return opensimModelJNI.OpenSimObject_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimModelJNI.OpenSimObject_getAuthors(swigCPtr, this);
  }

  public void setAuthors(String authors) {
    opensimModelJNI.OpenSimObject_setAuthors(swigCPtr, this, authors);
  }

  public String getReferences() {
    return opensimModelJNI.OpenSimObject_getReferences(swigCPtr, this);
  }

  public void setReferences(String references) {
    opensimModelJNI.OpenSimObject_setReferences(swigCPtr, this, references);
  }

  public int getNumProperties() {
    return opensimModelJNI.OpenSimObject_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimModelJNI.OpenSimObject_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public AbstractProperty updPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimModelJNI.OpenSimObject_updPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimModelJNI.OpenSimObject_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimModelJNI.OpenSimObject_getPropertyByName(swigCPtr, this, name), false);
  }

  public AbstractProperty updPropertyByName(String name) {
    return new AbstractProperty(opensimModelJNI.OpenSimObject_updPropertyByName(swigCPtr, this, name), false);
  }

  public void setObjectIsUpToDateWithProperties() {
    opensimModelJNI.OpenSimObject_setObjectIsUpToDateWithProperties(swigCPtr, this);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimModelJNI.OpenSimObject_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public static void PrintPropertyInfo(SWIGTYPE_p_std__ostream os, String classNameDotPropertyName) {
    opensimModelJNI.OpenSimObject_PrintPropertyInfo__SWIG_0(SWIGTYPE_p_std__ostream.getCPtr(os), classNameDotPropertyName);
  }

  public static void PrintPropertyInfo(SWIGTYPE_p_std__ostream os, String className, String propertyName) {
    opensimModelJNI.OpenSimObject_PrintPropertyInfo__SWIG_1(SWIGTYPE_p_std__ostream.getCPtr(os), className, propertyName);
  }

  public static void registerType(OpenSimObject defaultObject) {
    opensimModelJNI.OpenSimObject_registerType(OpenSimObject.getCPtr(defaultObject), defaultObject);
  }

  public static void renameType(String oldTypeName, String newTypeName) {
    opensimModelJNI.OpenSimObject_renameType(oldTypeName, newTypeName);
  }

  public static OpenSimObject getDefaultInstanceOfType(String concreteClassName) {
    long cPtr = opensimModelJNI.OpenSimObject_getDefaultInstanceOfType(concreteClassName);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public static OpenSimObject newInstanceOfType(String concreteClassName) {
    long cPtr = opensimModelJNI.OpenSimObject_newInstanceOfType(concreteClassName);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public static void getRegisteredTypenames(ArrayStr typeNames) {
    opensimModelJNI.OpenSimObject_getRegisteredTypenames(ArrayStr.getCPtr(typeNames), typeNames);
  }

  public static OpenSimObject makeObjectFromFile(String fileName) {
    long cPtr = opensimModelJNI.OpenSimObject_makeObjectFromFile(fileName);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public void readObjectFromXMLNodeOrFile(SWIGTYPE_p_SimTK__Xml__Element objectElement, int versionNumber) {
    opensimModelJNI.OpenSimObject_readObjectFromXMLNodeOrFile(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(objectElement), versionNumber);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element objectElement, int versionNumber) {
    opensimModelJNI.OpenSimObject_updateFromXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(objectElement), versionNumber);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimModelJNI.OpenSimObject_updateXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimModelJNI.OpenSimObject_getInlined(swigCPtr, this);
  }

  public void setInlined(boolean aInlined, String aFileName) {
    opensimModelJNI.OpenSimObject_setInlined__SWIG_0(swigCPtr, this, aInlined, aFileName);
  }

  public void setInlined(boolean aInlined) {
    opensimModelJNI.OpenSimObject_setInlined__SWIG_1(swigCPtr, this, aInlined);
  }

  public String getDocumentFileName() {
    return opensimModelJNI.OpenSimObject_getDocumentFileName(swigCPtr, this);
  }

  public void setAllPropertiesUseDefault(boolean aUseDefault) {
    opensimModelJNI.OpenSimObject_setAllPropertiesUseDefault(swigCPtr, this, aUseDefault);
  }

  public boolean print(String fileName) {
    return opensimModelJNI.OpenSimObject_print(swigCPtr, this, fileName);
  }

  public String dump(boolean dumpName) {
    return opensimModelJNI.OpenSimObject_dump__SWIG_0(swigCPtr, this, dumpName);
  }

  public String dump() {
    return opensimModelJNI.OpenSimObject_dump__SWIG_1(swigCPtr, this);
  }

  public static String getClassName() {
    return opensimModelJNI.OpenSimObject_getClassName();
  }

  public static void setSerializeAllDefaults(boolean shouldSerializeDefaults) {
    opensimModelJNI.OpenSimObject_setSerializeAllDefaults(shouldSerializeDefaults);
  }

  public static boolean getSerializeAllDefaults() {
    return opensimModelJNI.OpenSimObject_getSerializeAllDefaults();
  }

  public void clearObjectIsUpToDateWithProperties() {
    opensimModelJNI.OpenSimObject_clearObjectIsUpToDateWithProperties(swigCPtr, this);
  }

  public static boolean isKindOf(String type) {
    return opensimModelJNI.OpenSimObject_isKindOf(type);
  }

  public boolean isA(String type) {
    return opensimModelJNI.OpenSimObject_isA(swigCPtr, this, type);
  }

  public static void setDebugLevel(int newLevel) {
    opensimModelJNI.OpenSimObject_setDebugLevel(newLevel);
  }

  public static int getDebugLevel() {
    return opensimModelJNI.OpenSimObject_getDebugLevel();
  }

  public String toString() {
    return opensimModelJNI.OpenSimObject_toString(swigCPtr, this);
  }

  public SWIGTYPE_p_PropertySet getPropertySet() {
    return new SWIGTYPE_p_PropertySet(opensimModelJNI.OpenSimObject_getPropertySet(swigCPtr, this), false);
  }

  public static OpenSimObject SafeCopy(OpenSimObject aObject) {
    long cPtr = opensimModelJNI.OpenSimObject_SafeCopy(OpenSimObject.getCPtr(aObject), aObject);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public static void RegisterType(OpenSimObject defaultObject) {
    opensimModelJNI.OpenSimObject_RegisterType(OpenSimObject.getCPtr(defaultObject), defaultObject);
  }

  public static void RenameType(String oldName, String newName) {
    opensimModelJNI.OpenSimObject_RenameType(oldName, newName);
  }

  public static ArrayStr getFunctionClassNames() {
    return new ArrayStr(opensimModelJNI.OpenSimObject_getFunctionClassNames(), true);
  }

}
