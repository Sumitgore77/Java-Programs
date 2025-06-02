 /* WAP to insert the element on specified position in array ?
e.g. declare the array of size 6 and store 5 values in it and last block should be empty
 a[0] a[1] a[2] a[3] a[4] a[5]
10 20 30 40 50
Enter the index on which value want to be insert 
e.g. index = 2 
Enter the value which want to store on index 
Value = 100
When we insert the value on index then we need to shift the values from index to next index
e.g.
a[0] a[1] a[2] a[3] a[4]
5 9 11 4 6
10 20 100 30 40 50 */

import java.util.*;
public class Arr4
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	int arr[]=new int[6];
	arr[0]=10;
	arr[1]=30;
	arr[2]=40;
	arr[3]=50;
	arr[4]=60;

	System.out.println("Enter index value :");
	int index=xyz.nextInt();

	System.out.println("Enter value :");
	int value=xyz.nextInt();


	for(int i=5; i>index; i--)
	{
		arr[i]=arr[i-1];
	}
	arr[index]=value;       //--------->a[2]=200;
	
	for(int i=0; i<6; i++)
	{
	System.out.println("New Updated Array:"+arr[i]);
	}
   }
} 