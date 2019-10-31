import java.util.Scanner;

public class Problem11 {
	
	    public static void main(String[] arg) {
	    	Scanner input = new Scanner(System.in);
	    	 System.out.println("Enter string: ");
	    	 
	        
	       String str=  input.nextLine();
	       System.out.println("Enter string to split: ");
	       String str1=  input.nextLine();
	       
	        String[] arrOfStr = str.split(str1);
	        for (String a: arrOfStr)
	            System.out.println(a);
	    }
	}


	

	


