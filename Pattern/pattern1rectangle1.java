//pattern rectangle

import java.util.*;
public class pattern1rectangle1
{
   public static void main(String x[])
  {
	Scanner sc=new Scanner(System.in);
	int i,j,row,col;
	System.out.println("Enter the number of row: ");
	row=sc.nextInt();
	System.out.println("Enter the number of colunm: ");
	col=sc.nextInt();
	for(i=1;i<=row;i++)
	{
		for(j=1;j<=row;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	for(i=1;i<=row;i++)
	{
		for(j=1;j<=row;j++)
	        {  
		        if(i==1 || j==1 || i==row || j==col)
			{
			System.out.print("*");
				
			}
			else
			{
			System.out.print(" ");
			}

			
		}
		System.out.println();
	}

	

  }
}
