import java.util.InputMismatchException;
import java.util.Scanner;

//WJP to find factorial of a number using recursion *
public class Problem28 {

	
		 public static void main(String args[]){ 
			 System.out.println("Enter an integer only:");
			 Scanner input = new Scanner(System.in);
			 int number = validInteger(input);
			 
		  int i,fact=1;  
		 
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
		 
		 
		 
		 
		 static int factorial(int n){    
			  if (n == 0)    
			    return 1;    
			  else    
			    return(n * factorial(n-1));    
			 }    
		 
		 
		 
		 public static int validInteger( Scanner input)
			{
				int num=0;
				while(true) {
					try {
						num = input.nextInt();
						}
					catch(InputMismatchException e)
					{
						input.next();
						System.out.println("Enter an integer only . Try Again:");
						continue;
						
					}
					break;
					
					
						
					
					}//end of for loop
					
				
				return num;
			}


}
