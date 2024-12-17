package My_Package.O1.com;

interface  Drawable
{
	 abstract void draw();
}
public class LambdaTarget 
{
	public static void main(String[] args) 
	{
	 Drawable d = ()-> System.out.println("Drawing");
	 d.draw();
	}
}