package My_Package.O1.com;


public class ChildClass extends ParentClass
{
	public void loadingClass(String className) throws ClassNotFoundException
	{
		if(className.length()==0)
		{
			throw new IllegalArgumentException("Class name cannot be empty");
		} else {
			super.loadingClass(className);
		}
	}
} 
