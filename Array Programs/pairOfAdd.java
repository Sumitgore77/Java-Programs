/*12)Write a program in C to find a pair with given sum in the array.
Expected Output :
The given array : 6 8 4 -5 7 9
The given sum : 15
Pair of elements can make the given sum by the value of index 0 and 5*/

public class pairOfAdd
{  public static void main(String x[])
   {
	int arr[]={6,8,4,-5,7,9};

	for(int i=0; i<arr.length; i++)
	{
	  for(int j=i+1; j<=arr.length-1; j++)
	  {
	      if(arr[i]+arr[j]==15)
	      {
		System.out.println("The sum of "+arr[i]+" and "+arr[j]+" is 15");
		}
	  }
	}
   }
}