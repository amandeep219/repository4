import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

//Q1.	Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true *
public class Question1 {
	

	public static void main(String[] args) {
		boolean a =true, b= false, c=true;
		boolean boolValue=true;
		
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		int count=0;
		Scanner input = new Scanner(System.in);	
		System.out.println(" enter 3 boolean values: " );
		while(true) {
		try {
		
			System.out.println("Enter the value of a: " );
			 a = input.nextBoolean();
			 System.out.println("Enter the value of b: " );
			 b = input.nextBoolean();
			 System.out.println("Enter the value of c: " );
			 c = input.nextBoolean();
			 break;
			 
		}
		catch(InputMismatchException e)
		{
			input.next();
			System.out.println("Enter true or false . Try Again:");
			
		}
		
		
			
		
		}//end of for loop
		
		
		
		
	
		
		if(a)
		{
			count++;
			
		
			
		}
		if(b)
		{
			count++;
			
		}
		if(c)
		{
			count++;
			
		}
		
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		System.out.println("c is "+c);
		if(count>=2)
		{
			System.out.println("There are: "+count+" TRUE boolean variables");
		}
		
		else
		{
			System.out.println("There are less than 2 boolean variables");
		}
		
		
	}

}
