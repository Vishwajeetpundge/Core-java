package My_Package.O1.com;

public class CarUser {

	public static void main(String[] args) 
	{
		try {
		CarTest.stop("stop");
		}
		catch (CarStoppedException e) {
			System.out.println(e.getMessage());
		}
		try {
			CarTest.puncture("Puncture");
		}
		catch (CarPunctureException e) {
			System.out.println(e.getMessage());
		}
		try {
			CarTest.carHeat(60);
		}
		catch (CarHeatException e){
			System.out.println(e.getMessage());
		}
	}

}
