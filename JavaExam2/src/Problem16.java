// Write a method that will remove given character from the String? 
import java.util.Scanner;

public class Problem16 {

	public static void main (String [] t) {
		Scanner input = new  Scanner(System.in);
		System.out.println ("Enter String");
		String str=input.nextLine();
		
		System.out.println ("Enter character to remove");
		String s =input.nextLine();
		char ch=s.charAt(0);

   	 System.out.println (removeChar (str,ch));
   
      }

     public static String removeChar(String string, char charToBeRemoved) {

       if (string == null)
            return "";

      
   	    StringBuilder strBuild = new StringBuilder ();

       for (int i = 0; i < string.length (); i++) {
           char chr = string.charAt (i);
           if (chr == charToBeRemoved)
               continue;
           strBuild.append (chr);
       }
       return strBuild.toString ();
   }
}
