/*You are given two sorted arrays,
 *  A and B, and A has a large enough buffer at the end to hold B. Write a method to merge B into A in sorted order. **/
public class Question32 {

	public static void main(String[] args) {
		
		int a [] = new int[10];
		a[0] = 2;
		a[1]=4;
		a[2]=7;
		a[3]=9;
		
		int b[] = new int[3];
		b[0] = 2;
		b[1]=41;
		b[2]=77;
		
		int j=0;
		
		 for(int i = 4; i < a.length;i++) { 
			 
	         a[i] = b[j];
	         j= j+1;
	         if(j>=b.length)
	         {
	        	 break;
	         }
	        	
	      } 
		
		
		
		
		 for (int i = 1; i < (a.length-b.length); i++) {
			 
			    for (int k = i; k > 0; k--) {
			    	
			    	if (a[k] < a[k - 1]) {
			    		int temp = a[k];
			    		a[k] = a[k - 1];
			    		a[k - 1] = temp;
			     }
			    }
			   }
		 
			
			
			
			
		
		System.out.println("The sorted value of an array is:");
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
	}

}
