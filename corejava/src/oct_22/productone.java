package oct_22;


import java.util.Scanner;

public class productone//blc
	{
	   String productonename;  //Instance Variable
	   double productoneprice; //Instance Variable
	   int productoneid; //Instance Variable
	   
	   //Object Behavior
	   public void setProductData()
	   {Scanner sc = new Scanner(System.in);
	   System.out.println("And product Id is :");
	   this.productoneid=sc.nextInt();
		   System.out.println("Name of product is :");
		   this.productonename=sc.nextLine();
		   this.productonename=sc.nextLine();
		   
		   System.out.println("The price is :");
		   this.productoneprice=sc.nextDouble();
		   sc.close();
		 
		   
	   }
	   
	   public void getProductInfo()
	   {
		   System.out.println("");
		   System.out.println("Name of product is :"+productonename);
		   System.out.println("The price is :"+productoneprice);
		   System.out.println("And product Id is :"+productoneid);
	   }
	   
	   
	   
	}

