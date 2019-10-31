package bank;

import java.util.Scanner;

public class Entry {
	public static void WithdrawAmount(double amount, String accType, Account ac)
	{
		if(accType.equalsIgnoreCase("c"))
		{
			Current acc = (Current)ac;
		ac.balance=	(acc.balance-(acc.balance - amount)*acc.extraCharges);
		System.out.println("Balance is: "+acc.balance);
		
		}
		
		else if (accType.equalsIgnoreCase("s"))
		{
			ac.balance= ac.balance-amount;
			System.out.println("Balance is: "+ac.balance);
		}
		
		
		
		
	}
	public static void MakePayment(double amount, String accType, Account ac)
	{
		if(accType.equalsIgnoreCase("c"))
		{
			Current acc = (Current)ac;
		ac.balance=	acc.balance - amount;
		System.out.println("Balance is: "+acc.balance);
		
		}
		
		else if (accType.equalsIgnoreCase("s"))
		{
			ac.balance= ac.balance-amount;
			System.out.println("Balance is: "+ac.balance);
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("What do you want to do /n 1. Withdraw amount/n 2. Make payment ");
		int choice = input.nextInt();
		System.out.println("Enter account type (c or s): ");
		String accType = input.next();
		
		System.out.println("Enter ammout: ");
		double amount = input.nextDouble();
		
		
		if(accType.equalsIgnoreCase("c"))
		{
			Account c = new Current();
			if(choice==1)
			WithdrawAmount(amount,accType,c);
			else if (choice==2)
			MakePayment(amount,accType,c);
			else
				System.out.println("Invalid choice");
			
		
		}
		
		else if (accType.equalsIgnoreCase("s"))
		{
			Account s = new Savings();
			if(choice==1)
				WithdrawAmount(amount,accType,s);
				else if (choice==2)
				MakePayment(amount,accType,s);
				else
					System.out.println("Invalid choice");
			
		}
		
		else
		{
			System.out.println("Invalid accounttt type");
		}
		 
		
		
		
	}

}
