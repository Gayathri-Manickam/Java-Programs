import java.util.*;
public class customer
{
  
     Scanner sc=new Scanner(System.in);
	 int years,empid,salary;
	 String empname;
	 public void employee(int y,int sal)
	 {
		 if(y<5)
		 {
			 sal+=sal*0.1; //calculating salary with 10% discount;
			 System.out.println("Salary bonus is: "+sal);
		 }
		 else
		 {
			sal+=sal*0.2;
            System.out.println("Salary bounus is: "+sal);
		 }
	 }
     public static void main(String args[])
  {
     System.out.println("Enter the employee name,id,no.of.years he worked and his salary:");
     empname=sc.next();
     empid=sc.nextInt();
     years=sc.nextInt();
     salary=sc.nextInt();
     customer cc=new customer();
     cc.employee(years,salary);
  }
}
  