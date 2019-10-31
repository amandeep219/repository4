import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator
{
   static Scanner input = new Scanner(System.in);
   public static int choice; //static (global) variable with scope throughout the class
   public static void main(String[] args)
	{
	 boolean run = true;
	 while(run)   //until user enter choice 5 to exit
	 {
	  System.out.println("WelCome to <Aman Bajwa'>s Handy Calculator\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
	  do//try to re-enter choice until user press between 1 and 5
	  {
	   System.out.println("What would you like to do?");
	   try
	   {
		  choice = input.nextInt();
		  if(choice>=1&&choice<=5)//choice should be between 1 and 5
		  {
		   break;
		  }
		  else
		  {
		   System.out.println("you havnot entered between 1 and 5.Try Again");
		   input.nextLine();
		   continue;
		  }
	   }
	   catch(final InputMismatchException e)
	   {
		System.out.println("You have entered an Invalid Choice.Please re-enter your choice");
		input.nextLine();
		continue;
	   }
	}while(true);//end of do-while
	
	 float []num = new float[2];//use array to get user input
	 switch(choice)
	 {
	  case 1:
	  {
		    System.out.println("Please enter two floats to ADD,seprated by space");
		    num = getTwoFloats();//invoke getTwoFloats function to get two floats from user
		    System.out.println("Result of adding "+num[0]+" and "+num[1]+" is "+addition(num));
	    	run = pressEnter();
		    break;
	   }
	
	case 2:
	  {
		   System.out.println("Please enter two floats to SUBTRACT, seprated by space");
		   num = getTwoFloats();
		   System.out.println("Result of subtracting "+num[0]+" and "+num[1]+" is "+subtraction(num));
		   run = pressEnter();
		   break;
	  }
	
	case 3:
	  {
		  System.out.println("Please enter two floats to MULTIPLY, seprated by space");
		  num = getTwoFloats();
		  System.out.printf("Result of multiplying "+num[0]+" and "+num[1]+" is "+multiplication(num));
		  run = pressEnter();
		  break;
		
	  }
	case 4:
	 {

		 System.out.println("Please enter two floats to DIVIDE, seprated by space");
		 num = getTwoFloats();
		 System.out.println("Result of dividing "+num[0]+" and "+num[1]+" is "+" "+division(num));
		 run = pressEnter();
		 break;
		
	 }
	case 5:
	 {
		System.out.println("Thank you for using <Aman Bajwa'>s Handy Calculator");
		run = false;   // to get out of while loop
		break;
	 }
	
    }//end of switch
   }//end of while loop
   input.close();

 }//end of main
   
   
   
   
	
	
  //Function or Method to get two floats from  user
     public static float[] getTwoFloats()
     {
      float []number =  new float[2];//use array to get two floats
     do
    	{
	     try
	      {
	      number[0] = input.nextFloat();
	      number[1] = input.nextFloat();
		  if(choice==4 && number[1]==0)
		   {
		    System.out.println("You cannot divide by zero.Please re-enter both floats: ");
		    input.nextLine();
		    continue;
		   }
		   break;
	      }
	    catch(final InputMismatchException e)
	     {
		  System.out.println("You have entered Invalid floats please re-enter");
		  input.nextLine();
		   continue;
	     }
	 }while(true);
	 return number;
 }//end of getTwoFloats()
	
 //Function or Method to calculate ADDITION of two numbers
  public static float addition(float [] n)
  {
	float add = n[0]+n[1];
   add= (float) (Math.round(add*100)/100.0);   //roundoff float to two decimal place(as this type of  Math.round() is used for doubles so cast double back to float
   return add;
  }//end of  addition()
 
 
 //Function or Method to calculate Subtraction of two numbers
  public static float subtraction(float [] n)
  {
   float subtract = n[0]-n[1];
   subtract = (float) (Math.round(subtract*100)/100.0); 
   return subtract;
  }//end of subtraction()
		
 //Function or Method to calculate MULTIPLICATION of two numbers
  public static float multiplication(float [] n)
  {
   float multiply = n[0]*n[1];
   multiply = (float) (Math.round(multiply*100)/100.0); 
   return multiply;
  }//end of multiplication()
				
 //Function or Method to calculate DIVISION of two numbers
  public static float division(float [] n)
  {
   float divide = n[0]/n[1];
   divide = (float) (Math.round(divide*100)/100.0); 
   return divide;
  }//end of division()
				
 //Function or method to ask user to press ENTER to continue			
  public static boolean pressEnter()
  {
   boolean clickEnter;
   input.nextLine();//to clear buffer
   do//until user click ENTER
    {
	   System.out.println("\n");
     System.out.println("Press Enter to continue...");
     String enter=input.nextLine();
     if(enter.isEmpty())
     {
	   clickEnter = true;
	   break;
     }
    else
     {
	  System.out.println(" You haven't press ENTER");
	  continue;
     }
   }while(true);
   return clickEnter;
  }//end of pressEnter()
			
}//end of class

							 
			
