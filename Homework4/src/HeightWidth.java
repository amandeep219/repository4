


import java.util.Scanner;


public class HeightWidth {
	

	public static  void main(String[] args)
	
	
	{
		int h = 0, w = 0;
		String hChar;
		String vChar;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter height: ");
		h = input.nextInt();
		System.out.println("Enter width: ");
		w = input.nextInt();
		System .out.println("Enter verticle character: ");
		vChar = input.nextLine();
		System .out.println("Enter horizontal character: ");
		hChar = input.nextLine();
		
		for (int i = 0; i < w; i++)
		{
			System.out.print("-");
		}
		int length;
		for (int j = 0; j < h; j++)
		{
			System.out.print("|");
			for(int k = 0; k < w; k ++)
			{
				System.out.print("-");
			}
			System.out.print("|");	
			for(int m = 0; m < w; m++)
			{
				System.out.print("-");
				
			}
		}
		
	}
		
			
		
		
			
		
		
		
		
		
	}

}

