import java.util.*;
class prime22
{
	Scanner sc=new Scanner(System.in);
	int n1,n2,m,i;
  void getnum()
  {
	  n1=sc.nextInt();
	  n2=sc.nextInt();
  }
  public int cal()
  {
	  System.out.println("Prime numbers are:");
	  for(i=n1;i<=n2;i++)
	  {
		  if(isPrime(i))
		  {
			  System.out.println(i);
		  }
	  }
	  return 0;
  }
  public static boolean isPrime(int n)
  {
	  if(n<=1)
	  {
		  return false;
	  }
	  else
	  {
		  for(int i=2;i<=Math.sqrt(n);i++)
		  {
			  if(n%i==0)
			  {
				  return false;
			  }
			  
		  }
		  return true;
	  }
  }
  public static void main(String args[])
  {
	  prime22 p=new prime22();
	  p.getnum();
	  p.cal();
  }
}