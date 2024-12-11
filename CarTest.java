package overriding_class;


abstract class Car{
	String brand;
	String model;
	int milage;
	int top_speed;
	int yearOfManufacturing;
	
	public Car(String brand, String model, int milage, int top_speed, int yearOfManufacturing) {
		super();
		this.brand = brand;
		this.model = model;
		this.milage = milage;
		this.top_speed = top_speed;
		this.yearOfManufacturing = yearOfManufacturing;
	}
	public String carBrand() {
		return brand;
	}
	public String carModel() {
		return model;
	}
	public int carMileage(){
		return milage;
	}
	public int carTopSpeed() {
		return top_speed;
	}
	public int carYear() {
		return yearOfManufacturing;
	}
	public abstract void display();
	
}
class Past extends Car{

	public Past(String brand, String model, int milage, int top_speed, int yearOfManufacturing) {
		super(brand, model, milage, top_speed, yearOfManufacturing);
		 
	}

	@Override
	public void display() {
		 System.out.println("Car Brand : "+super.carBrand());
		 System.out.println("Car Model : "+super.carModel());
		 System.out.println("Car Milage : "+super.carMileage());
		 System.out.println("Car Top Speed : "+super.carTopSpeed());
		 System.out.println("Car Year Of Manufacturing : "+super.carYear());
	}
	
	

}


public class CarTest {

	public static void main(String[] args) {
	 
		Car ca=new Past("Toyota","Mk-5",4,300,2020);
		ca.display();
	}

}

