package Day_11;

public class Bike extends Vehicle {
	String Type;
	
	public Bike(String Make,String Model,int Year,String Type) {
		super(Make,Model,Year);
		this.Type=Type;
	}
	
	public void dispalyDetails() {
		System.out.println("Bike Make :"+Make);
		System.out.println("Bike Model :"+Model);
		System.out.println("Bike Year :"+Year);
		System.out.println("Bike Type :"+this.Type);
	}

}
