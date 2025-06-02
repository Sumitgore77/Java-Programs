import java.util.*;

class Celling 
{
	
	int arr[];

	void setValue(int arr[])
	{
		this.arr=arr;
	}

	void getFloorCeil()
	{
		
		for(int i=0; i<=arr.length;i++)
		{
		  int ceil=-1;
	 	  int floor=-1;

	 	  for(int j=0; j<arr.length; j++)
	  	  {
	     		   if(arr[j]<=i)
			   {
				floor=arr[j];	
			   }
			   else
			   {
				break;
			   }

	  	  }
	   	  for(int j=0; j<arr.length; j++)
	 	  {
	     		   if(arr[j]>=i)
			   {
				ceil=arr[j];
				break;
			   }

	  	  }
	   	System.out.println("Number: "+i+", Floor: "+( floor==-1 ? "None" : floor )+", Ceil: "+( ceil==-1 ? "None": ceil));

	       }
	}
}

public class CellingApp
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner (System.in);
	System.out.println("Enter size of array :");
	int size=xyz.nextInt();
	
	int arr[]=new int[size];
	
	System.out.println("Enter value:");
	for(int i=0; i<arr.length; i++)
	{
	   arr[i]=xyz.nextInt();
	}
	
	Celling c=new Celling();
	c.setValue(arr);
	c.getFloorCeil();
   }
}