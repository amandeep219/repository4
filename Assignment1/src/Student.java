
public class Student {

	int  c;
	static int d = 50;
	
public void  subtraction (int a,int b) {
	
	 
		 c = a-b;
		 
		 
		 System.out.println("The subtraction is"+ c);
		 System.out.println("The value of d" + d);
		 
		 
	 }
public static void addition (int a,int b) {
	
	 
	int c = a+b;
	 
	 
	 System.out.println("The addition is"+ c);
	 System.out.println("The value of d" + d);
	 
}
public static void main(String[] args) { 
	Student obj = new Student();

	Student.addition(5,10);
	obj.subtraction(10,5);
	obj.addition(60, 70);
}

}
