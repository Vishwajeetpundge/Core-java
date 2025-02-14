package My_Package.O1.com;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		
	
	String s1= "wel7come,ja@va";
	
	String[] arr = s1.split("[,\\d@]");
	System.out.println(Arrays.toString(arr));

	//for(String s : arr)
	//{
		//System.out.println(Arrays.toString(arr));
	//}
	

}
}
