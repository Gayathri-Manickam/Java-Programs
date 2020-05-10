import java.io.*;
import java.util.*;
class BankException extends Exception
{
	int id;
	String status;
	BankException(int i)
	{
		id=i;
	    switch(i)
		{
			case 1:
			status="Minimum balace should be maitained above 1000";
			break;
			case 2:
			status="Withdrawal amount exceeds balance";
			break;
			case 3:
			status="transaction count limits to 3";
			break;
			case 4:
			status="Total permitted transaction amount for a day is one lakh";
		    break;
			default:
			status="None";
			break;

		}
	}
	public String toString()
	{
		return "Bank exception- "+status;
	}
}

class atm
{
	static int cardno,bal,i,wd,count=1,b=0,dp;
	static String cardname;
	static void compute()throws BankException
	{
		System.out.println("Your balance="+bal);
		if(bal<1000)
		{
			
			throw new BankException(1);
		}
		else
		{
			System.out.println("You can proceed the transaction with your balance amount="+bal);
			
		}
	}
	static void comp(int wd)throws BankException
	{
		
		if(wd>bal)
		{
			
			throw new BankException(2);
		}
		else
		{
			
			System.out.println("The amount="+wd+" had been successfully withdrawed and your balance amount="+(bal-wd));
			
			
		
		bal=bal-wd;
		b=b+bal;
		System.out.println("Total Transaction amount="+b);
			onet(b);
		}
	}
	static void com(int tcount)throws BankException
	{
		System.out.println("Transaction no."+tcount);
		if(tcount>3)
		{
			
			throw new BankException(3);
		}
		else
		{
			System.out.println("Proceed your transaction");
			
		}
	}
	static void deposit(int dp)throws BankException
	{
		
		bal=bal+dp;
		System.out.println("Your balance amount is="+bal);
		b=b+bal;
		System.out.println("Total Transaction amount="+b);
			onet(b);
		
	}
	static void onet(int b)throws BankException
	{
		
		
		if(b>100000)
		{
			throw new BankException(4);
		}
		else
		{
			System.out.println("Next Transaction");
		}
	}
	public static void main(String args[])
	{
		int ch,c;
		Scanner sc=new Scanner(System.in);
		
		try
		{
		System.out.println("Enter the card number and card holder name: ");
		cardno=sc.nextInt();
		cardname=sc.next();
		System.out.println("Enter your balance amount:");
		bal=sc.nextInt();
		compute();
		b=b+bal;
		System.out.println("Total Transaction amount="+b);
		onet(b);
		do{
		System.out.println("Enter your choice:\n1.Deposit\n2.Withdrawal");
		ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
			com(count);
			System.out.println("Enter your deposit amount:");
			dp=sc.nextInt();
			deposit(dp);
			
			break;
			case 2:
			com(count);
		    System.out.println("Enter your withdrawal amount");
		    wd=sc.nextInt();
		    comp(wd);
			onet(b);
			break;
		}
		System.out.println("If you want to continue your transaction then press 1...");
		c=sc.nextInt();
		count++;
		}
		while(c==1);
		}
		catch(BankException e)
		{
			System.out.println("Caught:"+e);
		}
		
	}
}

		
		
		

	