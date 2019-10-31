import java.util.Scanner;

//Q1: Take an array of integers on run time, print only odd numbers.
public class Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter ten integer number:");
		for(int i =0; i<10;i++)
		{
			a[i]=input.nextInt();
			
		}
		System.out.println("Odd numbers are: ");
		for(int i =0; i<10;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
			
			
		}
		
	
		

	}

}
