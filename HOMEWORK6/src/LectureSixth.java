import java.util.InputMismatchException; 
import java.util.Scanner; 
public class LectureSixth {
	public static int getUserChoice(Scanner readInput){ 
		int inputInt; 
		do {
			System. out .print("Enter your choice between 1 and 5                                     "
					+ " only: "); 
			try { 
				inputInt = readInput.nextInt(); 
			if (inputInt >= 1 && inputInt <= 5) { 
			break; 
			} else { 
					System. out .println("You have not entered a number between 1 and 5.Try again."); 
							
							  
			continue;
				}
			} catch (final InputMismatchException e) { 
				System.out .println("You have entered an invalid choice.Try again.");
				readInput.nextLine(); 
				continue; 
			}
		   } while (true); 
		   return inputInt; 
				
						
						
	    }
			
		}
	


