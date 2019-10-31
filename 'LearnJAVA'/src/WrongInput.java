import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		do {
			
			
		
		System.out.println("Enter an roll no: ");
		
		try {
		int rollNum = input.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter integer only. pls try again  ");
			continue;
		}
		
		while(true);
		}
		
		
		
		
		
		System.out.println("thank you for ur input");
	}

}
