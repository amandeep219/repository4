//Write a java program to so show static and non static variables and its functions
public class Problem3 {
int a =5;
static int b = 10;

public void print1()
{
	System.out.println(a+" is a non static variable");
}

public static void print2() {
	
	System.out.println(b+" is a static variable");
	
}
	public static void main(String[] args) {
		Problem3 obj =new Problem3();
		obj.print1();
		print2();
		
		
	}

}
