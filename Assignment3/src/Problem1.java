//a) Write a statement that declares a string array initialized with the following strings: 
//	"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday". 

//b) Write a loop that displays the contents of each element in the array that you declared.
public class Problem1 {

	public static void main(String[] args) {
		
		String[] s = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		for(int i = 0; i<7;i++)
		{
			System.out.println(s[i]);
		}

	}

}
