
public class AccessCalculator2 {

	public static void main(String[] args) {

			Calculator2 obj2 = new Calculator2(5,10);
			int  result2 = obj2.multiplication();
			
	        System.out .println("multiplication of two numbers"+ result2);
	   
	        int  result3 = obj2.division();
	        System.out .println("division of two numbers"+ result2);
	        
	        Calculator7 obj7 = new Calculator7(); 
	        	       obj7.setA(10); 
	        	       obj7.setB(100);
	        	       System.out.println("The subtraction of two numbers"+ obj7.subtraction());
	        	       
	        	       obj7.setA(20);
	        	       obj7.setB(15);
	        	       System.out.println("The subtraction of two numbers"+obj7.subtraction());
	        	       
	        	       obj7.setA(10);
	        	       obj7.setB(2);
	        	       System.out.println("The subtraction of two numbers"+ obj7.subtraction());
	        	       System.out.println("The value of b"+ obj7.getB());
	        	       
	        	       
	        }
	}



