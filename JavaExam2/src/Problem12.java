import java.util.Scanner;

public class Problem12 {
	public static void main(String args[])
	   {
		 Scanner input = new Scanner(System.in);
	     
		 System.out.println("you want to find a  palindrome of 1.integer or 2. String");
		 int in = input.nextInt();
		 if(in==1)
		 {
			 palindromeNumber(input);
		 }
		 else if(in==2)
		 {
			 palindromeString(input);
		 }
		 else
		 {
			 System.out.println("Invalid option");
		 }
	         
	   }

	public static void palindromeNumber(Scanner input){  
		
		  int r,sum=0,temp;    
		  System.out.println("Enter integer to check if it is a palindrome");
	      int n = input.nextInt();
	     
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
	
	public static void palindromeString(Scanner input){  
	      String original, reverse = ""; 
	     
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = input.nextLine();
	     
	      int length = original.length();
	     
	      for (int i = length - 1; i >= 0; i--)
	         reverse = reverse + original.charAt(i);
	         
	      if (original.equals(reverse))
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
		}
}

