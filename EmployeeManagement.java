package Day_11;
class Person{
	String name;
	int age;
	
     public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void displayInfo() {
    	 System.out.println("name : "+name);
    	 System.out.println("age : "+age);
     }
}


class Employee3 extends Person{
	String employeeId;

	public Employee3(String name, int age, String employeeId) {
		super(name, age);
		this.employeeId = employeeId;
	}
	
	public void displayEmployeeInfo() {
		displayInfo();
		System.out.println("Employee Id : "+employeeId);
	}
	
}


class Manager extends Employee3{
	String department;

	public Manager(String name, int age, String employeeId, String department) {
		super(name, age, employeeId);
		this.department = department;
	}
	
	public void displayManagerInfo() {
		displayEmployeeInfo();
		System.out.println("Employee department : "+department);
	}
} 

public class EmployeeManagement {

	public static void main(String[] args) {
		Manager mg=new Manager("Alice",35,"E123","It");
		mg.displayManagerInfo();
	}

}