
public class AcessCallByValueandCallByReference {

	public static void main(String[] args) {
		CallByValueCallByReferenceCalculator c1 = new CallByValueCallByReferenceCalculator();
		System.out.println(" Addition of two numbers is "+c1.addition(10, 20));//call by value
		
		Calculator1 obj1 = new Calculator1(2,4);
		System.out.println(" Addition of two numbers is "+c1.addition(obj1));//call by refernce it means passing address/reference
		
	}

}
