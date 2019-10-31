import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem6 {

	
	     
	    public static void main(String a[]){
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("How many integers you want to enter " );
			int n=validInteger(input);
			int arr[] = new int[n];
			int temp;
			System.out.println("Enter "+n+" values: " );
			for(int i = 0;i<n;i++) {
			
				arr[i]=validInteger(input);
				
			}//end of for loop
	         
	        
	        SelectionSort(arr);
	        for(int i:arr){
	            System.out.print(i);
	            System.out.print(", ");
	        }
	    }
	    
	    
	
	public static int[] SelectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
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


