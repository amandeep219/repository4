
public class AccessName {

	public static void main(String[] args) {
		Name name = new Name();
		name.printing("aman","bajwa");
		String fullname = name.printing1("aman","khatkar");
		System.out.println(fullname);
		name.parents("rehmat","ranjodh","aman",1);
		System.out.println("So "+name.ageGroup(12));
        name.printNme("rehmat","bajwa");
        
        
        
        ThankYou thankyou = new ThankYou("Sonia");
        System.out.println(thankyou.thanksPrinting("aman"));
        System.out.println(thankyou.thanksPrinting());
	}

}
