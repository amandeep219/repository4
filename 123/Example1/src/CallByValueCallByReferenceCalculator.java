
public class CallByValueCallByReferenceCalculator {
	int a;
	int b;
	
	public int addition(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public int addition(Calculator1 obj1) {// adding instance variable of calculator1 class
		int c = obj1.a+obj1.b;// here it is acessing instance variabls of Calculator 1
		return c;
	}
	

}
