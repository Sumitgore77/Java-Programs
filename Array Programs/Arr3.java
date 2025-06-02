/* WAP to enter the five elements in array and find out the maximum and minimum elements 
a[0] a[1] a[2] a[3] a[4]
Output like as 
Maximum element in array : 11
Minimum element in array : 4  */

import java.util.*;
public class Arr3
{  public static void main (String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter size of Array :");
	int size=xyz.nextInt();
	int num[]=new int[size];
	
	
	System.out.println("Enter array :");
	for(int i=0; i<size;i++)
	{
	  num[i]=xyz.nextInt();
	}

	int max=num[0];
	int min=num[0];
	
	for(int i=0; i<num.length;i++)
	{  
		if(num[i]>max)
		{
		   max=num[i];
			
		}
		if(num[i]<min)          
		{
		   min=num[i];
		}
	}
	System.out.println("The Maximum value is :"+max);
	System.out.println("The minimum value is :"+min);
   }
}