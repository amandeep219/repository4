import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n,count;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the limit up to which you want to find the prime nubers");
		n = input.nextInt();
		for(int i = 1; i <=n; i++)
		{
			count=0;
			for(int j = 2; j<=i/2; j++)
			{
				if(i % j == 0)
				{count++;
				break;
				}
				}
			if(count == 0 && i!= 1)
			{
				System.out.print(i+" ");
			}
		}
			
		

	}

}
