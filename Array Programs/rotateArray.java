/*14)Write a program in C to rotate an array by N positions ?
Expected Output :
The given array is : 0 3 6 9 12 14 18 20 22 25 27
From 4th position the values of the array are : 12 14 18 20 22 25 27
Before 4th position the values of the array are : 0 3 6 9
After rotating from 4th position the array is:
12 14 18 20 22 25 27 0 3 6 9   */

import java.util.*;
public class rotateArray
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter a size of array:");
	int size=xyz.nextInt();

	int arr[]=new int[size];
	for(int i=0; i<size; i++)
	{
	   arr[i]=xyz.nextInt();
	}
	System.out.println("The array before Rotation:");
	for(int i=0; i<size; i++)
	{
	   System.out.println(arr[i]+" ");
	}
	System.out.println();
	System.out.print("Enter the position of array rotation:");
	int r=xyz.nextInt();
	
	for(int i=r ; i<size; i++)
	{
	   System.out.print(arr[i]+" ");
	}
	for(int i=0; i<r;i++)
	{
	   System.out.print(arr[i]+" ");
	}
   }

}
