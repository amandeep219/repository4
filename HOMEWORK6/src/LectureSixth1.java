import java.util.InputMismatchException; 
import java.util.Scanner;
public class LectureSixth1 {
	public static void getTwoFloats(float [] myFloats, Scanner  readInput){ 
		do {
			System. out .print("Enter two floats separated by a space:");
			try {
				myFloats[0] = readInput.nextFloat();
				myFloats[1] = readInput.nextFloat();
				break;
			} catch (final InputMismatchException e) {
				 System. out .println("You have entered an invalid input. Try again.");
				 readInput.nextLine();
				 continue;
			}
		} while (true);
	}
	public static void main(String[] args) {

		Scanner rI = new Scanner(System.in);
		float [] myFloats = new float[2];
		System. out. println("\n Welcome to bonus get two floats program\n\n");
		

getTwoFloats (myFloats, rI); 
System. out .printf("You entered %5.2f and %5.2f successfully!\n",myFloats[0], myFloats[1]);
System. out .println("Thank you for giving two floats");
rI.close();
				
			}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	








}
	
			

}
