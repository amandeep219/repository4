import java.util.Scanner;

//Write a Java program to reverse the element of an integer 1-D array.
public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("how many elements you want to enter in an array: ");
		int n = input.nextInt();
		System.out.println("Enter elements of an array");
		int a[] = new int[n];
		int reverseA[] = new int[n];
		int j=0;
		j=n;
		for(int i =0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		
		for (int i = 0; i < n; i++) { 
            reverseA[j-1] = a[i]; 
           j= j-1; 
          
           
        } 
		
		for(int i =0;i<n;i++)
		{
			 System.out.println(reverseA[i]);
		}
		
		
		
		

	}

}
