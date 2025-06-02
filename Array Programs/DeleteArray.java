import java.util.*;
public class DeleteArray
{  public static void main(String x[])
   {
	Scanner xyz = new Scanner (System.in);
	System.out.println("Enter size of array: ");
	int size = xyz.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter the array values up to " + size);

	for (int i = 0; i < size; i++) 
	{
	  arr[i] = xyz.nextInt();
	}

	System.out.println("The array before deletion:");
	for (int i = 0; i < size; i++) 
	{
	  System.out.printf("%d\t", arr[i]);
	}

	System.out.println();

	System.out.println("Enter a number which you want to delete:");
	int del = xyz.nextInt();

	int newSize = size;  
	for (int i = 0; i < newSize; i++) 
	{
		if (arr[i] == del) 
		{
			for (int j = i; j < newSize - 1; j++) 
			{
				arr[j] = arr[j + 1];
			}
			newSize--;  
			i--;  
		}
	}

	System.out.println("The array after deletion:");
	for (int i = 0; i < newSize; i++) 
	{
		System.out.printf("%d\t", arr[i]);
	}
	System.out.println();
   }
}
