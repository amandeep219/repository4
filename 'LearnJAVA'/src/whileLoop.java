import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int choice = 1;
		while(choice==1) {
			System.out.println("Enter number to check even or odd");
			int a = input.nextInt();
		
		if(a%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
			System.out.println(" Enter 1 to continue OR enter o to exit");
			choice = input.nextInt();
			
		}//end of while
		System.out.println(" Thank you. I hope you checked all your number.");
			
		}//end of main method
}//end of class
		
		
		





