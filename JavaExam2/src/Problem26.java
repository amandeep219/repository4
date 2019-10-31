import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//WJP to merge two sorted array.
//(Do not use third array) array1[10] = 1,2,4,6,9,10	array2[4] = 3, 5,7,8	After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10 *
public class Problem26 {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		array1[0]=1;
		array1[1]=2;
		array1[2]=4;
		array1[3]=6;
		array1[4]=9;
		array1[5]=10;
		int[] array2 = new int[4];
		array2[0]=3;
		array2[1]=5;
		array2[2]=7;
		array2[3]=8;
		int j=0;
        for(int i = 6; i < array1.length;i++) { 
			 
	         array1[i] = array2[j];
	         j= j+1;
	         if(j>=array2.length)
	         {
	        	 break;
	         }
	        	
	      } 
        try {
        for(int i = 0; i < array1.length;i++) { 
			 
	        System.out.println(array1[i]);
	        	
	      } 
		
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println(e.getMessage());
        }

}
}
