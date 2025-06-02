//36)Write a program in for addition of two Matrices of same size
import java.util.*;
public class Add2Matrix
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter size of matrix:");
	int size=xyz.nextInt();

	int a1[][]=new int[size][size];
	System.out.println("Enter values for 1nd matrix:");

	for(int i=0; i<a1.length;i++)
	{
	  for(int j=0; j<a1[i].length;j++)
	  {
		 a1[i][j]=xyz.nextInt();
	  }
	System.out.printf("\n");
	}
	System.out.println("The 1st matrix is:");
	for(int i=0; i<a1.length;i++)
	{
	  for(int j=0; j< a1[i].length;j++)
	  {
		System.out.printf("%d\t",a1[i][j]);
	  }
	System.out.printf("\n");
	}
	System.out.println("Enter values for 2nd matrix:");
	int a2[][]=new int[size][size];

	for(int i=0; i<a2.length;i++)
	{
	  for(int j=0; j<a2[i].length;j++)
	  {
		 a2[i][j]=xyz.nextInt();
	  }
	System.out.printf("\n");
	}
	System.out.println("The 2st matrix is:");
	for(int i=0; i<a2.length;i++)
	{
	  for(int j=0; j< a2[i].length;j++)
	  {
		System.out.printf("%d\t",a2[i][j]);
	  }
	System.out.printf("\n");
	}
	
	int sum[][]=new int[size][size];     		//Create 3rd array for sum
	
	for(int i=0; i<sum.length;i++)
	{
	  for(int j=0; j<sum[i].length;j++)
	  {
		sum[i][j]=a1[i][j]+a2[i][j];
	  }
	}
	System.out.println("The sum of 2 arrays is:");
	for(int i=0; i<sum.length;i++)
	{
	  for(int j=0; j<sum[i].length;j++)
	  {
		System.out.printf("%d\t",sum[i][j]);
	  }
	System.out.println();
	}

	
   }
}