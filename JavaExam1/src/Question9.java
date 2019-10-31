import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String result ="";
		 System.out.println("Enter weight in Pounds : ");
	        double weight = input.nextDouble();
	      System.out.println("Enter Height in inches : ");
	        double height = input.nextDouble();
	        double bmi = (weight * 703) / (height * height);
	       
	        System.out.print("your BMI is: "+bmi+" and you are "+result(bmi));
	      }
	
	
	public static String result(double bmi)
     {
	  String result = "";
	
	  if (bmi < 18.5) {
            result = "underweight";
        } else if (bmi < 25) {
            result = "normal";
        } else if (bmi < 30) {
            result = "overweight";
        } else {
            result = "obese";
        }
	  return result;
        
     }

}
