import java.util.*;
public class ListRemoval
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
		System.out.println("Enter the element you want to remove from a specified index: ");
		int remove_element=sc.nextInt();
		System.out.println("List before the removal of the specified element:"+list);
		int position=list.indexOf(remove_element);
		list.remove(position);
		
		System.out.println("List after the removal of the specified element: "+list);
	}
}
