package com.lq.inh;

public interface ICar {
	public void setSpeed(int speed) throws Exception;
	public int getSpeed();
	public void setMaxSpeed(int ms);
	public int getMaxSpeed();
	public void setGas(int g);
	public int getGas();
	public void setEngineState(boolean state);
	public boolean isEngineState();
}
