package oct_22;

public class studentdemo
{	
	public static void main(String[] args) 
	{
		student raj = new student();
		
		//Initialize the Object Properties using reference variable
		raj.name = "Prashant";
		raj.rollNumber = 001;
		raj.height = 5.7;
		
		//Calling the behavior
		raj.talk();
		//raj.writeExam();
		
		System.out.println("===================");
		
		student priya = new student();
		priya.name = "Pink Pussy Pinky";
		priya.height = 5.8;
		priya.rollNumber =141400;
		
		priya.talk();
		priya.writeExam();
		
		
	}

}