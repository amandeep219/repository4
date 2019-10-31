
public class AccessCalculator3 {

	public static void main(String[] args) {
	
		Calculator3 obj3 = new Calculator3();
		int result = obj3.addition(10,20);
		System.out.println("The addition of two numbers"+ result);
	    System.out.println("The addition of two numbers" + obj3.addition(3,4));
		
		int result1 = obj3.addition(40,50);	
		System.out.println("The addition of two numbers"+ result1);

		int result2 = obj3.subtraction(20,10);
		System.out.println("The subtraction of two numbers"+ result2);
	    System.out.println("The subtraction of two numbers"+ obj3.subtraction(30,10));
	    
        System.out.println("The multiplication of two numbers"+ obj3.multiplication(30,5));
        
        double result3 = obj3.division(40,30);
        System.out.println("The division of two numbers" +result3);
        System.out .println("The division of two numbers"+ obj3.division(50, 10));
        
        Calculator6 obj6 = new Calculator6();
        obj6.setA(20);
        obj6.setB(10);
        System.out.println("The addition of two numbers"+obj6.addition());
        
        obj6.setB(70);
        System.out.println("The addition of two numbers"+obj6.addition());
        System.out.println("The value of a"+obj6.getA());
        System.out.println("The value of a"+obj6.a);
        
        obj6.printing("Rehmat");
        Calculator6.printing("Aman");
        
        obj6.printing1();
        
        int sub = obj6.getA() - obj6.getB();
        System.out.println("The subtraction of a and b is "+sub);
        System.out.println(obj3);
        System.out.println(obj6);
        int a = 5;
        System.out.println(a);
        System.out.println(obj3);
        
        
        
	}
}