import java.util.Scanner;

public class EnterGenderDo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		do
		{
		System.out.println("Enter your gender");
		String g = input.next()	;
		char gender = g .charAt(0);
		if(gender =='m'|| gender == 'f') {
		System.out.println("You enter right input");
		break;
		}
		else 
		{ 
			System.out.println("You enter wrong input please enter the right input");
		continue;	
		}
		} while(true);
		}
		}
	
	
	
		
		
	



