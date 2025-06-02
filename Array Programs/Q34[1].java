import java.util.*;
public class Q34[1]
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    int s,i,j,mid,len;

    System.out.println("Enter Size:");
    s=sc.nextInt();

   String a[]=new String[s];

    System.out.println("Enter Word:");
    for(i=0;i<s;i++)
      { 
        a[i]=sc.nextLine();
      }
     
     mid=s/2;
     len=s-1;
    String temp;

    for(i=0;i<mid;i++)
      {
         temp=a[i];
         a[i]=a[len];
         a[len]=temp;
         len--;
      }
    for(i=0;i<a.length;i++)
      {
         System.out.print(a[i]+" ");
      }
  }
}