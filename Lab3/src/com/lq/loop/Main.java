package com.lq.loop;

public class Main {

	public static void main(String[] args) {
		String daysOfWeek[] = {"Sunday", "Monday", "Tuesday"};
		for(int i = 0; i < daysOfWeek.length; i++) {
			System.out.println(daysOfWeek[i]);
		}
		int n = 1;
		while(n <= 20) {
			if(n%2 == 0) {
				n++;
				continue;
			}
			System.out.println(n);
			n++;
		}
		for(int i = daysOfWeek.length - 1; i >=0; i--) {
			System.out.print(daysOfWeek[i]);
		}
		for(int i = 1; i <= 100; i++) {
			if(i < 50 | i > 60) {
				System.out.println(i);
			}
		}
		int j = 1;
		while(j <= 12) {
			String monthNames[] = {"January","February","March","April","May","June","July",
		            "August","September","October","November","December"};
			switch(j) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println(monthNames[j-1] + " has 31 days");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println(monthNames[j-1] + " has 30 days");
					break;
				case 2:
					System.out.println(monthNames[j-1] + " has 28 days");
					
					
			}
			//System.out.println("Month " + j + " has this amount of days: days in this month");
			j++;
		}

	}

}
