import java.util.Scanner;

//Q8:Write a Java program to convert temperature from Fahrenheit to Celsius degree.
public class Question8 {

	public static void main(String[] args) {
		
		    Scanner input = new Scanner(System.in);
		 
		    System.out.println("Enter temperature in Fahrenheit");
		    double temperature = input.nextDouble();
		 
		    temperature = ((temperature - 32)*5)/9;
		 
		    System.out.println("temperature in Celsius = " + temperature);
		  }
		
	}


