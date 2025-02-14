package My_Package.O1.com;
import java.nio.charset.Charset;
public class Test01 {
public static void main(String[]args)
{
	String s1="abc  def";
	s1=s1.trim();
	System.out.println(s1.length());
	
	String s2="aaaa";
	System.out.println(s2.isBlank());
}
}
