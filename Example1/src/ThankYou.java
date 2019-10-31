
public class ThankYou {
	String userName;// instance variable
	public ThankYou(String a)
	{
		userName=a;
	}
	
	public String thanksPrinting(String userName) {
		
		return "Thank you "+userName+" Have a Good Day";
	}
public String thanksPrinting() {
		
		return "Thank you "+userName+" Have a Good Day";
	}
}
