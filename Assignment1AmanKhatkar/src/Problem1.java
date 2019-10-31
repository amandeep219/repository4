import java.util.Scanner;

//1. Write java program to display Fibonacci Series using while loop
public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Of how many numbers You want to create fibonacci series: ");
		int num = input.nextInt();
		
		int n1 = 0, n2 = 1;
        System.out.print("series of first " + num + " terms: ");
        int i = 0;
        while(i<=num)
        {
        	System.out.print( n1+ " + ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            i++;
        	
        }
        
        
        }
    }

	


