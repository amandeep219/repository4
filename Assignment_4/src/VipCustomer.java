//Constructor: Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // test and confirm it works.
public class VipCustomer {
	String name;
	int creditLimit;
	String emailAddress;
	
	public VipCustomer()
	{
		
	}
	
	public VipCustomer( String name, int creditLimit)
	{
		this.name = name;
		this.creditLimit=creditLimit;
		
	}
	
	public VipCustomer( String name, int creditLimit, String emailAddress)
	{
		this.name = name;
		this.creditLimit=creditLimit;
		this.emailAddress=emailAddress;
		
	}


	public static void main(String[] args) {
		VipCustomer v1 = new VipCustomer();
		System.out.println("name: "+v1.name+", Credit limit: "+v1.creditLimit+", EmailAddress: "+v1.emailAddress);
		VipCustomer v2 = new VipCustomer("Aman",500);
		System.out.println("name: "+v2.name+", Credit limit: "+v2.creditLimit+", EmailAddress: "+v2.emailAddress);
		VipCustomer v3 = new VipCustomer("Aman",500,"aman.khatkar03@gmail.com");
		System.out.println("name: "+v3.name+", Credit limit: "+v3.creditLimit+", EmailAddress: "+v3.emailAddress);
		
	}

}
