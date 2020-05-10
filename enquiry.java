
import convert.*;
import java.util.*;
public class enquiry extends convert_g3
{
	public static void main(String args[])
	{
		convert_g3 cg=new convert_g3();
		String s;char c;float a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		s=sc.next();
		System.out.println("Enter your cgpa:");
		a=sc.nextFloat();
		System.out.println("Enter your grade:");
		c=sc.next().charAt(0);
		System.out.println("Your age is: "+cg.Str2Int(s));
		System.out.println("Your cgpa is: "+cg.Float2Int(a));
		System.out.println("Your grade is: "+cg.Char2Int(c));
	}
}

		
		
		