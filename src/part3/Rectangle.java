package part3;

public class Rectangle {
	private double length;
	private double width;
	
	/**
	 * The setLength method accepts an argument 
	 * which is stored in the length field.
	 */
	public void setLength(double len) {
		length = len;
	}
	
	/**
	 * The setWidth method accepts an argument 
	 * which is stored in the with field.
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return (length*2) + (width*2);
	}
}
