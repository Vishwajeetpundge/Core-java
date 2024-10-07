package Day_1;

public class Fahrenheit_To_Celsius {
	public static void main(String[]args) {
		double f=Double.parseDouble(args[0]);
		double c=((f-32)*5)/9;
		System.out.println("Temprature in Celcius is "+ c);
		System.out.printf("Temprature in Celcius is %.2f",c);
	}

}

/*
Temprature in Celcius is 37.77777777777778
Temprature in Celcius is 37.78
*/