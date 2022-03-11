package com.lq.vehicle;

public abstract class Car {
	protected int speed;
	private boolean engineState;
	public abstract void setSpeed(int speed);
	public boolean isEngineState() {
		return engineState;
	}
	public void setEngineState(boolean state) {
		this.engineState = state;
	}
	public int getSpeed() {
		return speed;
	}
	
	
}
