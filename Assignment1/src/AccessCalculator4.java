
public class AccessCalculator4 {

	public static void main(String[] args) {
		Calculator4 obj4 = new Calculator4(10,5);
		int result4 = obj4.addition();
		System.out.println("The addition of two numbers"+result4);
		
		Calculator4 obj5 = new Calculator4(30,20);
		int result5 = obj5.subtraction();
	    System.out.println("The subtraction of two numbers"+result5);
	    System.out.println("The subtraction of two numbers"+obj5.subtraction());
	    }
	
	}
