////WJP to compare two compare two array and display repeating numbers?
import java.util.Scanner;
public class Problem8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		
		System.out.println("Enter ten integer number for first array:");
		for(int i=0; i<10;i++)
		{
			a[i]=input.nextInt();
			
		}
		
		System.out.println("Enter ten integer number for second array:");
		for(int i =0; i<10;i++)
		{
			b[i]=input.nextInt();
			
		}
		System.out.println("Repeating numbers are: ");
		for(int i =0; i<10;i++)
		{
			if(a[i]==b[i])
				
			{
				System.out.println(a[i]);
			
			}
			
		}
		
		

	}


	}


