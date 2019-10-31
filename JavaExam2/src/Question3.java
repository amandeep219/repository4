import java.util.InputMismatchException;
import java.util.Scanner;

//Given an array of integers, sort the integer values. *
public class Question3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
	
		System.out.println("How many integers you want to enter " );
		int n=validInteger(input);
		int arr[] = new int[n];
		int temp;
		System.out.println("Enter "+n+" values: " );
		for(int i = 0;i<n;i++) {
		
			arr[i]=validInteger(input);
			
		}//end of for loop
		
		
		 for (int i = 1; i < arr.length; i++) {
			 
			    for (int j = i; j > 0; j--) {
			    	
			    	if (arr[j] < arr[j - 1]) {
			    		temp = arr[j];
			    		arr[j] = arr[j - 1];
			    		arr[j - 1] = temp;
			     }
			    }
			   }
			
			
			
			
		
		System.out.println("The sorted value of an array is:");
		for(int i =0;i<n;i++)
		{
			System.out.println(arr[i]);
			
		}

	}
	public static int validInteger( Scanner input)
	{
		int num=0;
		while(true) {
			try {
				num = input.nextInt();
				}
			catch(InputMismatchException e)
			{
				input.next();
				System.out.println("Enter an integer only . Try Again:");
				continue;
				
			}
			break;
			
			
				
			
			}//end of for loop
			
		
		return num;
	}

}
