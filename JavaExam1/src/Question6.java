import java.util.Scanner;

//Q6: Write Java program to check if a number is Armstrong number or not?
public class Question6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");   
		int number = input.nextInt();
		
		int c=0,a,temp;  
		   
		    temp=number;  
		    while(number>0)  
		    {  
		    a=number%10;  
		    number=number/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  
		
	}


