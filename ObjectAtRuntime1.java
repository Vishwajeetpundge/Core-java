package Day_0;

class Student
{
	public void greet()
	{
		System.out.println("Welcome Student");
	}
}
class Sample    
{
	public void greet()
	{
	  System.out.println("Hello Batch 39!!!!");	
	}
}
public class ObjectAtRuntime1 
{
	public static void main(String[] args) throws Exception
	{
		Object obj = Class.forName(args[0]).newInstance(); 
		
		if(obj instanceof Sample)
		{
		   Sample s1 = (Sample) obj;
		   s1.greet();	
		}
		else if(obj instanceof Student)
		{
		   Student s1 = (Student) obj;
		   s1.greet();	
		}
	}
}
