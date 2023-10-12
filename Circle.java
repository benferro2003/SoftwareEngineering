package c3654717;

public class Circle extends Shape { //extends from parent class

	Circle() 
	{super(0);} // circle has 0 sides
	
	private int radius; // create radius parameter
	
	public int getRadius() { //getter for radius
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getArea() {
		double area = (((int) getRadius() * (int) getRadius()) * 3.141519265359);
		return (int) area; //convert double back to integer as method returns integer
	}

}
