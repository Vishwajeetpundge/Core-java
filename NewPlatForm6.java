package My_Package.O1.com;

public class NewPlatForm6 implements Runnable {
    public void run() 
    { 
    	System.out.printf("%d", 3); 
    }
    public static void main(String[] args)
        throws InterruptedException
    {
        Thread thread = new Thread(new NewPlatForm6());
        thread.start();
        System.out.printf("%d", 1);
        thread.join();
        System.out.printf("%d", 2);
    }
}