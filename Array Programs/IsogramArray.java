import java.util.*;
public class IsogramArray
{
   public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.println("Enter array :");

		for(int i=0; i<arr.length; i++){

			arr[i]=xyz.nextInt();
		}
	
		for(int i=0; i<arr.length; i++){

			System.out.println(arr[i]+" ");
		}

	boolean flag=true;

	for(int  i=0 ; i<arr.length ;i++)
	{
	  for(int j=i+1; j<arr.length ;j++)
	  {
		if(arr[i]==arr[j])
		{
			System.out.println("The given array is not isogram.");
			flag=false;
			break;
		}
	  }
	  if(!flag){
		break;
	  }
	}
	if(flag){

		System.out.println("The given array is isogram.");
	}
	
   }
}