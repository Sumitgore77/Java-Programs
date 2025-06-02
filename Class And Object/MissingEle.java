import java.util.*;

class Missing{

	int arr[];

	void setValue(int arr[]){
		this.arr=arr;
	}
	
	void findMissing(){

		for(int i=0; i<arr.length-1;i++)
		{
			int first=arr[i];
			int last=arr[i+1];

			for(int j=first+1; j < last; j++){
		
				System.out.print(j+" ");
			}	
		}
	}
}

public class MissingEle
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter size of array:");
	int size=xyz.nextInt();

	int arr[]= new int[size];
	for(int i=0; i<arr.length;i++){
		
		arr[i]=xyz.nextInt();
	}
	
	Missing m=new Missing();
	m.setValue(arr);
	m.findMissing();
   }
}