package com.lq.main;

import com.lq.exceptions.SpeedOutOfRangeException;
import com.lq.exceptions.SpeedWayOutOfRangeException;
import com.lq.inh.SportsCar;

public class Main {

	public static void main(String[] args) {
		/*HashSet<Car> carHashSet = new HashSet<Car>();
		carHashSet.add(new SportsCar(1,1,1,true,2));
		carHashSet.add(new StationWagon(10,10,10,true));
		
		Iterator<Car> iter = carHashSet.iterator();
		while (iter.hasNext()) {
			Car t = iter.next();
			System.out.println(t.getSpeed());
		}
		
		TreeSet<String> myTreeSet = new TreeSet<String>();
		myTreeSet.add("a");
		myTreeSet.add("b");
		myTreeSet.add("z");
		
		Iterator<String> iter = myTreeSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}*/
		SportsCar sp = new SportsCar(1,1,200,true,1);
		try {
			sp.setSpeed(3001);
		}
		catch(SpeedOutOfRangeException | SpeedWayOutOfRangeException a) {
			System.out.print(a + a.getMessage());
		};
	}

}
