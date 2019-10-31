//write a program to generate 10 random numbers.
public class Problem7 {

	public static void main(String[] args) {
		
		System.out.println("Ten random numbers are: ");
		
		for(int i = 0; i<10;i++)
		{
		System.out.println((int)(Math.random() * 100 + 1));// random numbers from first 100 numbers
		}

	}

}
