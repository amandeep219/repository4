
public class Problem59 {

static void reverse(int arr[], int n, int k) 
		{ 
			for (int i = 0; i < n; i += k) 
			{ 
				int left = i; 
		        int right = Math.min(i + k - 1, n - 1); 
				int temp; 
				
				 
				while (left < right) 
				{ 
					temp=arr[left]; 
					arr[left]=arr[right]; 
					arr[right]=temp; 
					left+=1; 
					right-=1; 
				} 
			} 
		} 
		
		
		public static void main(String[] args) 
		{ 
			
			int arr[] = {1, 2, 3, 4, 5, 6, 7, 8}; 
			int k = 3; 
			
		 
		
			int n = arr.length; 
			System.out.println("Array before reverse operation: "); 
			
			for (int i = 0; i < n; i++) {
				System.out.println(arr[i] ); }
			
		
			reverse(arr, n, k); 
			System.out.println("Array after reverse operation: "); 
		
			for (int i1 = 0; i1 < n; i1++) 
				System.out.println(arr[i1] + " "); 
		} 
	}




