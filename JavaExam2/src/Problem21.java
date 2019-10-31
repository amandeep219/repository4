// WJP to convert string to int *
import java.util.Scanner;

public class Problem21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String:");
		
		try {
		int value = Integer.parseInt(input.nextLine());
		System.out.println("String is converted into integer");
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Cann't convert into integer");
		}
		
		
		
		
		

	}

}
