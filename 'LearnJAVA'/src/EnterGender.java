import java.util.Scanner;

public class EnterGender {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter your gender");
		 String g = input.next();
		 char gender = g.charAt(0);
		 if(gender == 'M'||gender == 'F'|| gender == 'm' || gender == 'f') {
		 System.out.println("Thank you for the input");
		 break;
		 
		 }		 
		 else {
			 System.out.println("You have entered wrong value please enter M or F only");
			 continue;
		 }

	}

}
}