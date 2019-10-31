import java.util.Scanner;

public class FactorialNumber {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,fact = 1;
		System.out.println("Enter the number to calculate factorial");
		n = input.nextInt();
		for(int i = 1; i<= n; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of"+n+"is:"+fact);
		
		

	}

}
