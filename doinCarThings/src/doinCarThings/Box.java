package doinCarThings;

public class Box {
	/**
	 * @param width
	 */
	public Box(double side) {
		this(side, side, side);
	}
	/**
	 * @param width
	 * @param height
	 * @param length
	 */
	public Box(double width, double height, double length) {
		this.setWidth(width);
		this.setHeight(height);
		this.setLength(length);
	}
	public double getVolume() {
		return width*height*length;
	}
	public double getSurfaceArea() {
		return 2*width*length + 2*width*height + 2*height*length;
	}
	private double width;
	private double height;
	private double length;
	/**
	 * @return the width
	 */
	public final double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public final void setWidth(double width) {
		if (width > 0 ) {
			this.width = width;
		}
		else {
			System.out.println("Invalid width");
		}
	}
	/**
	 * @return the height
	 */
	public final double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public final void setHeight(double height) {
		if (height > 0) {
			this.height = height;
		}
		else {
			System.out.println("Invalid Height");
		}
	}
	/**
	 * @return the length
	 */
	public final double getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public final void setLength(double length) {
		if (length > 0) {
			this.length = length;
		}
		else {
			System.out.println("Invalid length");
		}
	}
	public void printBox(){
		if (width <= 0 | length <= 0 | height <= 0) {
			System.out.println("Box contains invalid dimensions");
		}
		else {
			System.out.println("Height = " + height);
			System.out.println("Width = " + width);
			System.out.println("Length = " + length);
			System.out.println("Volume = " + getVolume());
			System.out.println("Surface Area = " + getSurfaceArea());
		}
		return;
	}
}
