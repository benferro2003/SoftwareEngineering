package c3654717;

public class Rectangle extends Shape //subclass of Shape
{
	private int width;
	private int height;
	
	Rectangle() 
	{
		super(4); // rectangle has 4 sides 
		
	}




	
	public int getWidth()
	{
		return width;
	}
	
	public void setWidth(int width)
	
	{
		this.width = width;
		
	}
	
	
	public int getHeight()
	{
		return height;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	
	public int getArea() {
		int area = (int) getWidth() * (int) getHeight();
		return area;
	}
	
	public String toString()
	{
		return("Class name: " + getClass().getSimpleName()  +
				"\nNumber of sides:  " + getSides() +
				"\nWidth:  " + getWidth() +
				"\nHeight:  " + getHeight() +
				"\nArea:  " + getArea());
				
	}












}
