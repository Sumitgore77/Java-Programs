//Q1.WAP to enter the five elements in array and show it

import java.util.*;
public class Arr1
{  public static void main(String x[])
   {	
	Scanner xyz = new Scanner(System.in);
 	System.out.println("Enter Size of array:");
	int size=xyz.nextInt();
	
	int num[]=new int[size];

	System.out.println("Enter Arrays size of to"+num);

	for(int i=0; i<size; i++)
	{
	   num[i]=xyz.nextInt();
	}

	System.out.println("The Array are :");

	for(int i=0; i<num.length; i++)
	{
	System.out.println(num[i]);
	}
	
	
   }
}