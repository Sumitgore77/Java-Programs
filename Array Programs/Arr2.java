/* Q2. WAP to enter the five elements in array and calculate the sum of all elements 
 a[0] a[1] a[2] a[3] a[4]
  10   20   30   40   50  */

public class Arr2
{  public static void main(String x[])
   {	int Sum=0;
	int arr[]={10,20,30,40,50};

	for(int i=0;i<arr.length;i++)	
	{
	 Sum=Sum + arr[i];
	}
	System.out.print("Sum of all array elements : "+Sum);
   }
}