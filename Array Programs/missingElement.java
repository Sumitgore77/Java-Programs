/* Write a program to enter the 5 values in ascending order and store in array and find out the 
missing element from array?
a[0] a[1] a[2] a[3] a[4]
1 5 9 13 17
Missing elements : output should like as 
2 3 4 6 7 8 10 11 12 14 15 16 */

public class missingElement
{  public static void main(String x[])
   {
	int arr[]={1,5,9,13,17};

	for(int i=0; i<arr.length-1; i++)   //------------------------------->Review....
	{
	    int first=arr[i];
	    int last=arr[i+1];
	    
		for(int j=first+1; j<last; j++)
		{
		   System.out.print(j+" ");
		}
	}	
   }
}