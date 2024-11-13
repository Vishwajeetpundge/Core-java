package Day_11;

public class Test {
	public static void main(String[]args)
	{
		Car car = new Car("BMW","M4",2022,4);
		System.out.println("Car Details:");
		car.displayDetails();
		
		Bike bike = new Bike("KTM","DUKE-390",2021,"Racing");
		System.out.println("\nBike Details:");
		bike.displayDetails();
		
		
	}

}
