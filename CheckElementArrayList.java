
import java.util.*;
public class CheckElementArrayList
{
    public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want: ");
		int no_element=sc.nextInt();
		int element;
		System.out.println("Enter "+no_element+" elements: ");
		for(int i=0;i<no_element;i++)
		{
		    element=sc.nextInt();
		    list.add(element);
		}
		System.out.println("Enter the element you want to check whether it exists or not: ");
		int search_element=sc.nextInt();
		int res=0;
		for(int i=0;i<list.size();i++)
		{
		    if(search_element==(list.get(i)))
		    {
		        res=1;
		        break;
		    }
		    else
		    {
		        res=0;
		    }
		}
		if(res==1)
		{
		    System.out.println("The element "+search_element+" exists in the ArrayList");
		}
		else
		{
		    System.out.println("The element "+search_element+" does not exists in the ArrayList");
		}
        
	}
}
