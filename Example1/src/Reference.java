import java.util.Scanner;

//Reference class is telling : " I can add, subtract, multiply and divide instance variable of calculator 1 class.
// but you have to send me the address/refernce variable of calculator 1 class
// I m  not going to create it by myself
//i am telling this to accessreference class, if accessreference class wants to acess its members
public class Reference {
	

	public int addition(Calculator1 obj) {// calculator1 ia a userdefined data type and obj is dummy variable (call by referenec
		int c = obj.a+obj.b;
		return c;
	}
		
	public int addition(int a, int b) {// int is primitive data type a,b is a dummy variables(call by value)
		int c = a+b;
		return c;
	}
	
	
	public int subtraction(Calculator1 obj) {
		int c = obj.a-obj.b;
		return c;
	}
	public double multiplication(Calculator1 obj) {
		double c = obj.a*obj.b;
		return c;
		
	}
	public double division(Calculator1 obj) {
		double c = obj.a/obj.b;
		return c;
	}
		// adding instance variables of calculator1
		
	
	public int multiplication(Calculator2 obj)
	{
		int c =obj.a * obj.b;
		return c;	
    }
	public void getInput(Scanner input) {
		System.out.println("Enter an integer");
		int a = input.nextInt();
		System.out.println("You have enter"+a);
		
	}
    public void getValue(Scanner input1) {
    	System.out.println("Enter an integer");
    	int a = input1.nextInt();
    	System.out.println("You have entered "+a);
    	
    }
}