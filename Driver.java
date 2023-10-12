package c3654717;

public class Driver { //driver class to create objects of other classes

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle();
		R1.setWidth(3);
		R1.setHeight(9);
		
		System.out.println(R1);
		
		Rectangle R2 = new Rectangle();
		R2.setWidth(12);
		R2.setHeight(8);
		
		
		System.out.println("The area of the rectangle is - " + R2.getArea());
		
		Circle C1 =	new Circle();
		C1.setRadius(19);
		System.out.println("The area of the circle is - " + C1.getArea());
		
		Circle C2 =	new Circle();
		C2.setRadius(15);
		System.out.println("The area of the circle is - " + C2.getArea());
		
		Ellipse E1 = new Ellipse();
		E1.setWidth(21);
		E1.setHeight(19);
		System.out.println("The area of the ellipse is - " + E1.getArea());
		
		

	}

}
