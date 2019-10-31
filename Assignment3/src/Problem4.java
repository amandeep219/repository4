//Given an array of integers, print only odd numbers.
import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		
		int a [] = {2,4,3,6,8,3,7,9,8,9};
		
		System.out.println("from the following list: ");
		
		for(int i =0; i<10;i++)
		{
			
				System.out.println(a[i]);
			
		}
		
		System.out.println("Odd numbers are: ");
		for(int i =0; i<10;i++)
		{
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		

	}

}
