/*3 Write a program to find the factorial value of any number entered through the keyboard.  */
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the non negative integer: ");
		int num = input.nextInt();
		num = Math.abs(num);// if the number entered is negative 
		int fact =1;
		if(num!=0)
			
		{
			 for(int i=1;i<=num;i++){    
			      fact=fact*i;    
			  }    
		}
		System.out.println(" Factorial of "+num+ " is : "+fact);
		
		}

}
