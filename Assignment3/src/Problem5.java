import java.util.Scanner;

//Given an array of integers, print only odd numbers.
public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter 10 numbers: ");
		for(int i = 0; i<10;i++)
		{
			a[i]= input.nextInt();
		}
		
		System.out.println("odd numbers are: ");
		for(int i = 0; i<10;i++)
		{
			
			if(a[i]%2!=0)
				System.out.println(a[i]);
				
			
		}

	}

}
