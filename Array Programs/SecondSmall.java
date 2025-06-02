/*
1). Write a program in  to find the second largest element in an array ?
Test Data :
Input the size of array : 5
Input 5 elements in the array :
element - 0 : 2
element - 1 : 9
element - 2 : 1
element - 3 : 4
element - 4 : 6
Expected Output :
The Second largest element in the array is : 6 */

public class SecondLarge
{  public static void main(String x[])
   {
	int a[]={5,3,6,8,2,4};

	for(int i=0; i<a.length; i++)
	{
	  for(int j=i+1; j<a.length ;j++)
	  {
	     if(a[i]<a[j])
	     {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	     }
	  }
	}System.out.print(a[1]+" ");
   }
}