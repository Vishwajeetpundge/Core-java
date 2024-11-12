package Day_0;

import java.util.Scanner;

public class ProductDemo {
	public static void main(String[]args) {
		Product laptop=new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Laptop Name: ");
		laptop.laptopBrand = sc.nextLine();
		
		System.out.println("Enter Laptop Price: ");
		laptop.laptopPrice = sc.nextDouble();
		
		System.out.println("Is It Ur Laptop Touchscreen?");
		laptop.isTouchScreen = sc.nextBoolean();
		
		laptop.getLaptopInformation();
		sc.close();
	}

}
