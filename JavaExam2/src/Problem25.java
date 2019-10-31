import java.util.InputMismatchException;
import java.util.Scanner;

// Write a program for binary search. And 5 i/p has to take from user as binary elements. 
public class Problem25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter five integers: " );
		for(int i =0; i<5;i++) {
		arr[i]=validInteger(input);}
		 int last=arr.length-1;  
		 System.out.println("Enter element to search" );
		 int key = validInteger(input);
	     binarySearch(arr,0,last,key);  
		}
			

	
	public static void binarySearch(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
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


