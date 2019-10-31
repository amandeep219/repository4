import java.util.Scanner;

//WJP to differentiate input as string, int or bool *
public class Problem23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter something:");
		
		  if (input.hasNextInt())
		   System.out.println("This input is of type Integer.");
		   
		  else if (input.hasNextLine())
		  System.out.println("This input is of type string."); 
		   
		  else if (input.hasNextBoolean())
		   System.out.println("This input is of type Boolean.");  
		   
		  
		 }
		
		
		
	}


