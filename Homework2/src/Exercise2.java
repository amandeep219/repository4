import java.util.Scanner;
public class Exercise2 {
	public static void main(String[] args) {
		
		Scanner readinput = new Scanner(System.in);
		final double PI = 3.14159265359;
		System.out.print("Enter the radius and length of a area: ");
		System.out.print("Enter the value of PI: ");
		
		double radius = readinput.nextDouble();
		double length = readinput.nextDouble();
		double area = radius * radius * PI;
		double volume = area * length;
	
		
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
		
	}

}



