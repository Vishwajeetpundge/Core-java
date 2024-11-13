package Day_11;

public class Vehicle {
String Make;
String Model;
int Year;

public Vehicle(String Make,String Model,int Year) {
	super();
	if(Year <=0) {
		System.out.println("Error Invalid Input");
		System.exit(0);
	}
		
	this.Make= Make;
	this.Model=Model;
	this.Year=Year;
	

} 
public void displayDetails()
{
	System.out.println("Vehicle Make: "+Make);
	System.out.println("Model is :"+Model);
	System.out.println("Model Year: "+Year);	
}
}
