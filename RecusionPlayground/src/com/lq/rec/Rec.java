package com.lq.rec;

public class Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(factorial(6));
	}
	public static int factorial(int i) {
		if (i > 0 ) {
			return i * factorial(i-1);
		}
		else {
			return 1;
		}
	}

}
