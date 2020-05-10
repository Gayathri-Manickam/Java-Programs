
import java.util.*;
public class SearchLinkedList
{
    public int binarySearch(int low,int high,LinkedList<Integer> list,int search_element)
    {
        int mid;
       if(high>=low)
       {
        mid=(low+(high-1))/2;
        
        if(search_element==list.get(mid))
        {
            return mid;
        }
        if(search_element>list.get(mid))
        {
            
            return binarySearch(mid+1,high,list,search_element);
        }
        
            
        return binarySearch(low,mid-1,list,search_element);
        
      }
      else{
        return -1;  }      
    }
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
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
		System.out.println("Enter the element you want to search: ");
		int search_element=sc.nextInt();
		int high,low;
        Collections.sort(list);
        System.out.println("Sorted list: "+list);
        low=0;
        high=(list.size())-1;
		SearchLinkedList m=new SearchLinkedList();
		int res;
      res=m.binarySearch(low,high,list,search_element);
      if(res>-1)
      {
         System.out.println("Element "+search_element+" found");
      }
      else
      {
        System.out.println("Element "+search_element+" not found");
      }

        
	}
}
