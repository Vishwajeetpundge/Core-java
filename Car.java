package Day_11;

public class Car extends Vehicle{
	int CarDoors;

	public Car(String Make, String Model, int Year,int CarDoors) {
		
	super(Make,Model,Year);
	if(CarDoors <=0) {
		System.out.println("Error Invalid Input");
		System.exit(0);
	}
	this.CarDoors = CarDoors;
}
 
	public void displayDetails() {
		System.out.println("Car :"+super.Make);
		System.out.println("Car Model :"+super.Model);
		System.out.println("Car Year :"+super.Year);
		System.out.println("No. of Doors :"+this.CarDoors);
	}
}