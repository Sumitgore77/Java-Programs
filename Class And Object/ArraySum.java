import java.util.*;

class Array{
	
	int a[];
	
	void setValue(int a[]){
		this.a=a;
	}

	int getSum(){
	
		int sum=0;

		for(int i=0; i<a.length; i++){
	
			sum=sum+a[i];
		}
		return sum;
	}
	
}

public class ArraySum
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter size of array:");
	int size=xyz.nextInt();

	System.out.println("Enter values in array :");
	
	int arr[]=new int[size];	
	for(int i=0; i<size;i++){
		
		arr[i]=xyz.nextInt();
	}
	
	Array a=new Array();
	a.setValue(arr);
	int result=a.getSum();

	System.out.println("The array of sum is :"+result);
   }
}