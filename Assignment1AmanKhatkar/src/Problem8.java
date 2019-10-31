/*a) Write a statement that declares a string array initialized with the following strings: 
		"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday". 
		b) Write a loop that displays the contents of each element in the array that you declared.*/

public class Problem8 {
	
	public static void main(String[] args) {
		String[] myStringArray = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};
		for (String s:myStringArray)
		{
			System.out.println(s);
		}
	}

}
