package com.lq.box;



public class Cube extends Box{
	public Cube(int side) {
		super(side);
	}

	@Override
	public void setWidth(double width) {
		// TODO Auto-generated method stub
		setAll(width);
	}

	@Override
	public void setHeight(double height) {
		// TODO Auto-generated method stub
		setAll(height);
	}

	@Override
	public void setLength(double length) {
		// TODO Auto-generated method stub
		setAll(length);
	}
	
	public void setAll(double side) {
		super.setWidth(side);
		super.setHeight(side);
		super.setLength(side);
	}
	
}
