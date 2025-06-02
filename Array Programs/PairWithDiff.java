/* 29) Write a program in C to find a pair with the given difference
Expected Output:
The given array is:
1 15 39 75 92
The given difference is: 53
The pair are: (39, 92) */

public class PairWithDiff
{  public static void main(String x[])
   {
	int arr[]={1,15,39,75,92};
	int diff=53;	
	System.out.println("The difference is "+diff);
	for(int i=0 ; i< arr.length; i++)
	{
	   for(int j=i+1 ; j< arr.length; j++)
	   {
		if(arr[i]-arr[j]==diff || arr[j]-arr[i]==diff)
		{
		  System.out.println("The pair are: "+arr[i]+","+arr[j]);
		}  
	   }
	}
   }
}
