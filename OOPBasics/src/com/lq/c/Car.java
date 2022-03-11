package com.lq.c;

import com.lq.exceptions.SpeedOutOfRangeException;
import com.lq.exceptions.SpeedWayOutOfRangeException;
import com.lq.inh.ICar;

public class Car implements ICar {
	private int speed;
	private int maxSpeed = 200;
	private int gas;
	private boolean engineState;
	/**
	 * @return the speed
	 */
	public final int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 * @throws Exception 
	 */
	public final void setSpeed(int speed) throws SpeedOutOfRangeException, SpeedWayOutOfRangeException {
		if (speed > 3000) {
			throw new SpeedWayOutOfRangeException();
			}
		if (speed > 200) {
			throw new SpeedOutOfRangeException();
		}
		this.speed = speed;
	}
	/**
	 * @return the maxSpeed
	 */
	public final int getMaxSpeed() {
		return maxSpeed;
	}
	/**
	 * @param speed
	 * @param maxSpeed
	 * @param gas
	 * @param engineState
	 */
	public Car(int speed, int maxSpeed, int gas, boolean engineState) {
		this.speed = speed;
		this.maxSpeed = maxSpeed;
		this.gas = gas;
		this.engineState = engineState;
	}
	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public final void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	/**
	 * @return the gas
	 */
	public final int getGas() {
		return gas;
	}
	/**
	 * @param gas the gas to set
	 */
	public final void setGas(int gas) {
		this.gas = gas;
	}
	/**
	 * @return the engineState
	 */
	public final boolean isEngineState() {
		return engineState;
	}
	/**
	 * @param engineState the engineState to set
	 */
	public final void setEngineState(boolean engineState) {
		this.engineState = engineState;
	}
}
