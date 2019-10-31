/*6. Write Java statements that do the following:
	a) Declare an array numArray of 15 elements of type int. 
	b) Output the value of the tenth element of the array alpha. 
	c) Set the value of the fifth element of the array alpha to 35. 
	d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
	 e. Get the average of all the items in the array and display it.
	*/
public class Problem6 {

	public static void main(String[] args) {
		
	
		int numArray[] = {2,4,2,4,66,77,4,86,54,1,4,0,46,43,23};
		System.out.println("10th element of an array: "+numArray[9]);
		numArray[4]=35;
		
		System.out.println("5th element of an array is : "+numArray[4]);
		numArray[8]= numArray[5]+numArray[12];
		System.out.println("9th element of an array is: "+numArray[8]);
		int total=0;
		for(int i =0; i<15;i++)
			{
		
				total+=numArray[i];
			}
	System.out.println("Average of 15 numbers are: "+((double)total/15));

}
}