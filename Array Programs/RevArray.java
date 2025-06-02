/* WAP to enter the five element in array and reverse it ?
e.g.
a[0] a[1] a[2] a[3] a[4]
 10   20   30   40   50
After Reverse Array should like as 
a[0] a[1] a[2] a[3] a[4]
 50   40   30   20   10  */

public class RevArray
{  public static void main(String x[])
   {
	int arr[]={10,20,30,40,50};

	System.out.println("Before reverse :");
	for(int i=0; i<arr.length; i++)
	{
	  System.out.println(arr[i]);
	}
	System.out.println("After reverse Array :");
	for(int j=arr.length-1; j>=0; j--)
	{
	 System.out.println(arr[j]);
	}
   }
}

