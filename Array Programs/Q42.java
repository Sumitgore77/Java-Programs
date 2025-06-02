import java.util.*;
public class Q42//delete Array
{
  public static void main(String x[])
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size");   

     int m=sc.nextInt();
     int a[]=new int[m];
     System.out.println("Enter the element");
     for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
      System.out.println("enter the index");

         int in=sc.nextInt();	
    for(int i=0;i<a.length;i++)
       {
         if(a[i]==in)
           {
             for(int j=0;j<a.length-1;j++)
                {
                  a[j]=a[j+1];
                } 
           }
       }
     for(int i=0;i<a.length-1;i++)
        {
          System.out.println(a[i]+" ");
        }
      
  }
}