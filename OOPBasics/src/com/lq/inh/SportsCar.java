package com.lq.inh;

import com.lq.c.Car;

public class SportsCar extends Car{
	private int horsepower;

	/**
	 * @param speed
	 * @param maxSpeed
	 * @param gas
	 * @param engineState
	 */
	public SportsCar(int speed, int maxSpeed, int gas, boolean engineState, int horsepower) {
		super(speed, maxSpeed, gas, engineState);
		this.setHorsepower(horsepower);
	}

	/**
	 * @return the horsepower
	 */
	public final int getHorsepower() {
		return horsepower;
	}

	/**
	 * @param horsepower the horsepower to set
	 */
	public final void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	
}
