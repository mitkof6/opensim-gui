/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Manager {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Manager(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Manager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_Manager(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Manager(Model model) {
    this(opensimSimulationJNI.new_Manager__SWIG_0(Model.getCPtr(model), model), true);
  }

  public Manager(Model model, State state) {
    this(opensimSimulationJNI.new_Manager__SWIG_1(Model.getCPtr(model), model, State.getCPtr(state), state), true);
  }

  public Manager() {
    this(opensimSimulationJNI.new_Manager__SWIG_2(), true);
  }

  public void setSessionName(String name) {
    opensimSimulationJNI.Manager_setSessionName(swigCPtr, this, name);
  }

  public void setModel(Model model) {
    opensimSimulationJNI.Manager_setModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public String getSessionName() {
    return opensimSimulationJNI.Manager_getSessionName(swigCPtr, this);
  }

  public String toString() {
    return opensimSimulationJNI.Manager_toString(swigCPtr, this);
  }

  public void setPerformAnalyses(boolean performAnalyses) {
    opensimSimulationJNI.Manager_setPerformAnalyses(swigCPtr, this, performAnalyses);
  }

  public void setWriteToStorage(boolean writeToStorage) {
    opensimSimulationJNI.Manager_setWriteToStorage(swigCPtr, this, writeToStorage);
  }

  public void setIntegratorMethod(Manager.IntegratorMethod integMethod) {
    opensimSimulationJNI.Manager_setIntegratorMethod(swigCPtr, this, integMethod.swigValue());
  }

  public SWIGTYPE_p_SimTK__Integrator getIntegrator() {
    return new SWIGTYPE_p_SimTK__Integrator(opensimSimulationJNI.Manager_getIntegrator(swigCPtr, this), false);
  }

  public void setIntegratorAccuracy(double accuracy) {
    opensimSimulationJNI.Manager_setIntegratorAccuracy(swigCPtr, this, accuracy);
  }

  public void setIntegratorMinimumStepSize(double hmin) {
    opensimSimulationJNI.Manager_setIntegratorMinimumStepSize(swigCPtr, this, hmin);
  }

  public void setIntegratorMaximumStepSize(double hmax) {
    opensimSimulationJNI.Manager_setIntegratorMaximumStepSize(swigCPtr, this, hmax);
  }

  public void setIntegratorInternalStepLimit(int nSteps) {
    opensimSimulationJNI.Manager_setIntegratorInternalStepLimit(swigCPtr, this, nSteps);
  }

  public void setUseSpecifiedDT(boolean aTrueFalse) {
    opensimSimulationJNI.Manager_setUseSpecifiedDT(swigCPtr, this, aTrueFalse);
  }

  public boolean getUseSpecifiedDT() {
    return opensimSimulationJNI.Manager_getUseSpecifiedDT(swigCPtr, this);
  }

  public void setUseConstantDT(boolean aTrueFalse) {
    opensimSimulationJNI.Manager_setUseConstantDT(swigCPtr, this, aTrueFalse);
  }

  public boolean getUseConstantDT() {
    return opensimSimulationJNI.Manager_getUseConstantDT(swigCPtr, this);
  }

  public ArrayDouble getDTArray() {
    return new ArrayDouble(opensimSimulationJNI.Manager_getDTArray(swigCPtr, this), false);
  }

  public void setDTArray(Vector aDT, double aTI) {
    opensimSimulationJNI.Manager_setDTArray__SWIG_0(swigCPtr, this, Vector.getCPtr(aDT), aDT, aTI);
  }

  public void setDTArray(Vector aDT) {
    opensimSimulationJNI.Manager_setDTArray__SWIG_1(swigCPtr, this, Vector.getCPtr(aDT), aDT);
  }

  public double getDTArrayDT(int aStep) {
    return opensimSimulationJNI.Manager_getDTArrayDT(swigCPtr, this, aStep);
  }

  public void printDTArray(String aFileName) {
    opensimSimulationJNI.Manager_printDTArray__SWIG_0(swigCPtr, this, aFileName);
  }

  public void printDTArray() {
    opensimSimulationJNI.Manager_printDTArray__SWIG_1(swigCPtr, this);
  }

  public ArrayDouble getTimeArray() {
    return new ArrayDouble(opensimSimulationJNI.Manager_getTimeArray(swigCPtr, this), false);
  }

  public double getTimeArrayTime(int aStep) {
    return opensimSimulationJNI.Manager_getTimeArrayTime(swigCPtr, this, aStep);
  }

  public int getTimeArrayStep(double aTime) {
    return opensimSimulationJNI.Manager_getTimeArrayStep(swigCPtr, this, aTime);
  }

  public void printTimeArray(String aFileName) {
    opensimSimulationJNI.Manager_printTimeArray__SWIG_0(swigCPtr, this, aFileName);
  }

  public void printTimeArray() {
    opensimSimulationJNI.Manager_printTimeArray__SWIG_1(swigCPtr, this);
  }

  public void resetTimeAndDTArrays(double aTime) {
    opensimSimulationJNI.Manager_resetTimeAndDTArrays(swigCPtr, this, aTime);
  }

  public double getNextTimeArrayTime(double aTime) {
    return opensimSimulationJNI.Manager_getNextTimeArrayTime(swigCPtr, this, aTime);
  }

  public void initialize(State s) {
    opensimSimulationJNI.Manager_initialize(swigCPtr, this, State.getCPtr(s), s);
  }

  public State integrate(double finalTime) {
    return new State(opensimSimulationJNI.Manager_integrate(swigCPtr, this, finalTime), false);
  }

  public State getState() {
    return new State(opensimSimulationJNI.Manager_getState(swigCPtr, this), false);
  }

  public double getFixedStepSize(int tArrayStep) {
    return opensimSimulationJNI.Manager_getFixedStepSize(swigCPtr, this, tArrayStep);
  }

  public boolean hasStateStorage() {
    return opensimSimulationJNI.Manager_hasStateStorage(swigCPtr, this);
  }

  public void setStateStorage(Storage aStorage) {
    opensimSimulationJNI.Manager_setStateStorage(swigCPtr, this, Storage.getCPtr(aStorage), aStorage);
  }

  public Storage getStateStorage() {
    return new Storage(opensimSimulationJNI.Manager_getStateStorage(swigCPtr, this), false);
  }

  public TimeSeriesTable getStatesTable() {
    return new TimeSeriesTable(opensimSimulationJNI.Manager_getStatesTable(swigCPtr, this), true);
  }

  public void halt() {
    opensimSimulationJNI.Manager_halt(swigCPtr, this);
  }

  public void clearHalt() {
    opensimSimulationJNI.Manager_clearHalt(swigCPtr, this);
  }

  public boolean checkHalt() {
    return opensimSimulationJNI.Manager_checkHalt(swigCPtr, this);
  }

  public final static class IntegratorMethod {
    public final static Manager.IntegratorMethod ExplicitEuler = new Manager.IntegratorMethod("ExplicitEuler", opensimSimulationJNI.Manager_IntegratorMethod_ExplicitEuler_get());
    public final static Manager.IntegratorMethod RungeKutta2 = new Manager.IntegratorMethod("RungeKutta2", opensimSimulationJNI.Manager_IntegratorMethod_RungeKutta2_get());
    public final static Manager.IntegratorMethod RungeKutta3 = new Manager.IntegratorMethod("RungeKutta3", opensimSimulationJNI.Manager_IntegratorMethod_RungeKutta3_get());
    public final static Manager.IntegratorMethod RungeKuttaFeldberg = new Manager.IntegratorMethod("RungeKuttaFeldberg", opensimSimulationJNI.Manager_IntegratorMethod_RungeKuttaFeldberg_get());
    public final static Manager.IntegratorMethod RungeKuttaMerson = new Manager.IntegratorMethod("RungeKuttaMerson", opensimSimulationJNI.Manager_IntegratorMethod_RungeKuttaMerson_get());
    public final static Manager.IntegratorMethod SemiExplicitEuler2 = new Manager.IntegratorMethod("SemiExplicitEuler2", opensimSimulationJNI.Manager_IntegratorMethod_SemiExplicitEuler2_get());
    public final static Manager.IntegratorMethod Verlet = new Manager.IntegratorMethod("Verlet", opensimSimulationJNI.Manager_IntegratorMethod_Verlet_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static IntegratorMethod swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + IntegratorMethod.class + " with value " + swigValue);
    }

    private IntegratorMethod(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private IntegratorMethod(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private IntegratorMethod(String swigName, IntegratorMethod swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static IntegratorMethod[] swigValues = { ExplicitEuler, RungeKutta2, RungeKutta3, RungeKuttaFeldberg, RungeKuttaMerson, SemiExplicitEuler2, Verlet };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
