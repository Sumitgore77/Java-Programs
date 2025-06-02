import java.util.*;
public class AscendingOrder
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner (System.in);
	System.out.printf("Enter Values:");
	int size=xyz.nextInt();
	int []arr=new int[size];
		
	for(int i=0; i<size; i++)
	{
	   arr[i]=xyz.nextInt();	
	}
	System.out.println("Before Ascending order:");
	for(int i=0; i<size; i++)
	{
	  System.out.printf("%d\t ",arr[i]);
	}
	for (int i = 0; i < arr.length ; i++) 
	{
            for (int j =i+1 ; j < arr.length ; j++) 
	    {
                if (arr[i] > arr[j]) 
	    	{
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
	System.out.print("Ascending Order: ");
	for(int i=0; i<size; i++)
	{
	    System.out.printf("%d\t ",arr[i]);
	}
   }
}