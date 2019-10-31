import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Problem5 {

	public static void main(String[] args) {
		
		
		int a[] = {2,4,2,5,7,1,5,4,8,9,9,55,32};
		System.out.println("Original array is: ");
		for (int i = 0; i < a.length; i++)
		{ 
			System.out.println(a[i]);
		}
		
		System.out.println("Duplicate numbers are: ");
		for (int i = 0; i < a.length; i++)
		{ 
			for (int j = i + 1 ; j < a.length; j++) 
			{ 
				if (a[i]==a[j])
				{ 
					System.out.println(a[i]);
				}
			}
		}
		
		System.out.println("Unique numbers are: ");
		for (int i = 0; i < a.length; i++) 
        { 
            
            int j; 
            for (j = 0; j < i; j++) 
            if (a[i] == a[j]) 
                break; 
      
            
            if (i == j) 
            System.out.print( a[i] + " "); 
        } 
		
           
        } 
}
        
        
  

			
	



