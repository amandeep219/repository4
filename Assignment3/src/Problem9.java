import java.util.Scanner;

// Given an array, how do you get the count of pairs that sum to even
public class Problem9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter 10 numbers: ");
		for(int i = 0; i<10;i++)
		{
			a[i]= input.nextInt();
		}
		System.out.println("Pairs that sum to even: ");
		for(int i = 0; i<10;i++)
		{
			for(int j = 0;j<10;j++)
			{
			if((a[i]+a[j])%2==0)
				System.out.println(a[i]+","+a[j]);
				
			
		}
		
		
	}

}
}
