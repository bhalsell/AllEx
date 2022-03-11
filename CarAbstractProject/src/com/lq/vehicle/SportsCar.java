package com.lq.vehicle;

public class SportsCar extends Car {
	private static final int MAX_SPEED = 200;

	@Override
	public void setSpeed(int speed) {
		this.speed=2*speed;
		
	}
	
}
