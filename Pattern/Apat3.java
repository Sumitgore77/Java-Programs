/*
* * * * * * *
* 1 2 3 4 5 *
* 2 3 4 5 6 *
* 3 4 5 6 7 *
* 4 5 6 7 8 *
* 5 6 7 8 9 *
* * * * * * *  */


public class Apat3
{  public static void main(String x[])
   {
	int count=0;
	for(int i=1;i<=7;i++)
	{
		int temp=count;
		for(int j=1;j<=7;j++)
		{
			if(i==1 || i==7 || j==1 || j==7)
			{
				System.out.printf("* ");
			}
			else if( i>=2 && j<=6)
			{
				System.out.printf("%d ",temp);
				temp++;
			}
		}
		count++;
		System.out.println();
	}	
   }
}