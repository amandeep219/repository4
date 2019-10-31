import java.util.Scanner;
public class BreakContinue {
	



		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			
			while(true) {
				System.out.println("Enter number to check even or odd");
				int a = input.nextInt();
			
			if(a%2==0) {
				System.out.println("Number is even");
			}
			else {
				System.out.println("Number is odd");
			}
				System.out.println(" Enter 1 to continue OR enter 0 to exit");
				int value = input.nextInt();
				if(value==0)
				{
					break;
				}
				else if(value==1)
				{
					continue;
				}
				
				
				
			}//end of while
			System.out.println(" Thank you. I hope you checked all your number.");
				
			}//end of main method
	}//end of class
			


