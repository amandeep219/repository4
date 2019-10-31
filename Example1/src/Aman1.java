
public class Aman1 {

	public static void main(String[] args) {
		CALCULATOR CAL1 = new CALCULATOR();
		int result = CAL1.addition(20,8);
		System.out.println("Add two numbers"+ CAL1.addition(20,8));
		System.out.println("Subtract two numbers"+ CAL1.subtraction(30,1));
		
		CAL1.print("Aman"," bajwa");
		CALCULATOR.print("aman", "bajwa");
		
		CAL1.printing("Ranjodh","Rehmat");
		System.out.println("The value of a is" + "Ranjodh");
	
		System.out.println("The value of a is" + "Rehmat");
		
	}

}
