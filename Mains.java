package vishu_01;
interface Calculator 
{
	public abstract void calculateSum (double... x);

}

class SimpleCalculator implements Calculator
{
	@Override
	public void calculateSum(double...n)
	{
		double sum=0;
		for(double i:n)
		{
			sum=sum+i;
		}
		System.out.println("Sum is :"+sum);
		
	}
	

}

public class Mains 
{
	public static void main(String[] args)
	{
	
	Calculator sum=new SimpleCalculator();
	sum.calculateSum(12,15);
	sum.calculateSum(6.2,9.1);
	sum.calculateSum(12,10,20,20.2);
	}
}