/*7 Write a program that creates an array of 10 elements size. Your program should prompt the user to input numbers in array and then 
 display the sum of all array elements.*/
import java.util.Scanner;
public class Problem7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[]= new int[10];
		int total=0;
		System.out.println("Enter ten numbers:");
		for(int i =0; i<10;i++)
		{
			a[i]=input.nextInt();
			total+=a[i];
		}
		System.out.println("Sum of ten numbers are: "+total);
		input.close();
		
				
	}

}
