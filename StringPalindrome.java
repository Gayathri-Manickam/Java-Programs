import java.util.*;
public class StringPalindrome
{
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to Reverse: ");
		String st=sc.next();
		char ct;
		String element="";
		for(int i=0;i<st.length();i++)
		{
		    ct=st.charAt(i);
		    String s=Character.toString(ct);
		    list.add(s);
		}
		for(int i=list.size()-1;i>=0;i--)
		{
		    element=element+list.get(i);
		}
	if(element.equals(st))
		{
		    System.out.println("The given string is a plaindrome");
		}
		else
		{
		    System.out.println("The given string is not a plaindrome");
		}
        
	}
}
