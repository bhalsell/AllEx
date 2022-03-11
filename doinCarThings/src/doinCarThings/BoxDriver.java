package doinCarThings;

public class BoxDriver {

	public static void main(String[] args) {
		Box box1 = new Box(5,6,7);
		Box box2 = new Box(-10);
		
		box1.printBox();
		box2.printBox();

		box1.setHeight(-5);
		box1.setWidth(-4);
		box1.setLength(-3);
		
		System.out.println(box1.getVolume());
		System.out.println(box1.getSurfaceArea());
		box1.printBox();
	}

}
