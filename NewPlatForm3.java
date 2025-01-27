package My_Package.O1.com;

class Check extends Thread
{
	public void run()
	{
		for(int i=0; i<=3; i++)
		{
			System.out.println("Hello Welcome here.."+i);
		}
	}
}
class NewPlatForm3
{
	public static void main(String[] args) 
	{
		Check t = new Check();
		t.start();
                Check t2= new Check();
		t2.start();
	}
}