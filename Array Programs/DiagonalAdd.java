/* 40)Write a program in C to find sum of right diagonals of a matrix
Test Data :
Input the size of the square matrix : 2
Input elements in the first matrix :
element - [0],[0] : 1
element - [0],[1] : 2
element - [1],[0] : 3
element - [1],[1] : 4
Expected Output :
The matrix is :
1 2
3 4
Addition of the right Diagonal elements is :5 */

import java.util.*;
public class DiagonalAdd
{  public static void main(String x[])
   { 
	Scanner xyz= new Scanner(System.in);
	System.out.println("Enter size of array:");
	int size=xyz.nextInt();
	int a[][]=new int[size][size];
	System.out.println("Enter values: ");
	for(int i=0; i<a.length; i++)
	{
	  for(int j=0; j<a[i].length; j++)
	  {
	     a[i][j]=xyz.nextInt();
	  }
	System.out.println();
	}
	
	System.out.println("The matrix is:");
	
	for(int i=0; i<a.length; i++)
	{
	  for(int j=0; j<a[i].length; j++)
	  {
	     System.out.printf("%d\t ",a[i][j]);
	  }
	System.out.println();
	}
	int dsum[][]=new int[size][size];
	for(int i=0; i<a.length; i++)
	{  
	  for(int j=0; j<a.length; j++)
	  {dsum[i][j]=0;
	   for(int k=0; k<a.length;k++)
	   {
		if(a[i][j]==a[i][j])
	  	{
	    	dsum[j][i]=dsum[i][k]+a[i][k];
		}
	   }
	  }
	}
	for(int i=0; i<a.length; i++)
	{  
	  for(int j=0; j<a.length; j++)
	  {
	   for(int k=0; k<a.length;k++)
	   {
		System.out.print(dsum[i][j]);
	   }
	  }
	}
	
	

   }
}