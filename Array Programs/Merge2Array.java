/* Q8.Write a program in java to merge two arrays of same size sorted in decending order.
Test Data :
Input the number of elements to be stored in the first array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3
Input the number of elements to be stored in the second array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3
Expected Output :
The merged array in decending order is :
3 3 2 2 1 1 */


import java.util.*;
public class Merge2Array
{ public static void main(String x[])
  {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter size of array :");
	int size=sc.nextInt();

	int arr1[]=new int[size];
	int arr2[]=new int[size];

	for(int i=0; i<arr1.length; i++)
	{
	    arr1[i]=sc.nextInt();
	}
	for(int i=0; i<arr2.length; i++) 			
	{
	   arr2[i]=sc.nextInt();
	}	
	
	int[] arr3= new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }


	for(int i=0;i<arr3.length;i++)
	{
	   System.out.println(arr3[i]);
	}
	
	for(int i=0; i<arr3.length; i++)
	{	
		for(int j=1+i; j<arr3.length;j++)
		{
			if(arr3[i]<arr3[j])
			{
			     int temp = arr3[i];
                	     arr3[i] = arr3[j];
                   	     arr3[j] = temp;
			}
		}
	}
	System.out.println("Descending Array:");
	for(int i=0; i<arr3.length;i++)
	{
	System.out.println(arr3[i]);
	}

	
 }
}




















