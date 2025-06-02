/*
1 2 3 4 5 6
1 2     5 6
1   3 4   6
1   3 4   6
1 2     5 6
1 2 3 4 5 6 

*/
public class Apat8 
{  public static void main(String x[])
   {
	for(int i=1; i<=6; i++)
	{
	    for(int j=1; j<=6; j++)
	    {
		if(i==1 || j==1 || i==6 ||(j==6) )
		{
			System.out.printf("%d ",j);
		}
		else if(j==i || (j==7-i))
		{
			System.out.printf("%d ",j);
		}
		else{System.out.print("  ");}
	   }
	System.out.println();
	}
   }
}