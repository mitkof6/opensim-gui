/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class C3DFileAdapter extends FileAdapter {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected C3DFileAdapter(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.C3DFileAdapter_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(C3DFileAdapter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimCommonJNI.delete_C3DFileAdapter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public C3DFileAdapter() {
    this(opensimCommonJNI.new_C3DFileAdapter__SWIG_0(), true);
  }

  public C3DFileAdapter(C3DFileAdapter arg0) {
    this(opensimCommonJNI.new_C3DFileAdapter__SWIG_1(C3DFileAdapter.getCPtr(arg0), arg0), true);
  }

  public DataAdapter clone() {
    long cPtr = opensimCommonJNI.C3DFileAdapter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new C3DFileAdapter(cPtr, true);
  }

  public void setLocationForForceExpression(C3DFileAdapter.ForceLocation location) {
    opensimCommonJNI.C3DFileAdapter_setLocationForForceExpression(swigCPtr, this, location.swigValue());
  }

  public C3DFileAdapter.ForceLocation getLocationForForceExpression() {
    return C3DFileAdapter.ForceLocation.swigToEnum(opensimCommonJNI.C3DFileAdapter_getLocationForForceExpression(swigCPtr, this));
  }

  public static StdMapStringTimeSeriesTableVec3 read(String fileName, C3DFileAdapter.ForceLocation wrt) {
    return new StdMapStringTimeSeriesTableVec3(opensimCommonJNI.C3DFileAdapter_read__SWIG_0(fileName, wrt.swigValue()), true);
  }

  public static StdMapStringTimeSeriesTableVec3 read(String fileName) {
    return new StdMapStringTimeSeriesTableVec3(opensimCommonJNI.C3DFileAdapter_read__SWIG_1(fileName), true);
  }

  public static void write(StdMapStringTimeSeriesTableVec3 markerTable, String fileName) {
    opensimCommonJNI.C3DFileAdapter_write(StdMapStringTimeSeriesTableVec3.getCPtr(markerTable), markerTable, fileName);
  }

  public static String get_markers() {
    return opensimCommonJNI.C3DFileAdapter__markers_get();
  }

  public static String get_forces() {
    return opensimCommonJNI.C3DFileAdapter__forces_get();
  }

  public StdMapStringTimeSeriesTableVec3 read(String fileName, long wrt) {
    return new StdMapStringTimeSeriesTableVec3(opensimCommonJNI.C3DFileAdapter_read__SWIG_2(swigCPtr, this, fileName, wrt), true);
  }

  public final static class ForceLocation {
    public final static C3DFileAdapter.ForceLocation OriginOfForcePlate = new C3DFileAdapter.ForceLocation("OriginOfForcePlate", opensimCommonJNI.C3DFileAdapter_ForceLocation_OriginOfForcePlate_get());
    public final static C3DFileAdapter.ForceLocation CenterOfPressure = new C3DFileAdapter.ForceLocation("CenterOfPressure", opensimCommonJNI.C3DFileAdapter_ForceLocation_CenterOfPressure_get());
    public final static C3DFileAdapter.ForceLocation PointOfWrenchApplication = new C3DFileAdapter.ForceLocation("PointOfWrenchApplication", opensimCommonJNI.C3DFileAdapter_ForceLocation_PointOfWrenchApplication_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ForceLocation swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ForceLocation.class + " with value " + swigValue);
    }

    private ForceLocation(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ForceLocation(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ForceLocation(String swigName, ForceLocation swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ForceLocation[] swigValues = { OriginOfForcePlate, CenterOfPressure, PointOfWrenchApplication };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
