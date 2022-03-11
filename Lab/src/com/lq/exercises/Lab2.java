/**
 * 
 */
package com.lq.exercises;

import java.util.Scanner;

/**
 * @author Student
 *
 */
public class Lab2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		/*int x = 30;
		int y = scn.nextInt();
		if ( x < y) {
			System.out.print("Hello");
		}
		else {
			System.out.print("Bye");
		}
		if (x==1) {
			System.out.print("Jane");
		}
		else {
			System.out.print("Time");
		}
		*/
		int x = scn.nextInt();
		switch(x) {
		case 1:
			System.out.print("Jane");
			break;
		case 2:
			System.out.print("Time");
			break;
		default:
			System.out.print("kek");
			break;
		}
				
		
		
		
		

	}

}
