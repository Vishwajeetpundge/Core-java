package Day_1;

public class Salary_Bill {
	public static void main(String[]args) {
		double basic = Double.parseDouble(args[0]);
		System.out.println("------Salary Bill------");
		System.out.println("_______________________");
		System.out.println("Basic\t\t\t\t" + basic);
		System.out.println("HRA\t\t\t\t" +(basic*0.15));
		System.out.println("conveyance allowance\t\t"+(basic*0.15));
		System.out.println("Entertainment Allowance\t\t"+(basic*0.1));
		System.out.println("-----------------------");
		System.out.println("Total Salary\t\t\t"+(basic + (basic*0.15)+(basic*0.15)+(basic*0.1)));
		}

}
/*
------Salary Bill------
_______________________
Basic				10000.0
HRA				1500.0
conveyance allowance		1500.0
Entertainment Allowance		1000.0
-----------------------
Total Salary			14000.0
*/