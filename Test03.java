package My_Package.O1.com;

import java.util.*;
public class Test03
{
	private String a;
	public Test03(String a) 
	{
	this.a = a; 
	}
	
	@Override
	public String toString() {
		return "Test03 [a=" + a + "]";
	}

	public static void main(String[] args) 
	{
	HashSet<Object> hash = new HashSet<Object>();
	Test03 ms1 = new Test03("MarutiCurvo");
	Test03 ms2 = new Test03("MarutiCurvo");
	String a1 = new String("MarutiCurvo");
	String a2 = new String("MarutiCurvo");
	hash.add(ms1); 
	hash.add(ms2); 
	hash.add(a1); 
	hash.add(a2);
	hash.forEach(System.out::println);
	
	
	System.out.println(hash.size()); 
    }
}