import java.util.*;
class fact
{
	
	static int factorial(int a)
	{
		if(a==1)
		{
			return 1;
		}
		else
		{
		return  factorial(a-1)*a;
		}
	}
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
	int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		int ff=factorial(n);
		System.out.println("Factorial of the number is: "+ff);
	}
}