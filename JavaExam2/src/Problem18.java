import java.util.Scanner;

//WJP to display duplicate character in string 
public class Problem18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Enter something" ); 
		String str = input.nextLine();
		
		  int cnt = 0;
		  char[] arr = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (arr[i] == arr[j]) {
		     System.out.println(arr[j]);
		     cnt++;
		     break;
		    }
		   }
		  }

}
}
