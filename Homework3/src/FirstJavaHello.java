import java.util.Scanner; 
public class FirstJavaHello {
	public static void main(String[] args) {   
		int yourAge;  
		Scanner readInput = new Scanner(System.in); 
		System.out.printf("How old are you?: "); 
		yourAge= readInput.nextInt(); 
		if (yourAge == 50);
		System.out.printf("You are golden\n"); 
		   
		System.out.printf("You are not so golden\n"); 
		
		if (yourAge > 13);
		System.out.printf("You are a Kid \n");
		
		if(yourAge < 19);
		System.out.print("Your are an adult\n");
		
	}

}
