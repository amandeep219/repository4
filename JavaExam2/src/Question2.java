import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		int number=0, fact=1;
		Scanner input = new Scanner(System.in);	
		System.out.println(" enter an integer: " );
		while(true) {
		try {
			number=Math.abs(input.nextInt());
			break;
			 
		}
		catch(InputMismatchException e)
		{
			input.next();
			System.out.println("Enter an integer only . Try Again:");
			
		}
		
		
			
		
		}//end of for loop
		if(number==0||number==1)
		{
			
			System.out.println("Factorial of "+number+" is: "+fact);
		}
		else 
		{
			for(int i = 1; i <= number; i++)
	        {
	            fact = fact * i;
	        }
			System.out.println("Factorial of "+number+" is: "+fact);
		}
			
	
	

	}

}
