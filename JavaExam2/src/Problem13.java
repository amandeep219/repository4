import java.util.Scanner;

//Given a string print the reverse of the string
public class Problem13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	     
		 System.out.println("Enter String");
		 String str= input.nextLine();
		
		  
        StringBuilder input1 = new StringBuilder(); 
  
       
        input1.append(str); 
  
        
        input1 = input1.reverse(); 
  
        System.out.println("Original string is: "+str); 
        System.out.println("Reversed string is: "+input1); 
    } 
		

	}

