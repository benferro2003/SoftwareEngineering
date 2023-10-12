package c3654717;

public class Ellipse extends Rectangle { //extends from rectangle sub class
	public int getArea() { 
		int area = (int) (getWidth() * (int) getHeight() * 3.141519); //use get Width and get height to obtain values
		return area; //not a lot of code as this is a subclass of a subclass
	}

}
