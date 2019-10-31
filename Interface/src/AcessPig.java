
public class AcessPig {

	public static void main(String[] args) {
		//Animal a = new Animal();// we cannot create object of interface
		
		
		Pig p = new Pig();
		p.animalSound();
		p.sleep();
		
		
		
		Animal a = new Pig();// we have assigned child class object to interface reference variable
		a.animalSound();
		a.sleep();
	}

}
