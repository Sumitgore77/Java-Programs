public class pat18
{  public static void main(String x[])
   {
	for(int i=1; i<=7; i++)
	{
	  for(int j=1; j<=7; j++)
	  {
		if(j<=4 && j<=5-i || j>4 && j>=3+i && i<=4)
	 	{
		  System.out.print("  ");
		}
		else if(( j<=i-3 || j>=11-i)&& i>=5)
		{
		  System.out.print("  ");
		}
		else
		{
		  System.out.print("* ");
		}
	  }
	System.out.println();
	}
   }
}