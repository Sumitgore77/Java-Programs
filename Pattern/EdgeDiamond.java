public class EdgeDiamond
{  public static void main(String x[])
   {
	for(int i=1; i<=5; i++)
	{
	  for(int j=1; j<=5; j++)
	  {
		if(j==4-i || j==2+i && i<=3)
		{
		  System.out.print("*");
		}
		else if(i>3 && j==i-2)
		{
		  System.out.print("*");
		}
		else if(i==4 && j==4)
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