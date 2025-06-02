import java.util.*;

class InsertArrEle{

	int arr[];
	int val,index;
	void setArray(int arr[]){
		this.arr=arr;
	}
	
	void insertValueOnIndex(int val,int index){
		this.val=val;
		this.index=index;
	
		for(int i=0; i<arr.length-1; i++){
	
			if(index==i)
			{	
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		arr[index]=val;
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}

public class ArrayInsertApp
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter size of array");
	int size=xyz.nextInt();
	
	int arr[]=new int[size];
	
	System.out.println("Enter values");
	for(int i=0; i<arr.length-1; i++)
	{
		arr[i]=xyz.nextInt();
	}	
	
	System.out.println("Enter insert value:");
	int val=xyz.nextInt();
	
	System.out.println("Enter position ");
	int index=xyz.nextInt();

	InsertArrEle a=new InsertArrEle();
	a.setArray(arr);
	a.insertValueOnIndex(val,index);
   }
}