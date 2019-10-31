import java.util.Scanner;
public class Numbers {
	
	public static void main(String[]args) {
		int	firstN;			
		int	secondN;			
		char operator;	
		
		Scanner	readInput	=	new	Scanner(System.in);	
		System.out.printf("Type	a	number,	operator,	number	--"	
		+	"separated	by	a	space:	");	
		firstN	=	readInput.nextInt();
		operator	=	readInput.next().charAt(0);
		secondN	=	readInput.nextInt();	
		
		if	(operator	==	'+');
				System.out.printf("%d	+	%d	=	%d");				
	     firstN,secondN,firstN	+	secondN
		

	}

}
