package Day_11;

public class MethodChaining {

public static void main(String[] args) 
{
	String str = "india";
	char ch = str.concat(" is great").toUpperCase().charAt(0);
	System.out.println(ch);

}

}

