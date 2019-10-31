import java.util.Scanner;

//Q4: Write a Java program to calculate the average value of array elements..
public class Question4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter ten integer number:");
		for(int i =0; i<10;i++)
		{
			a[i]=input.nextInt();
			
		}
		
		int total=0;
		for(int i =0; i<10;i++)
		{
			
			total+= a[i];
		}
		
		double avg = total/10;
		System.out.println("Average of 10 numbers are: " +avg);
		
		
		

	}

}
