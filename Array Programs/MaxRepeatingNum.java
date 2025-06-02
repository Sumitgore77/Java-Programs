/*Write a program in java to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
The given array is: 2 3 3 5 3 4 1 7 7 7 7
The maximum repeating number is: 7*/

public class MaxRepeatingNum
{  public static void main(String x[])
   {
	int arr[]={2,3,3,5,3,4,1,7,7,7,7};
	for(int i=0; i<arr.length; i++){
		System.out.printf("%d\t",arr[i]);
	}

	for(int i=0; i<arr.length; i++){
		int count=0;
		int mCount=0;
		for(int j=0; j<arr.length; j++){
			
			if(arr[i]==arr[j]){
	
				mCount=count++;
				
			}
			if(count>mCount){
			System.out.println("The maximum repeating number is:"+count);
			}
		}
		
	}
	
   }
}
