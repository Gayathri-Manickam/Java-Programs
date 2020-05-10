import java.util.*;
class address
{
	int doorno;
	String strname,city;
	Scanner sc=new Scanner(System.in);
	void get(){
	
	
	doorno=sc.nextInt();
	strname=sc.nextLine();
	city=sc.nextLine();
	
	}
	void print()
	{
		System.out.println(doorno+" "+strname+" "+city);
	}
}
class employee extends address
{
	int salary;String ename;
	void getd(){
	ename=sc.nextLine();
	salary=sc.nextInt();}
	void printd()
	{
		System.out.println(ename+" "+salary);
	}
	
	public static void main(String args[])
	{
		employee e1=new employee();
		e1.getd();
		e1.get();
		e1.printd();
		e1.print();
	}
}