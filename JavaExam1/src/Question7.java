import java.util.Scanner;

//Q7: Write a Java program to segregate all 0s on left side and all 1s on right side of a given
//array of 0s and 1s.
public class Question7 {

	public static void main(String[] args) {
		int a[] = {0,1,1,0,1,0,0,1,1,0,0,1};
		int count0=0;
		int count1=0;
		for(int i = 0; i<12;i++)
		{
			if(a[i]==0)
			
				count0++;
			
			else
				count1++;
			
		}
		
		for(int i = 0; i<count0;i++)
		{
			a[i]=0;
			System.out.print(a[i]);
		}
		for(int i = count0;i<12;i++)
		{
			a[i]=1;
			System.out.print(a[i]);
		}
		}
			
	}
		 
		


