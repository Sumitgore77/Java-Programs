/*WAP to create the class name as ArrayFeqCount with a following methods*/

import java.util.*;

class ArrayFreqCount{

	int arr[];
	void setIntArray(int arr[]){
	
		this.arr=arr;
	}
	
	void countFeqCount(){	
	
		int n=arr.length;
		boolean visited[] = new boolean[n];
		for(int i=0; i<arr.length;i++)
		{
			 if (visited[i]) 
			 {
              			  continue;             
			 }

			int count=1;

		   for(int j=i+1; j<arr.length; j++){
				
			if(arr[i]==arr[j]){
			
				count++;

				visited[j] = true;
			}
		   }
		System.out.println(arr[i]+"------>"+count);
		}
				
	}
}
public class FreqApp
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	int arr[]=new int [6];
	System.out.println("Enter array array values ");
	for(int i=0; i<arr.length; i++){
		
		arr[i]=xyz.nextInt();	
	}
	
	ArrayFreqCount a=new ArrayFreqCount();
	a.setIntArray(arr);
	a.countFeqCount();
	
   }
}
