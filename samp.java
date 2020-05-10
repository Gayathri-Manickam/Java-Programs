import java.util.*;
import java.io.*;
public class samp
{
   public static void main(String args[])throws Exception
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];
     String[] ar=new String[100];
     for(int i=0;i<n;i++)
     {
     
      arr[i]=sc.nextInt();
      ar=Integer.toString(arr[i]).split(" ");
      
     }   
     for(int i=0;i<n;i++)
     {
     System.out.println(ar[i]);
           }      
   }
}

 