package Day_11;
class Foo
{
	
}

public class PlatformClassLoaderDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Super class of platform class loader is :");
		System.out.println(Foo.class.getClassLoader().getParent().getParent());

	}

}
