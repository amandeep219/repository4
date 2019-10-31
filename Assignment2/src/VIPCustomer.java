//Constructor: Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // test and confirm it works.
public class VIPCustomer {
	String name;
	int creditLimit;
	String emailAddress;
	
	


	public VIPCustomer() {
		
	}
	public VIPCustomer(String name, int creditLimit) {
		this.name=name;
		this.creditLimit = creditLimit;
		
	}
	
	
	
	public VIPCustomer(String name, int creditLimit, String emailAddress) {
		this.name=name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
		
	}
	
	
	public static void main(String[] args) {
		
		VIPCustomer obj = new VIPCustomer();
		System.out.println(obj.name);
		System.out.println(obj.creditLimit);
		System.out.println(obj.emailAddress);
		
		VIPCustomer obj1 = new VIPCustomer("Aman",10000);
		System.out.println(obj1.name);
		System.out.println(obj1.creditLimit);
		System.out.println(obj1.emailAddress);
		
		VIPCustomer obj2 = new VIPCustomer("Aman",10000,"aman.khatkar03@gmail.com");
		System.out.println(obj2.name);
		System.out.println(obj2.creditLimit);
		System.out.println(obj2.emailAddress);
		
		
		

	}

}
