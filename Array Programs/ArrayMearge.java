import java.util.*;
public class ArrayMearge
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter a Size Of Array :");
	int size=xyz.nextInt();

	int arr1[]=new int[size];
	int arr2[]=new int[size];

	for(int i=0; i<arr1.length; i++)
	{
	  arr1[i]=xyz.nextInt();
	}	
	for(int i=0; i<arr1.length; i++)
	{
	  System.out.print(arr1[i]+" ");
	}
	for(int i=0; i<arr2.length; i++)
	{
	  arr2[i]=xyz.nextInt();
	}	
	for(int i=0; i<arr2.length; i++)
	{
	  System.out.print(arr2[i]+"\n");
	}

	int []arr3= new int[arr1.length + arr2.length];

	for(int i=0; i<arr1.length;i++)
	{
	 arr3[i]=arr1[i];
	}
	for(int i=0; i<arr2.length;i++)
	{
	arr3[arr1.length+i]=arr2[i];
	}

	for(int i=0; i<arr3.length; i++)
	{
	 System.out.print(arr3[i]+" ");
	}
   }
}