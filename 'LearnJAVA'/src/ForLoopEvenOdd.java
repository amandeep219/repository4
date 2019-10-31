import java.util.Scanner;
public class ForLoopEvenOdd {
	

	

			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				
				
	          for(int i =0; i<100;i++)
			 {
					System.out.println("Enter number to check even or odd");
					int a = input.nextInt();
				
				if(a%2==0) {
					System.out.println("Number is even");
				}
				else {
					System.out.println("Number is odd");
				}
					System.out.println(" Enter 1 to continue OR enter 0 to exit");
					int choice = input.nextInt();
					if(choice == 0)
					{
						break;
					}
					else if(choice==1)
					{
						continue;
					}
					
			 }	//end of for loop
				System.out.println(" Thank you. I hope you checked all your number");
		}

	}



