public class pat8
{  public static void main(String x[])
   {
	for(int i=1; i<=5; i++)
	{
	  for(int j=1; j<=9; j++)
	  {
		if(j<=i || j>=10-i)
		{
			System.out.print("* ");
		}
		else
		{
			System.out.print("  ");
		}
	  }
	System.out.println();
	}
   }
}