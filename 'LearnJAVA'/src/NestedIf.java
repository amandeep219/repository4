import java.util.Scanner;

public class NestedIf {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Gender");
		String g = input.nextLine();
		char gender = g.charAt(0);
		System.out.println("Enter Age");
		int age = input.nextInt();
		if(gender=='m'||gender=='M')
		{
			if(age>=18)
			{
				System.out.println("He is an adult");
			}
			else
			{
				System.out.println("He is an not adult");
			}
		}
		
		if(gender=='g'||gender=='G')
		{
			if(age>=18)
			{
				System.out.println("She is an adult.");
			}
			else
			{
				System.out.println("She is an not adult");
			}
		}
		
		
		

	}

}
