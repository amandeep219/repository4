//What is String subSequence method? *

/*This method returns a new character sequence that is a subsequence of this sequence.
 * syntax is: public CharSequence subSequence(int beginIndex, int endIndex)
 * 
 * where: beginIndex − the begin index, inclusive.

          endIndex − the end index, exclusive.
 * 
 * */
public class Question10 {

	public static void main(String[] args) {
		String Str = new String("My name is Amandeep Kaur ");

	      System.out.print("Subsequence is :" );
	      System.out.println(Str.subSequence(11, 25) );

	}

}
