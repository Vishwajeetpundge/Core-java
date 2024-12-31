package My_Package.O1.com;

public class Tester {

	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		try {
			c.loadingClass(args[0]);
			System.out.println(args[0]+" Loaded Successfully");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
