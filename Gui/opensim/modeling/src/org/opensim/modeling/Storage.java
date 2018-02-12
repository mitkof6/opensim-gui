/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Storage extends StorageInterface {
  private transient long swigCPtr;

  protected Storage(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.Storage_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Storage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_Storage(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Storage safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.Storage_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.Storage_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.Storage_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.Storage_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.Storage_getConcreteClassName(swigCPtr, this);
  }

  public static void setDEFAULT_HEADER_TOKEN(String value) {
    opensimCommonJNI.Storage_DEFAULT_HEADER_TOKEN_set(value);
  }

  public static String getDEFAULT_HEADER_TOKEN() {
    return opensimCommonJNI.Storage_DEFAULT_HEADER_TOKEN_get();
  }

  public static void setDEFAULT_HEADER_SEPARATOR(String value) {
    opensimCommonJNI.Storage_DEFAULT_HEADER_SEPARATOR_set(value);
  }

  public static String getDEFAULT_HEADER_SEPARATOR() {
    return opensimCommonJNI.Storage_DEFAULT_HEADER_SEPARATOR_get();
  }

  public static int getMAX_RESAMPLE_SIZE() {
    return opensimCommonJNI.Storage_MAX_RESAMPLE_SIZE_get();
  }

  public Storage(int aCapacity, String aName) {
    this(opensimCommonJNI.new_Storage__SWIG_0(aCapacity, aName), true);
  }

  public Storage(int aCapacity) {
    this(opensimCommonJNI.new_Storage__SWIG_1(aCapacity), true);
  }

  public Storage() {
    this(opensimCommonJNI.new_Storage__SWIG_2(), true);
  }

  public Storage(String aFileName, boolean readHeadersOnly) throws java.io.IOException {
    this(opensimCommonJNI.new_Storage__SWIG_3(aFileName, readHeadersOnly), true);
  }

  public Storage(String aFileName) throws java.io.IOException {
    this(opensimCommonJNI.new_Storage__SWIG_4(aFileName), true);
  }

  public Storage(Storage aStorage, boolean aCopyData) {
    this(opensimCommonJNI.new_Storage__SWIG_5(Storage.getCPtr(aStorage), aStorage, aCopyData), true);
  }

  public Storage(Storage aStorage) {
    this(opensimCommonJNI.new_Storage__SWIG_6(Storage.getCPtr(aStorage), aStorage), true);
  }

  public Storage(Storage aStorage, int aStateIndex, int aN, String aDelimiter) {
    this(opensimCommonJNI.new_Storage__SWIG_7(Storage.getCPtr(aStorage), aStorage, aStateIndex, aN, aDelimiter), true);
  }

  public Storage(Storage aStorage, int aStateIndex, int aN) {
    this(opensimCommonJNI.new_Storage__SWIG_8(Storage.getCPtr(aStorage), aStorage, aStateIndex, aN), true);
  }

  public String getName() {
    return opensimCommonJNI.Storage_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimCommonJNI.Storage_getDescription(swigCPtr, this);
  }

  public void setName(String aName) {
    opensimCommonJNI.Storage_setName(swigCPtr, this, aName);
  }

  public void setDescription(String aDescription) {
    opensimCommonJNI.Storage_setDescription(swigCPtr, this, aDescription);
  }

  public static int getLatestVersion() {
    return opensimCommonJNI.Storage_getLatestVersion();
  }

  public int getFileVersion() {
    return opensimCommonJNI.Storage_getFileVersion(swigCPtr, this);
  }

  public int getSize() {
    return opensimCommonJNI.Storage_getSize(swigCPtr, this);
  }

  public int getSmallestNumberOfStates() {
    return opensimCommonJNI.Storage_getSmallestNumberOfStates(swigCPtr, this);
  }

  public StateVector getStateVector(int aTimeIndex) {
    long cPtr = opensimCommonJNI.Storage_getStateVector(swigCPtr, this, aTimeIndex);
    return (cPtr == 0) ? null : new StateVector(cPtr, false);
  }

  public StateVector getLastStateVector() {
    long cPtr = opensimCommonJNI.Storage_getLastStateVector(swigCPtr, this);
    return (cPtr == 0) ? null : new StateVector(cPtr, false);
  }

  public double getFirstTime() {
    return opensimCommonJNI.Storage_getFirstTime(swigCPtr, this);
  }

  public double getLastTime() {
    return opensimCommonJNI.Storage_getLastTime(swigCPtr, this);
  }

  public double getMinTimeStep() {
    return opensimCommonJNI.Storage_getMinTimeStep(swigCPtr, this);
  }

  public boolean getTime(int aTimeIndex, SWIGTYPE_p_double rTime, int aStateIndex) {
    return opensimCommonJNI.Storage_getTime__SWIG_0(swigCPtr, this, aTimeIndex, SWIGTYPE_p_double.getCPtr(rTime), aStateIndex);
  }

  public boolean getTime(int aTimeIndex, SWIGTYPE_p_double rTime) {
    return opensimCommonJNI.Storage_getTime__SWIG_1(swigCPtr, this, aTimeIndex, SWIGTYPE_p_double.getCPtr(rTime));
  }

  public int getTimeColumn(SWIGTYPE_p_p_double rTimes, int aStateIndex) {
    return opensimCommonJNI.Storage_getTimeColumn__SWIG_0(swigCPtr, this, SWIGTYPE_p_p_double.getCPtr(rTimes), aStateIndex);
  }

  public int getTimeColumn(SWIGTYPE_p_p_double rTimes) {
    return opensimCommonJNI.Storage_getTimeColumn__SWIG_1(swigCPtr, this, SWIGTYPE_p_p_double.getCPtr(rTimes));
  }

  public int getTimeColumn(ArrayDouble rTimes, int aStateIndex) {
    return opensimCommonJNI.Storage_getTimeColumn__SWIG_2(swigCPtr, this, ArrayDouble.getCPtr(rTimes), rTimes, aStateIndex);
  }

  public int getTimeColumn(ArrayDouble rTimes) {
    return opensimCommonJNI.Storage_getTimeColumn__SWIG_3(swigCPtr, this, ArrayDouble.getCPtr(rTimes), rTimes);
  }

  public void getTimeColumnWithStartTime(ArrayDouble rTimes, double startTime) {
    opensimCommonJNI.Storage_getTimeColumnWithStartTime__SWIG_0(swigCPtr, this, ArrayDouble.getCPtr(rTimes), rTimes, startTime);
  }

  public void getTimeColumnWithStartTime(ArrayDouble rTimes) {
    opensimCommonJNI.Storage_getTimeColumnWithStartTime__SWIG_1(swigCPtr, this, ArrayDouble.getCPtr(rTimes), rTimes);
  }

  public void addKeyValuePair(String aKey, String aValue) {
    opensimCommonJNI.Storage_addKeyValuePair(swigCPtr, this, aKey, aValue);
  }

  public void getValueForKey(String aKey, SWIGTYPE_p_std__string rValue) {
    opensimCommonJNI.Storage_getValueForKey(swigCPtr, this, aKey, SWIGTYPE_p_std__string.getCPtr(rValue));
  }

  public boolean hasKey(String aKey) {
    return opensimCommonJNI.Storage_hasKey(swigCPtr, this, aKey);
  }

  public boolean isInDegrees() {
    return opensimCommonJNI.Storage_isInDegrees(swigCPtr, this);
  }

  public void setInDegrees(boolean isInDegrees) {
    opensimCommonJNI.Storage_setInDegrees(swigCPtr, this, isInDegrees);
  }

  public int getData(int aTimeIndex, int aStateIndex, SWIGTYPE_p_double rValue) {
    return opensimCommonJNI.Storage_getData__SWIG_0(swigCPtr, this, aTimeIndex, aStateIndex, SWIGTYPE_p_double.getCPtr(rValue));
  }

  public int getData(int aTimeIndex, int aStateIndex, int aN, SWIGTYPE_p_p_double rData) {
    return opensimCommonJNI.Storage_getData__SWIG_1(swigCPtr, this, aTimeIndex, aStateIndex, aN, SWIGTYPE_p_p_double.getCPtr(rData));
  }

  public int getDataAtTime(double aTime, int aN, SWIGTYPE_p_p_double rData) {
    return opensimCommonJNI.Storage_getDataAtTime__SWIG_0(swigCPtr, this, aTime, aN, SWIGTYPE_p_p_double.getCPtr(rData));
  }

  public int getDataAtTime(double aTime, int aN, SWIGTYPE_p_double rData) {
    return opensimCommonJNI.Storage_getDataAtTime__SWIG_1(swigCPtr, this, aTime, aN, SWIGTYPE_p_double.getCPtr(rData));
  }

  public int getDataAtTime(double aTime, int aN, ArrayDouble rData) {
    return opensimCommonJNI.Storage_getDataAtTime__SWIG_2(swigCPtr, this, aTime, aN, ArrayDouble.getCPtr(rData), rData);
  }

  public int getDataAtTime(double aTime, int aN, Vector v) {
    return opensimCommonJNI.Storage_getDataAtTime__SWIG_3(swigCPtr, this, aTime, aN, Vector.getCPtr(v), v);
  }

  public int getDataColumn(int aStateIndex, SWIGTYPE_p_p_double rData) {
    return opensimCommonJNI.Storage_getDataColumn__SWIG_0(swigCPtr, this, aStateIndex, SWIGTYPE_p_p_double.getCPtr(rData));
  }

  public int getDataColumn(int aStateIndex, ArrayDouble rData) {
    return opensimCommonJNI.Storage_getDataColumn__SWIG_1(swigCPtr, this, aStateIndex, ArrayDouble.getCPtr(rData), rData);
  }

  public void setDataColumnToFixedValue(String columnName, double newValue) {
    opensimCommonJNI.Storage_setDataColumnToFixedValue(swigCPtr, this, columnName, newValue);
  }

  public void setDataColumn(int aStateIndex, ArrayDouble aData) {
    opensimCommonJNI.Storage_setDataColumn(swigCPtr, this, aStateIndex, ArrayDouble.getCPtr(aData), aData);
  }

  public int getDataColumn(String columnName, SWIGTYPE_p_p_double rData) {
    return opensimCommonJNI.Storage_getDataColumn__SWIG_2(swigCPtr, this, columnName, SWIGTYPE_p_p_double.getCPtr(rData));
  }

  public void getDataColumn(String columnName, ArrayDouble data, double startTime) {
    opensimCommonJNI.Storage_getDataColumn__SWIG_3(swigCPtr, this, columnName, ArrayDouble.getCPtr(data), data, startTime);
  }

  public void getDataColumn(String columnName, ArrayDouble data) {
    opensimCommonJNI.Storage_getDataColumn__SWIG_4(swigCPtr, this, columnName, ArrayDouble.getCPtr(data), data);
  }

  public SWIGTYPE_p_TimeSeriesTable exportToTable() {
    return new SWIGTYPE_p_TimeSeriesTable(opensimCommonJNI.Storage_exportToTable(swigCPtr, this), true);
  }

  public ArrayInt getColumnIndicesForIdentifier(String identifier) {
    return new ArrayInt(opensimCommonJNI.Storage_getColumnIndicesForIdentifier(swigCPtr, this, identifier), true);
  }

  public void setStepInterval(int aStepInterval) {
    opensimCommonJNI.Storage_setStepInterval(swigCPtr, this, aStepInterval);
  }

  public int getStepInterval() {
    return opensimCommonJNI.Storage_getStepInterval(swigCPtr, this);
  }

  public void setCapacityIncrement(int aIncrement) {
    opensimCommonJNI.Storage_setCapacityIncrement(swigCPtr, this, aIncrement);
  }

  public int getCapacityIncrement() {
    return opensimCommonJNI.Storage_getCapacityIncrement(swigCPtr, this);
  }

  public void setWriteSIMMHeader(boolean aTrueFalse) {
    opensimCommonJNI.Storage_setWriteSIMMHeader(swigCPtr, this, aTrueFalse);
  }

  public boolean getWriteSIMMHeader() {
    return opensimCommonJNI.Storage_getWriteSIMMHeader(swigCPtr, this);
  }

  public void setHeaderToken(String aToken) {
    opensimCommonJNI.Storage_setHeaderToken(swigCPtr, this, aToken);
  }

  public String getHeaderToken() {
    return opensimCommonJNI.Storage_getHeaderToken(swigCPtr, this);
  }

  public int getStateIndex(String aColumnName, int startIndex) {
    return opensimCommonJNI.Storage_getStateIndex__SWIG_0(swigCPtr, this, aColumnName, startIndex);
  }

  public int getStateIndex(String aColumnName) {
    return opensimCommonJNI.Storage_getStateIndex__SWIG_1(swigCPtr, this, aColumnName);
  }

  public void setColumnLabels(ArrayStr aColumnLabels) {
    opensimCommonJNI.Storage_setColumnLabels(swigCPtr, this, ArrayStr.getCPtr(aColumnLabels), aColumnLabels);
  }

  public ArrayStr getColumnLabels() {
    return new ArrayStr(opensimCommonJNI.Storage_getColumnLabels(swigCPtr, this), false);
  }

  public int reset(int aIndex) {
    return opensimCommonJNI.Storage_reset__SWIG_0(swigCPtr, this, aIndex);
  }

  public int reset() {
    return opensimCommonJNI.Storage_reset__SWIG_1(swigCPtr, this);
  }

  public int reset(double aTime) {
    return opensimCommonJNI.Storage_reset__SWIG_2(swigCPtr, this, aTime);
  }

  public void purge() {
    opensimCommonJNI.Storage_purge(swigCPtr, this);
  }

  public void crop(double newStartTime, double newFinalTime) {
    opensimCommonJNI.Storage_crop(swigCPtr, this, newStartTime, newFinalTime);
  }

  public int append(StateVector aVec, boolean aCheckForDuplicateTime) {
    return opensimCommonJNI.Storage_append__SWIG_0(swigCPtr, this, StateVector.getCPtr(aVec), aVec, aCheckForDuplicateTime);
  }

  public int append(StateVector aVec) {
    return opensimCommonJNI.Storage_append__SWIG_1(swigCPtr, this, StateVector.getCPtr(aVec), aVec);
  }

  public int append(ArrayStateVector aArray) {
    return opensimCommonJNI.Storage_append__SWIG_2(swigCPtr, this, ArrayStateVector.getCPtr(aArray), aArray);
  }

  public int append(double aT, int aN, SWIGTYPE_p_double aY, boolean aCheckForDuplicateTime) {
    return opensimCommonJNI.Storage_append__SWIG_3(swigCPtr, this, aT, aN, SWIGTYPE_p_double.getCPtr(aY), aCheckForDuplicateTime);
  }

  public int append(double aT, int aN, SWIGTYPE_p_double aY) {
    return opensimCommonJNI.Storage_append__SWIG_4(swigCPtr, this, aT, aN, SWIGTYPE_p_double.getCPtr(aY));
  }

  public int append(double aT, Vector aY, boolean aCheckForDuplicateTime) {
    return opensimCommonJNI.Storage_append__SWIG_5(swigCPtr, this, aT, Vector.getCPtr(aY), aY, aCheckForDuplicateTime);
  }

  public int append(double aT, Vector aY) {
    return opensimCommonJNI.Storage_append__SWIG_6(swigCPtr, this, aT, Vector.getCPtr(aY), aY);
  }

  public int append(double aT, ArrayDouble aY, boolean aCheckForDuplicateTime) {
    return opensimCommonJNI.Storage_append__SWIG_7(swigCPtr, this, aT, ArrayDouble.getCPtr(aY), aY, aCheckForDuplicateTime);
  }

  public int append(double aT, ArrayDouble aY) {
    return opensimCommonJNI.Storage_append__SWIG_8(swigCPtr, this, aT, ArrayDouble.getCPtr(aY), aY);
  }

  public int append(double aT, Vec3 aY, boolean aCheckForDuplicateTime) {
    return opensimCommonJNI.Storage_append__SWIG_9(swigCPtr, this, aT, Vec3.getCPtr(aY), aY, aCheckForDuplicateTime);
  }

  public int append(double aT, Vec3 aY) {
    return opensimCommonJNI.Storage_append__SWIG_10(swigCPtr, this, aT, Vec3.getCPtr(aY), aY);
  }

  public int store(int aStep, double aT, int aN, SWIGTYPE_p_double aY) {
    return opensimCommonJNI.Storage_store(swigCPtr, this, aStep, aT, aN, SWIGTYPE_p_double.getCPtr(aY));
  }

  public void shiftTime(double aValue) {
    opensimCommonJNI.Storage_shiftTime(swigCPtr, this, aValue);
  }

  public void scaleTime(double aValue) {
    opensimCommonJNI.Storage_scaleTime(swigCPtr, this, aValue);
  }

  public void add(double aValue) {
    opensimCommonJNI.Storage_add__SWIG_0(swigCPtr, this, aValue);
  }

  public void add(Vector values) {
    opensimCommonJNI.Storage_add__SWIG_1(swigCPtr, this, Vector.getCPtr(values), values);
  }

  public void add(int aN, double aValue) {
    opensimCommonJNI.Storage_add__SWIG_2(swigCPtr, this, aN, aValue);
  }

  public void add(StateVector aStateVector) {
    opensimCommonJNI.Storage_add__SWIG_3(swigCPtr, this, StateVector.getCPtr(aStateVector), aStateVector);
  }

  public void add(Storage aStorage) {
    opensimCommonJNI.Storage_add__SWIG_4(swigCPtr, this, Storage.getCPtr(aStorage), aStorage);
  }

  public void subtract(double aValue) {
    opensimCommonJNI.Storage_subtract__SWIG_0(swigCPtr, this, aValue);
  }

  public void subtract(Vector values) {
    opensimCommonJNI.Storage_subtract__SWIG_1(swigCPtr, this, Vector.getCPtr(values), values);
  }

  public void subtract(StateVector aStateVector) {
    opensimCommonJNI.Storage_subtract__SWIG_2(swigCPtr, this, StateVector.getCPtr(aStateVector), aStateVector);
  }

  public void subtract(Storage aStorage) {
    opensimCommonJNI.Storage_subtract__SWIG_3(swigCPtr, this, Storage.getCPtr(aStorage), aStorage);
  }

  public void multiply(double aValue) {
    opensimCommonJNI.Storage_multiply__SWIG_0(swigCPtr, this, aValue);
  }

  public void multiplyColumn(int aIndex, double aValue) {
    opensimCommonJNI.Storage_multiplyColumn(swigCPtr, this, aIndex, aValue);
  }

  public void multiply(Vector values) {
    opensimCommonJNI.Storage_multiply__SWIG_1(swigCPtr, this, Vector.getCPtr(values), values);
  }

  public void multiply(StateVector aStateVector) {
    opensimCommonJNI.Storage_multiply__SWIG_2(swigCPtr, this, StateVector.getCPtr(aStateVector), aStateVector);
  }

  public void multiply(Storage aStorage) {
    opensimCommonJNI.Storage_multiply__SWIG_3(swigCPtr, this, Storage.getCPtr(aStorage), aStorage);
  }

  public void divide(double aValue) {
    opensimCommonJNI.Storage_divide__SWIG_0(swigCPtr, this, aValue);
  }

  public void divide(Vector values) {
    opensimCommonJNI.Storage_divide__SWIG_1(swigCPtr, this, Vector.getCPtr(values), values);
  }

  public void divide(StateVector aStateVector) {
    opensimCommonJNI.Storage_divide__SWIG_2(swigCPtr, this, StateVector.getCPtr(aStateVector), aStateVector);
  }

  public void divide(Storage aStorage) {
    opensimCommonJNI.Storage_divide__SWIG_3(swigCPtr, this, Storage.getCPtr(aStorage), aStorage);
  }

  public Storage integrate(int aI1, int aI2) {
    long cPtr = opensimCommonJNI.Storage_integrate__SWIG_0(swigCPtr, this, aI1, aI2);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage integrate(int aI1) {
    long cPtr = opensimCommonJNI.Storage_integrate__SWIG_1(swigCPtr, this, aI1);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage integrate() {
    long cPtr = opensimCommonJNI.Storage_integrate__SWIG_2(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage integrate(double aT1, double aT2) {
    long cPtr = opensimCommonJNI.Storage_integrate__SWIG_3(swigCPtr, this, aT1, aT2);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public int computeArea(int aN, SWIGTYPE_p_double aArea) {
    return opensimCommonJNI.Storage_computeArea__SWIG_0(swigCPtr, this, aN, SWIGTYPE_p_double.getCPtr(aArea));
  }

  public int computeArea(double aTI, double aTF, int aN, SWIGTYPE_p_double aArea) {
    return opensimCommonJNI.Storage_computeArea__SWIG_1(swigCPtr, this, aTI, aTF, aN, SWIGTYPE_p_double.getCPtr(aArea));
  }

  public int computeAverage(int aN, SWIGTYPE_p_double aAve) {
    return opensimCommonJNI.Storage_computeAverage__SWIG_0(swigCPtr, this, aN, SWIGTYPE_p_double.getCPtr(aAve));
  }

  public int computeAverage(double aTI, double aTF, int aN, SWIGTYPE_p_double aAve) {
    return opensimCommonJNI.Storage_computeAverage__SWIG_1(swigCPtr, this, aTI, aTF, aN, SWIGTYPE_p_double.getCPtr(aAve));
  }

  public void pad(int aPadSize) {
    opensimCommonJNI.Storage_pad(swigCPtr, this, aPadSize);
  }

  public void smoothSpline(int order, double cutoffFrequency) {
    opensimCommonJNI.Storage_smoothSpline(swigCPtr, this, order, cutoffFrequency);
  }

  public void lowpassIIR(double cutoffFrequency) {
    opensimCommonJNI.Storage_lowpassIIR(swigCPtr, this, cutoffFrequency);
  }

  public void lowpassFIR(int order, double cutoffFrequency) {
    opensimCommonJNI.Storage_lowpassFIR(swigCPtr, this, order, cutoffFrequency);
  }

  public void addToRdStorage(Storage rStorage, double aStartTime, double aEndTime) {
    opensimCommonJNI.Storage_addToRdStorage(swigCPtr, this, Storage.getCPtr(rStorage), rStorage, aStartTime, aEndTime);
  }

  public int findIndex(double aT) {
    return opensimCommonJNI.Storage_findIndex__SWIG_0(swigCPtr, this, aT);
  }

  public int findIndex(int aI, double aT) {
    return opensimCommonJNI.Storage_findIndex__SWIG_1(swigCPtr, this, aI, aT);
  }

  public void findFrameRange(double aStartTime, double aEndTime, SWIGTYPE_p_int oStartFrame, SWIGTYPE_p_int oEndFrame) {
    opensimCommonJNI.Storage_findFrameRange(swigCPtr, this, aStartTime, aEndTime, SWIGTYPE_p_int.getCPtr(oStartFrame), SWIGTYPE_p_int.getCPtr(oEndFrame));
  }

  public double resample(double aDT, int aDegree) {
    return opensimCommonJNI.Storage_resample(swigCPtr, this, aDT, aDegree);
  }

  public double resampleLinear(double aDT) {
    return opensimCommonJNI.Storage_resampleLinear(swigCPtr, this, aDT);
  }

  public double compareColumn(Storage aOtherStorage, String aColumnName, double startTime, double endTime) {
    return opensimCommonJNI.Storage_compareColumn__SWIG_0(swigCPtr, this, Storage.getCPtr(aOtherStorage), aOtherStorage, aColumnName, startTime, endTime);
  }

  public double compareColumn(Storage aOtherStorage, String aColumnName, double startTime) {
    return opensimCommonJNI.Storage_compareColumn__SWIG_1(swigCPtr, this, Storage.getCPtr(aOtherStorage), aOtherStorage, aColumnName, startTime);
  }

  public double compareColumnRMS(Storage aOtherStorage, String aColumnName, double startTime, double endTime) {
    return opensimCommonJNI.Storage_compareColumnRMS__SWIG_0(swigCPtr, this, Storage.getCPtr(aOtherStorage), aOtherStorage, aColumnName, startTime, endTime);
  }

  public double compareColumnRMS(Storage aOtherStorage, String aColumnName, double startTime) {
    return opensimCommonJNI.Storage_compareColumnRMS__SWIG_1(swigCPtr, this, Storage.getCPtr(aOtherStorage), aOtherStorage, aColumnName, startTime);
  }

  public double compareColumnRMS(Storage aOtherStorage, String aColumnName) {
    return opensimCommonJNI.Storage_compareColumnRMS__SWIG_2(swigCPtr, this, Storage.getCPtr(aOtherStorage), aOtherStorage, aColumnName);
  }

  public void compareWithStandard(Storage standard, StdVectorString columnsUsed, StdVectorDouble comparisons) {
    opensimCommonJNI.Storage_compareWithStandard(swigCPtr, this, Storage.getCPtr(standard), standard, StdVectorString.getCPtr(columnsUsed), columnsUsed, StdVectorDouble.getCPtr(comparisons), comparisons);
  }

  public boolean makeStorageLabelsUnique() {
    return opensimCommonJNI.Storage_makeStorageLabelsUnique(swigCPtr, this);
  }

  public boolean storageLabelsAreUnique() {
    return opensimCommonJNI.Storage_storageLabelsAreUnique(swigCPtr, this);
  }

  public boolean print(String aFileName, String aMode, String aComment) {
    return opensimCommonJNI.Storage_print__SWIG_0(swigCPtr, this, aFileName, aMode, aComment);
  }

  public boolean print(String aFileName, String aMode) {
    return opensimCommonJNI.Storage_print__SWIG_1(swigCPtr, this, aFileName, aMode);
  }

  public boolean print(String aFileName) {
    return opensimCommonJNI.Storage_print__SWIG_2(swigCPtr, this, aFileName);
  }

  public int print(String aFileName, double aDT, String aMode) {
    return opensimCommonJNI.Storage_print__SWIG_3(swigCPtr, this, aFileName, aDT, aMode);
  }

  public int print(String aFileName, double aDT) {
    return opensimCommonJNI.Storage_print__SWIG_4(swigCPtr, this, aFileName, aDT);
  }

  public void setOutputFileName(String aFileName) {
    opensimCommonJNI.Storage_setOutputFileName(swigCPtr, this, aFileName);
  }

  public static void printResult(Storage aStorage, String aName, String aDir, double aDT, String aExtension) {
    opensimCommonJNI.Storage_printResult(Storage.getCPtr(aStorage), aStorage, aName, aDir, aDT, aExtension);
  }

  public void interpolateAt(ArrayDouble targetTimes) {
    opensimCommonJNI.Storage_interpolateAt(swigCPtr, this, ArrayDouble.getCPtr(targetTimes), targetTimes);
  }

}
