/*WAP to create the class name as InsertArrayEle with a following methods*/

import java.util.*;

class InsertArrEle{
	int arr[];

	void setIntArray(int arr[]){
		this.arr=arr;
	}

	void insertValueOnIndex(int value,int index){
		
		
		 for (int i = arr.length - 1; i > index; i--) {
           		 arr[i] = arr[i - 1];  
       		 }
		
		arr[index]=value;

		System.out.print("Updated array: ");
		for(int i=0; i<arr.length;i++){
	
			System.out.print(arr[i]+" ");
		}
	}
}

public class AddValInPosition
{   public static void main(String x[])
    {
	Scanner xyz=new Scanner(System.in);
	int arr[]=new int[6];
	System.out.println("Enter values in array:");
	for(int i=0; i<5;i++){
	
		arr[i]=xyz.nextInt();
	}
	System.out.println("Enter index Value :");
	int index=xyz.nextInt();

	System.out.println("Enter value:");
	int value=xyz.nextInt();

	InsertArrEle a = new InsertArrEle();
	a.setIntArray(arr);
	a.insertValueOnIndex(index,value);
	
    }
}