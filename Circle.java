package Day_23;

public class Circle {
	double radius;

	public Circle(double radius) {
		super();
		if(radius <=0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		this.radius = radius;
	}
	
	public Circle() {
		super();
	}
	
	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
	
}