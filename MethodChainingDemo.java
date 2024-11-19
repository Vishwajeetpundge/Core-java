package Day_11;

public class MethodChainingDemo {
	
	public static void main(String[] args) 
	{
		String str = "Hyderabad";
		int len =  str.concat(" is an IT city").toLowerCase().length();
		System.out.println(len);
	}

	}
	
