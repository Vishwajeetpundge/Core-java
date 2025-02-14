package My_Package.O1.com; 
import java.nio.charset.StandardCharsets;

public class test001 {  
    public static void main(String[] args) { 
        String s1 = "welcome to naresh it"; 
        byte[] bytes = s1.getBytes(StandardCharsets.UTF_16); 
        String res = new String(bytes,StandardCharsets.UTF_8); 
        System.out.println(res); 
      
    }   }
