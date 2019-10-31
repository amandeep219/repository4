import java.util.Scanner;

public class AccessReference {

	public static void main(String[] args) {
		Reference objr = new Reference();
		objr.addition(12, 10);// call by value
		Calculator1 obj = new Calculator1(5,10);
		System.out.println(obj.a);//will print 5
		System.out.println(obj.a+obj.b);// will add instance variable of a and b
		objr.addition(obj);// call by reference
		objr.subtraction(obj);
		objr.multiplication(obj);
		objr.division(obj);
		
		
		System.out.println(objr.addition(obj)); // adding instance variable of calculator1 class
		System.out.println(objr.subtraction(obj)); 
		System.out.println(objr.multiplication(obj));
		 
		System.out.println(objr.division(obj));
		 
		
		 
		Calculator2 obj1 = new Calculator2(10,3);
		objr.multiplication(obj1);
		
		System.out.println(objr.multiplication(obj1));
		
		Scanner input = new Scanner(System.in);
		objr.getInput(input);
		
		Scanner input1 = new Scanner(System.in);
		objr.getValue(input1);
		
}


}