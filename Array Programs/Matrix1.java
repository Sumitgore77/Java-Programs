/*
35) Write a program in C for a 2D array of size 3x3 and print the matrix ?
Test Data :
Input elements in the matrix :
element - [0],[0] : 1
element - [0],[1] : 2
element - [0],[2] : 3
element - [1],[0] : 4
element - [1],[1] : 5
element - [1],[2] : 6
element - [2],[0] : 7
element - [2],[1] : 8
element - [2],[2] : 9
Expected Output :
The matrix is :
1 2 3
4 5 6
7 8 9
*/
import java.util.*;
public class Matrix1
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter values:");
	int a[][]=new int[3][3];
	for(int i=0; i<a.length; i++)
	{
	  for(int j=0; j<a[i].length; j++)
	  {
		 a[i][j]=xyz.nextInt();
	  }
	System.out.printf("\n");
	}
 	

	for(int i=0; i<a.length; i++)
	{
	  for(int j=0; j<a[i].length; j++)
	  {
		System.out.printf("%d\t",a[i][j]);
	  }
	System.out.printf("\n");
	}
	
   }
}














