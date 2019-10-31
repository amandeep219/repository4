/*Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, 
 then the message "I love programming languages" should be printed. If some String is passed to it, then
 in place of "programming languages" the name of that String variable should be printed.*/
public class Programming {
	public Programming() {
		System.out.println("I love programming language");
	}
	
	public Programming(String words) {
		System.out.println("I love "+words);
	}

	public static void main(String[] args) {
		Programming p = new Programming();
		Programming p1 = new Programming("myself");

	}

}
