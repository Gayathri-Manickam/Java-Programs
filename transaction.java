import java.util.*;
class transaction
{
  int accno_u1,accno_u2,amount;
  int i,u,j,k,p,n,a;
  Scanner sc=new Scanner(System.in);
  void get()
  {
	  System.out.println("Enter the Account no.1 and Account no.2:");
	  accno_u1=sc.nextInt();
	  accno_u2=sc.nextInt();
	  amount=sc.nextInt();
  }
	  
  public static void main(String args[])
  {
	  transaction t=new transaction();
	  t.get();
	  Scanner sc=new Scanner(System.in);
	  int c1,c;
	  do{
	  System.out.println("Enter your transaction method:");
	  System.out.println("1.Credit card \t 2.Debit card \t 3.Netbanking");
	  c=sc.nextInt();
	
	  
		  switch(c)
	  {
		  case 1:
		  System.out.println("Enter the card no:");
	      long cn=sc.nextLong();
	      System.out.println("Enter the validity year:");
	      int vy=sc.nextInt();
	      System.out.println("Enter the pin no.:");
	      int pin=sc.nextInt();
	     
		  t.fund(cn,vy,pin);
		  break;
		  
		  case 2:
		   
		   System.out.println("Enter the card no:");
	       long dn=sc.nextLong();
	       System.out.println("Enter the card holder name:");
	       String name=sc.next();
	       t.fund(dn,name);
		   break;
		  
		  case 3:
		   Scanner f=new Scanner(System.in);
		   System.out.println("Enter the username:");
	       String uname=f.next();
	       System.out.println("Enter the password:");
	       int pass=f.nextInt();
		   t.fund(uname,pass);
		   break;
		  
		  default:
		  System.out.println("enter the method to transfer");
		  break;
	  }
	  System.out.println("Press 0 to continue");
	  c1=sc.nextInt();
  }while(c1==0);
  }
 
  void fund(long c,int v,int p)
  {
	  String s1=""+c;
	  int a=s1.length();
	  
	    String s3=""+p;
	  int u=s3.length();
	  if((a==16)&&(v>2019)&&(u==4))
	  {
		  
				 System.out.println("Transaction is done");
			 	 
	  }
	  else
	  {
		  System.out.println("Error is occured");
	  }
	  
	  
  }
  void fund(long d,String n)
  {
	  String s1=""+d;
	  int a=s1.length();
	  
	  if(a==16)
	  {
		  
		  if((n!="\0") && (n.length()>3))
		  {
			  System.out.println("Enter the pin number:");
			  int pi=sc.nextInt();
			  System.out.println("your transactionis done");
		  }
		  else
		  {
			  System.out.println("Error in your transaction");
		  }
	  }
	  else
	  {
		  System.out.println("Error in your transaction");
	  }
  }
  void fund(String n1,int pa)
  {
	  
	  if(n1!="gayathri")
	  {
		  if(pa!=123456)
		  {
		      System.out.println("Enter correct username and password");
		  }
		  else
		  {
			  System.out.println("Enter correct username ");
		  }
	  }
	  else
	  {
		  System.out.println("Enter pin no.:");
		  int i=sc.nextInt();
		  String s4=""+i;
		  int j=s4.length();
		  
		  if(j==4)
		  {
			  System.out.println("Enter OTP:");
			   int otp=sc.nextInt();
			   String s5=""+otp;
		       int k=s5.length();
			  if(k==4)
			  {
				  System.out.println("Transaction is done");
			  }
			  else
			  {
				  System.out.println("Error");
			  }
		  }
		  else
			  {
				  System.out.println("Error");
			  }
	  }
	  
  
  }
}
