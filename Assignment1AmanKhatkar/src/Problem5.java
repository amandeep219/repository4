import java.util.Scanner;

/*5 Write a method named isEven that accepts an int argument. The method should return true if the argument is even, 
 or false otherwise. Also write a program to test your method.*/
public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		if(isEven(num))
		{
			System.out.println(num+" is even");
		}
		else
			
			{
				System.out.println(num+" is not even or it is odd");
			}
		input.close();
		
	}
	
	public static boolean isEven(int number)
	{
		if (number%2==0)
			return true;
		else
			return false;
	}

}
