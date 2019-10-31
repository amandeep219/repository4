
public class TryCatch {
	
public static void main(String[] args) {
	
	
		
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } 
		
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter within range.");
		}
		
		
		
		finally {
		      System.out.println("The 'try catch' is finished.");
		    }
    System.out.println("I am done");
	
	

try
{
	String name = null;
    System.out.println(name.length());
    
}

catch(NullPointerException e)
{
	System.out.println("cannt point");
}

try {

int result = 5/0;
}
catch(ArithmeticException e)
{
	System.out.println("never divide by 0");
}


try {
   
    String s = "FOOBAR";
    
    int i = Integer.parseInt(s);
    int v = Integer.parseInt("34");


    
    System.out.println("int value = " + i);
}
catch (NumberFormatException nfe) {
	System.out.println("cannot conert string into int");
}


}
}
