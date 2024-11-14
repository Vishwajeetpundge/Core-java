package Day_23;

public class Cylinder extends Circle{
	double height;

	public Cylinder(double radius, double height) {
		super(radius);
		if(height <=0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		this.height = height;
	}
	
	public Cylinder() {
		super();
	}
	
	public double getVolume() {
		double volume = 3.14 * super.radius * super.radius * this.height;
		return volume;
	}
}