import java.util.*;

class ArrayFreqCount{

	int arr[];
	void setArray(int arr[]){
		this.arr=arr;
	}
	
	void countFreqCount(){

		System.out.println("The Array is :");

		for(int i=0; i<arr.length;i++)	
		{ 
			System.out.println(arr[i]+" ");
		}
		
		System.out.println("The frequency count is :");

		int n=arr.length;
		
		boolean b[]=new boolean[n];
		
		for(int i=0;i<arr.length;i++){
	
			if(b[i]){

				continue;
			}
			int count=1;


			for(int j=i+1;j<arr.length;j++){

				if(arr[i]==arr[j]){

					count++;
					b[j]=true;
				}
			}
			System.out.println(arr[i]+"------->"+count);
		}
	}
}

public class FreqApp1
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner (System.in);
	System.out.println("Enter Array value");
	int arr[]=new int[6];
	
	
	for(int i=0; i<arr.length; i++)
	{
	
		arr[i]=xyz.nextInt();
	}
	ArrayFreqCount a=new ArrayFreqCount();
	a.setArray(arr);
	a.countFreqCount();
   }
}