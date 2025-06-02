//38)Write a program in for multiply of two Matrices of same size.
import java.util.*;
public class Multi2Matrix
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
									// Multiplication logic**
	int result[][]=new int[size][size];     	
	for(int i=0; i<result.length;i++)
	{
	  for(int j=0; j<result[i].length;j++)
	  {result[i][j]=0;						//store result
	    for(int k=0 ; k<result.length;k++)
	    {
		 result[i][j] =result[i][j]+ (a1[i][k] * a2[k][j]);
	    }
	  }
	}
										
	System.out.println("Result of matrix multiplication:");
        for (int i = 0; i <result.length; i++) 
	{
            for (int j = 0; j < result.length; j++) 
	    {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
   }
}