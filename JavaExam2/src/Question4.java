import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer value: ");
		int n = validInteger(input);
		int remainder=0,sum=0,temp;  
		
		
		 
		  
		  temp=n;    
		  while(n>0){    
		   remainder=n%10;  //getting remainder  
		   sum=(sum*10)+remainder;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
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
