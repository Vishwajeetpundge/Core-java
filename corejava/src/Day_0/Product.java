package Day_0;

import java.util.Scanner;

public class Product//blc
	{
	   String productname;  //Instance Variable
	   double productprice; //Instance Variable
	   int productid; //Instance Variable
	   
	   //Object Behavior
	   public void setProductData()
	   {Scanner sc = new Scanner(System.in);
		   System.out.println("Name of product is :");
		   this.productname=sc.nextLine();
		   this.productname=sc.nextLine();
		   
		   System.out.println("The price is :");
		   this.productprice=sc.nextDouble();
		   
		   System.out.println("And product Id is :");
		   this.productid=sc.nextInt();
		   
	   }
	   
	   public void getProductInfo()
	   {
		   System.out.println("");
		   System.out.println("Name of product is :"+productname);
		   System.out.println("The price is :"+productprice);
		   System.out.println("And product Id is :"+productid);
	   }
	   
	   
	   
	}
}
