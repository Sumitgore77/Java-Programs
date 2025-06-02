public class ReverseNewLogic
{  
  public static void main(String x[])
  {
	int arr[]=new int[]{1,2,3,4,5};
	
	int l=arr.length-1;		//5
	
	for(int i=0; i<arr.length/2;i++)	//  1  2  |3|  4  5
	{					//  ^		  ^
		int temp=arr[i];		//  i		  l
		arr[i]=arr[l];
		arr[l]=temp;
		
		l--;
	}
	
	for(int i=0; i<arr.length;i++)
	{
		System.out.println(arr[i]+"");
	}
	
  }
}