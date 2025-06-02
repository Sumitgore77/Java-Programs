import java.util.*;

class ArrayDiff{

	int arr[];
	void setValue(int arr[]){
		this.arr=arr;
	}
	void getDiff(){

		for(int i=0; i<arr.length;i++)
		{
		   for(int j=0; j<arr.length;j++)
		   {
			if(arr[i]-arr[j]==78 || arr[i]+arr[j]==78){
				
				System.out.println("Pair found :{"+arr[i]+","+arr[j]+"}");
			}
		   }
		}
	}
}
	
public class DifferencApp
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner (System.in);
	System.out.println("Enter size of array:");
	int size=xyz.nextInt();

	int arr[]=new int[size];
	
	System.out.println("Enter values:");
	
	for(int i=0; i<arr.length;i++)
	{
		arr[i]=xyz.nextInt();
	}
	
	ArrayDiff a=new ArrayDiff();
	a.setValue(arr);
	a.getDiff();
   }
}