import java.util.Scanner;

/*4. Write a program with a method named get Total that accepts two integers as an argument
  and return its sum. Call this method from main( ) and print the results.*/
public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int firstNumber = input.nextInt();
		System.out.println("Enter senond integer: ");
		int secondNumber = input.nextInt();
		System.out.println("Sum of two integers are: "+getTotal(firstNumber,secondNumber));
		input.close();

	}
	
	public static int getTotal(int num1, int num2)
	{
		return num1+num2;
		
	}

}
