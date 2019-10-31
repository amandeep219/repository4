
public class Calculator00 {

	public static void main(String[] args) {
		  Calculator0 calculator = new Calculator0(10,8);
		  
		  int result = calculator.addition();
		  System.out.println("Add two numbers "+ calculator.addition());
		  
		  int result1 = calculator.subtraction();
	      System.out.println("Subtract two numbers "+ calculator.subtraction());
	      
	      //I want  to change the values i pass the A and B .Need to create a new object.
	      
	      Calculator0 cal0 = new Calculator0(20,2);
	      float result2 = cal0.multiplication();
	      System.out.println("Multiplication of two numbers" + cal0.multiplication());
	      
	      int result3 = cal0.division();
	      System.out.println("Division of two numbers"+ cal0.division());
	      
	      
	      }	     

}
