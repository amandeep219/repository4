
public class Calculation {
	public static void main(String args[]) { 
		System.out.println("subtraction of two numbers is"+ Math.subtractExact(10,2));
	//Math is built in class in Java library
		// all functions in MAth class are static
		//So we can acess its members directly with class name (Math)
		//we dont need to create object to access members of Math class
		
		// 20+(10-2)
		
		int result = 20+ Math.subtractExact(10,2);
		System.out.println("The result  is "+ result);
		System.out.println("max of two numbers is "+ Math.max(30,70));
		System.out.println("aqaure root of 25 is  "+ Math.sqrt(25));
	
	}

}
