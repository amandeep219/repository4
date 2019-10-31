import java.util.Scanner;
import java.util.regex.Pattern;

public class Problem14 {
	static String reverseWords(String str) 
    { 
  
        
        Pattern pattern = Pattern.compile("\\s"); 
        String[] temp = pattern.split(str); 
        String result = ""; 
       for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result; 
    } 
  
   
    public static void main(String[] args) 
    { 
         
    	Scanner input = new Scanner(System.in);
	     
		 System.out.println("Enter String");
		 String s2= input.nextLine();
		
        System.out.println("original string is: "+s2); 
        System.out.println("Reverse string is: "+reverseWords(s2)); 
    } 

}
