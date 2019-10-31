import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem32 {
	
	
	    public void merge( int[] A, int[] B, int size_A, int size_B )
	    {
	        int total_size = size_A + size_B;
	        int point_A = size_A - 1;
	        int point_B = size_B - 1;
	        for( int i = total_size - 1; i >= 0; i-- )
	        {
	            if( point_A >= 0 && point_B >=0 )
	            {
	                if( A[point_A] >= B[point_B] )
	                {
	                    A[i] = A[point_A--];
	                }
	                else
	                {
	                    A[i] = B[point_B--];
	                }
	            }
	            else if( point_B >= 0 )
	            {
	                A[i] = B[point_B--];
	            }
	            else
	            {
	                break;
	            }
	        }
	    }
	    public static void main( String[] args )
	    {
	    	Scanner input = new Scanner(System.in);
	    	
			
			System.out.println("How many numbers you want to enter for first array: " );
			int n1 = input.nextInt();
			int arr1[] = new int[n1];
             System.out.println("Enter elements: " );
			
			for(int i =0; i<arr1.length;i++) {
			arr1[i]=validInteger(input);
			}
			System.out.println("How many numbers you want to enter for second array: " );
			
			int n2 = input.nextInt();
			 System.out.println("Enter elements: " );
			int arr2[] = new int[n2];
			
			
			for(int i =0; i<arr2.length;i++) {
				arr2[i]=validInteger(input);
				}
			
	       
	        Problem32 m = new Problem32();
	        m.merge( arr1, arr2, arr1.length, arr2.length);
	        for( int i = 0; i < arr1.length; i++ )
	        {
	            System.out.print( arr1[i] );
	        }
	        System.out.println();
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


