import java.util.Scanner;

public class Bigger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b= input.nextInt();
		int c= input.nextInt();
		if(a>b) {
		if(a>c)
			System.out.println("a is bigger");}
		else if (a<b)
			if(b>c) {
				System.out.println("b is bigger");}
		else {
		 System.out.println("c is bigger");}

	}

}
