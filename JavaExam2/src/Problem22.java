import java.util.Scanner;

//WJP to convert int to string 
public class Problem22 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer:");
		
		try {
			String value = String.valueOf(input.nextInt());
			System.out.println(value+" is of" +value.getClass().getName()+" type");
			
			}
			
			catch(NumberFormatException e)
			{
				System.out.println("Cann't convert into string");
			}
			
		
		
		 

	}

}
