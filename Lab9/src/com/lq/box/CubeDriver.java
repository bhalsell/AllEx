package com.lq.box;

public class CubeDriver {

	public static void main(String[] args) {
		Cube c1 = new Cube(5);
		Cube c2 = new Cube(7);
		
		c1.printBox();
		c1.setAll(4);
		c1.printBox();
		
		c1.setHeight(1);
		c1.printBox();
		c1.setWidth(-5);
		c1.setWidth(7);
		c1.printBox();

	}

}
