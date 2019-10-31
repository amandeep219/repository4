import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem27 {
	
	private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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
    public static void main(String a[]){
    	Scanner input = new Scanner(System.in);
         
        Problem27 sorter = new Problem27();
        System.out.println("How many numbers want to enter:");
        int n = validInteger(input);
       
		 int number[] = new int[n];
		 System.out.println("enter numbers:");
		 for(int i = 0;i<n;i++)
		 {
			 number[i]=validInteger(input);
		 }
        
        sorter.sort(number);
        for(int i:number){
            System.out.print(i);
            System.out.print(" ");
        }
    }

}
