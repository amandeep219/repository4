
public class AccessDataMembers {
	int a,b;
	public AccessDataMembers(int a,int b) {
		this.a=a;
		this.b=b;
		
	}

	public static void main(String[] args) {
		AccessDataMembers obj = new AccessDataMembers(5,10);
		System.out.println("The value of a is:"+obj.a);
		System.out.println("The value of b is:"+obj.b);
	}

}
