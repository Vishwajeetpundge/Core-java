package My_Package.O1.com;

public class CarTest {
	
	public static void stop(String msg) throws CarStoppedException
	{
		if(msg.equalsIgnoreCase("stop"))
		{
			throw new CarStoppedException("CarStoppedException OCCURED");
		}
		else 
		{
			System.out.println("Car is moving");
		}
	}
	
	public static void puncture(String msg) throws CarPunctureException
	{
		if(msg.equalsIgnoreCase("Puncture"))
		{
			throw new CarPunctureException("CarPunctureException OCCURED");
		}
		else {
			System.out.println("Car is not punctured");
		}
	}
	
	public static void carHeat(Integer temp) throws CarHeatException
	{
		if(temp>50)
		{
			throw new CarHeatException("CarHeatException OCCURED");
		}
		else
		{
			System.out.println("temprature is Ok");
		}
	}

}
