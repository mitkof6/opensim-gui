/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SimTKVisualizer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SimTKVisualizer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SimTKVisualizer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_SimTKVisualizer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SimTKVisualizer(SWIGTYPE_p_SimTK__MultibodySystem system) {
    this(opensimSimbodyJNI.new_SimTKVisualizer__SWIG_0(SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system)), true);
  }

  public SimTKVisualizer(SWIGTYPE_p_SimTK__MultibodySystem system, SWIGTYPE_p_SimTK__Array_T_String_unsigned_int_t searchPath) {
    this(opensimSimbodyJNI.new_SimTKVisualizer__SWIG_1(SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system), SWIGTYPE_p_SimTK__Array_T_String_unsigned_int_t.getCPtr(searchPath)), true);
  }

  public SimTKVisualizer(SimTKVisualizer src) {
    this(opensimSimbodyJNI.new_SimTKVisualizer__SWIG_2(SimTKVisualizer.getCPtr(src), src), true);
  }

  public void shutdown() {
    opensimSimbodyJNI.SimTKVisualizer_shutdown(swigCPtr, this);
  }

  public SimTKVisualizer setShutdownWhenDestructed(boolean shouldShutdown) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setShutdownWhenDestructed(swigCPtr, this, shouldShutdown), false);
  }

  public boolean getShutdownWhenDestructed() {
    return opensimSimbodyJNI.SimTKVisualizer_getShutdownWhenDestructed(swigCPtr, this);
  }

  public SimTKVisualizer setBackgroundType(SimTKVisualizer.BackgroundType background) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setBackgroundType(swigCPtr, this, background.swigValue()), false);
  }

  public SimTKVisualizer setBackgroundColor(Vec3 color) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setBackgroundColor(swigCPtr, this, Vec3.getCPtr(color), color), false);
  }

  public SimTKVisualizer setShowShadows(boolean showShadows) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setShowShadows(swigCPtr, this, showShadows), false);
  }

  public SimTKVisualizer setShowFrameRate(boolean showFrameRate) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setShowFrameRate(swigCPtr, this, showFrameRate), false);
  }

  public SimTKVisualizer setShowSimTime(boolean showSimTime) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setShowSimTime(swigCPtr, this, showSimTime), false);
  }

  public SimTKVisualizer setShowFrameNumber(boolean showFrameNumber) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setShowFrameNumber(swigCPtr, this, showFrameNumber), false);
  }

  public SimTKVisualizer setWindowTitle(SWIGTYPE_p_String title) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setWindowTitle(swigCPtr, this, SWIGTYPE_p_String.getCPtr(title)), false);
  }

  public SimTKVisualizer setSystemUpDirection(CoordinateDirection upDirection) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setSystemUpDirection(swigCPtr, this, CoordinateDirection.getCPtr(upDirection), upDirection), false);
  }

  public CoordinateDirection getSystemUpDirection() {
    return new CoordinateDirection(opensimSimbodyJNI.SimTKVisualizer_getSystemUpDirection(swigCPtr, this), true);
  }

  public SimTKVisualizer setGroundHeight(double height) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setGroundHeight(swigCPtr, this, height), false);
  }

  public double getGroundHeight() {
    return opensimSimbodyJNI.SimTKVisualizer_getGroundHeight(swigCPtr, this);
  }

  public SimTKVisualizer setMode(SimTKVisualizer.Mode mode) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setMode(swigCPtr, this, mode.swigValue()), false);
  }

  public SimTKVisualizer.Mode getMode() {
    return SimTKVisualizer.Mode.swigToEnum(opensimSimbodyJNI.SimTKVisualizer_getMode(swigCPtr, this));
  }

  public SimTKVisualizer setDesiredFrameRate(double framesPerSec) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setDesiredFrameRate(swigCPtr, this, framesPerSec), false);
  }

  public double getDesiredFrameRate() {
    return opensimSimbodyJNI.SimTKVisualizer_getDesiredFrameRate(swigCPtr, this);
  }

  public SimTKVisualizer setRealTimeScale(double simTimePerRealSecond) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setRealTimeScale(swigCPtr, this, simTimePerRealSecond), false);
  }

  public double getRealTimeScale() {
    return opensimSimbodyJNI.SimTKVisualizer_getRealTimeScale(swigCPtr, this);
  }

  public SimTKVisualizer setDesiredBufferLengthInSec(double bufferLengthInSec) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setDesiredBufferLengthInSec(swigCPtr, this, bufferLengthInSec), false);
  }

  public double getDesiredBufferLengthInSec() {
    return opensimSimbodyJNI.SimTKVisualizer_getDesiredBufferLengthInSec(swigCPtr, this);
  }

  public double getActualBufferLengthInSec() {
    return opensimSimbodyJNI.SimTKVisualizer_getActualBufferLengthInSec(swigCPtr, this);
  }

  public int getActualBufferLengthInFrames() {
    return opensimSimbodyJNI.SimTKVisualizer_getActualBufferLengthInFrames(swigCPtr, this);
  }

  public int addInputListener(SimTKVisualizerInputListener listener) {
    return opensimSimbodyJNI.SimTKVisualizer_addInputListener(swigCPtr, this, SimTKVisualizerInputListener.getCPtr(listener), listener);
  }

  public int getNumInputListeners() {
    return opensimSimbodyJNI.SimTKVisualizer_getNumInputListeners(swigCPtr, this);
  }

  public SimTKVisualizerInputListener getInputListener(int i) {
    return new SimTKVisualizerInputListener(opensimSimbodyJNI.SimTKVisualizer_getInputListener(swigCPtr, this, i), false);
  }

  public SimTKVisualizerInputListener updInputListener(int i) {
    return new SimTKVisualizerInputListener(opensimSimbodyJNI.SimTKVisualizer_updInputListener(swigCPtr, this, i), false);
  }

  public int addFrameController(SimTKVisualizer.FrameController controller) {
    return opensimSimbodyJNI.SimTKVisualizer_addFrameController(swigCPtr, this, SimTKVisualizer.FrameController.getCPtr(controller), controller);
  }

  public int getNumFrameControllers() {
    return opensimSimbodyJNI.SimTKVisualizer_getNumFrameControllers(swigCPtr, this);
  }

  public SimTKVisualizer.FrameController getFrameController(int i) {
    return new SimTKVisualizer.FrameController(opensimSimbodyJNI.SimTKVisualizer_getFrameController(swigCPtr, this, i), false);
  }

  public SimTKVisualizer.FrameController updFrameController(int i) {
    return new SimTKVisualizer.FrameController(opensimSimbodyJNI.SimTKVisualizer_updFrameController(swigCPtr, this, i), false);
  }

  public void report(State state) {
    opensimSimbodyJNI.SimTKVisualizer_report(swigCPtr, this, State.getCPtr(state), state);
  }

  public void flushFrames() {
    opensimSimbodyJNI.SimTKVisualizer_flushFrames(swigCPtr, this);
  }

  public void drawFrameNow(State state) {
    opensimSimbodyJNI.SimTKVisualizer_drawFrameNow(swigCPtr, this, State.getCPtr(state), state);
  }

  public SimTKVisualizer addMenu(SWIGTYPE_p_String title, int id, SWIGTYPE_p_SimTK__Array_T_std__pairT_String_int_t_unsigned_int_t items) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_addMenu(swigCPtr, this, SWIGTYPE_p_String.getCPtr(title), id, SWIGTYPE_p_SimTK__Array_T_std__pairT_String_int_t_unsigned_int_t.getCPtr(items)), false);
  }

  public SimTKVisualizer addSlider(SWIGTYPE_p_String title, int id, double min, double max, double value) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_addSlider(swigCPtr, this, SWIGTYPE_p_String.getCPtr(title), id, min, max, value), false);
  }

  public int addDecoration(int mobodIx, Transform X_BD, DecorativeGeometry geometry) {
    return opensimSimbodyJNI.SimTKVisualizer_addDecoration(swigCPtr, this, mobodIx, Transform.getCPtr(X_BD), X_BD, DecorativeGeometry.getCPtr(geometry), geometry);
  }

  public int getNumDecorations() {
    return opensimSimbodyJNI.SimTKVisualizer_getNumDecorations(swigCPtr, this);
  }

  public DecorativeGeometry getDecoration(int i) {
    return new DecorativeGeometry(opensimSimbodyJNI.SimTKVisualizer_getDecoration(swigCPtr, this, i), false);
  }

  public DecorativeGeometry updDecoration(int i) {
    return new DecorativeGeometry(opensimSimbodyJNI.SimTKVisualizer_updDecoration(swigCPtr, this, i), false);
  }

  public int addRubberBandLine(int b1, Vec3 station1, int b2, Vec3 station2, DecorativeLine line) {
    return opensimSimbodyJNI.SimTKVisualizer_addRubberBandLine(swigCPtr, this, b1, Vec3.getCPtr(station1), station1, b2, Vec3.getCPtr(station2), station2, DecorativeLine.getCPtr(line), line);
  }

  public int getNumRubberBandLines() {
    return opensimSimbodyJNI.SimTKVisualizer_getNumRubberBandLines(swigCPtr, this);
  }

  public DecorativeLine getRubberBandLine(int i) {
    return new DecorativeLine(opensimSimbodyJNI.SimTKVisualizer_getRubberBandLine(swigCPtr, this, i), false);
  }

  public DecorativeLine updRubberBandLine(int i) {
    return new DecorativeLine(opensimSimbodyJNI.SimTKVisualizer_updRubberBandLine(swigCPtr, this, i), false);
  }

  public int addDecorationGenerator(SWIGTYPE_p_SimTK__DecorationGenerator generator) {
    return opensimSimbodyJNI.SimTKVisualizer_addDecorationGenerator(swigCPtr, this, SWIGTYPE_p_SimTK__DecorationGenerator.getCPtr(generator));
  }

  public int getNumDecorationGenerators() {
    return opensimSimbodyJNI.SimTKVisualizer_getNumDecorationGenerators(swigCPtr, this);
  }

  public SWIGTYPE_p_SimTK__DecorationGenerator getDecorationGenerator(int i) {
    return new SWIGTYPE_p_SimTK__DecorationGenerator(opensimSimbodyJNI.SimTKVisualizer_getDecorationGenerator(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_SimTK__DecorationGenerator updDecorationGenerator(int i) {
    return new SWIGTYPE_p_SimTK__DecorationGenerator(opensimSimbodyJNI.SimTKVisualizer_updDecorationGenerator(swigCPtr, this, i), false);
  }

  public SimTKVisualizer setCameraTransform(Transform X_GC) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setCameraTransform(swigCPtr, this, Transform.getCPtr(X_GC), X_GC), false);
  }

  public SimTKVisualizer zoomCameraToShowAllGeometry() {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_zoomCameraToShowAllGeometry(swigCPtr, this), false);
  }

  public SimTKVisualizer pointCameraAt(Vec3 point, Vec3 upDirection) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_pointCameraAt(swigCPtr, this, Vec3.getCPtr(point), point, Vec3.getCPtr(upDirection), upDirection), false);
  }

  public SimTKVisualizer setCameraFieldOfView(double fov) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setCameraFieldOfView(swigCPtr, this, fov), false);
  }

  public SimTKVisualizer setCameraClippingPlanes(double nearPlane, double farPlane) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setCameraClippingPlanes(swigCPtr, this, nearPlane, farPlane), false);
  }

  public SimTKVisualizer setSliderValue(int slider, double value) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setSliderValue(swigCPtr, this, slider, value), false);
  }

  public SimTKVisualizer setSliderRange(int slider, double newMin, double newMax) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setSliderRange(swigCPtr, this, slider, newMin, newMax), false);
  }

  public void dumpStats(SWIGTYPE_p_std__ostream o) {
    opensimSimbodyJNI.SimTKVisualizer_dumpStats(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(o));
  }

  public void clearStats() {
    opensimSimbodyJNI.SimTKVisualizer_clearStats(swigCPtr, this);
  }

  public SWIGTYPE_p_SimTK__Array_T_SimTK__Visualizer__InputListener_p_unsigned_int_t getInputListeners() {
    return new SWIGTYPE_p_SimTK__Array_T_SimTK__Visualizer__InputListener_p_unsigned_int_t(opensimSimbodyJNI.SimTKVisualizer_getInputListeners(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Array_T_SimTK__Visualizer__FrameController_p_unsigned_int_t getFrameControllers() {
    return new SWIGTYPE_p_SimTK__Array_T_SimTK__Visualizer__FrameController_p_unsigned_int_t(opensimSimbodyJNI.SimTKVisualizer_getFrameControllers(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimSimbodyJNI.SimTKVisualizer_getSystem(swigCPtr, this), false);
  }

  public int getRefCount() {
    return opensimSimbodyJNI.SimTKVisualizer_getRefCount(swigCPtr, this);
  }

  static public class FrameController {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected FrameController(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(FrameController obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          opensimSimbodyJNI.delete_SimTKVisualizer_FrameController(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void generateControls(SimTKVisualizer viz, State state, ArrayDecorativeGeometry geometry) {
      opensimSimbodyJNI.SimTKVisualizer_FrameController_generateControls(swigCPtr, this, SimTKVisualizer.getCPtr(viz), viz, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(geometry), geometry);
    }
  
  }

  static public class BodyFollower extends SimTKVisualizer.FrameController {
    private transient long swigCPtr;
  
    protected BodyFollower(long cPtr, boolean cMemoryOwn) {
      super(opensimSimbodyJNI.SimTKVisualizer_BodyFollower_SWIGUpcast(cPtr), cMemoryOwn);
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(BodyFollower obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          opensimSimbodyJNI.delete_SimTKVisualizer_BodyFollower(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public BodyFollower(SWIGTYPE_p_SimTK__MobilizedBody mobodB, Vec3 stationPinB, Vec3 offset, UnitVec3 upDirection) {
      this(opensimSimbodyJNI.new_SimTKVisualizer_BodyFollower__SWIG_0(SWIGTYPE_p_SimTK__MobilizedBody.getCPtr(mobodB), Vec3.getCPtr(stationPinB), stationPinB, Vec3.getCPtr(offset), offset, UnitVec3.getCPtr(upDirection), upDirection), true);
    }
  
    public BodyFollower(SWIGTYPE_p_SimTK__MobilizedBody mobodB, Vec3 stationPinB, Vec3 offset) {
      this(opensimSimbodyJNI.new_SimTKVisualizer_BodyFollower__SWIG_1(SWIGTYPE_p_SimTK__MobilizedBody.getCPtr(mobodB), Vec3.getCPtr(stationPinB), stationPinB, Vec3.getCPtr(offset), offset), true);
    }
  
    public BodyFollower(SWIGTYPE_p_SimTK__MobilizedBody mobodB, Vec3 stationPinB) {
      this(opensimSimbodyJNI.new_SimTKVisualizer_BodyFollower__SWIG_2(SWIGTYPE_p_SimTK__MobilizedBody.getCPtr(mobodB), Vec3.getCPtr(stationPinB), stationPinB), true);
    }
  
    public BodyFollower(SWIGTYPE_p_SimTK__MobilizedBody mobodB) {
      this(opensimSimbodyJNI.new_SimTKVisualizer_BodyFollower__SWIG_3(SWIGTYPE_p_SimTK__MobilizedBody.getCPtr(mobodB)), true);
    }
  
    public void generateControls(SimTKVisualizer viz, State state, ArrayDecorativeGeometry geometry) {
      opensimSimbodyJNI.SimTKVisualizer_BodyFollower_generateControls(swigCPtr, this, SimTKVisualizer.getCPtr(viz), viz, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(geometry), geometry);
    }
  
  }

  public SimTKVisualizer setBackgroundTypeByInt(int index) {
    return new SimTKVisualizer(opensimSimbodyJNI.SimTKVisualizer_setBackgroundTypeByInt(swigCPtr, this, index), false);
  }

  public final static class Mode {
    public final static SimTKVisualizer.Mode PassThrough = new SimTKVisualizer.Mode("PassThrough", opensimSimbodyJNI.SimTKVisualizer_PassThrough_get());
    public final static SimTKVisualizer.Mode Sampling = new SimTKVisualizer.Mode("Sampling", opensimSimbodyJNI.SimTKVisualizer_Sampling_get());
    public final static SimTKVisualizer.Mode RealTime = new SimTKVisualizer.Mode("RealTime", opensimSimbodyJNI.SimTKVisualizer_RealTime_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Mode swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Mode.class + " with value " + swigValue);
    }

    private Mode(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Mode(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Mode(String swigName, Mode swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Mode[] swigValues = { PassThrough, Sampling, RealTime };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class BackgroundType {
    public final static SimTKVisualizer.BackgroundType GroundAndSky = new SimTKVisualizer.BackgroundType("GroundAndSky", opensimSimbodyJNI.SimTKVisualizer_GroundAndSky_get());
    public final static SimTKVisualizer.BackgroundType SolidColor = new SimTKVisualizer.BackgroundType("SolidColor", opensimSimbodyJNI.SimTKVisualizer_SolidColor_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static BackgroundType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + BackgroundType.class + " with value " + swigValue);
    }

    private BackgroundType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private BackgroundType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private BackgroundType(String swigName, BackgroundType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static BackgroundType[] swigValues = { GroundAndSky, SolidColor };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class PredefinedMenuIds {
    public final static SimTKVisualizer.PredefinedMenuIds ViewMenuId = new SimTKVisualizer.PredefinedMenuIds("ViewMenuId", opensimSimbodyJNI.SimTKVisualizer_ViewMenuId_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static PredefinedMenuIds swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + PredefinedMenuIds.class + " with value " + swigValue);
    }

    private PredefinedMenuIds(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private PredefinedMenuIds(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private PredefinedMenuIds(String swigName, PredefinedMenuIds swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static PredefinedMenuIds[] swigValues = { ViewMenuId };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
