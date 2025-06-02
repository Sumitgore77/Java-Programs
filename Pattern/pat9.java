public class pat9
{  public static void main(String x[])
   {
	for(int i=1; i<=4; i++)
	{
	  for(int j=1; j<=8; j++)
	  {
		if(j<=i || j>=10-i)
		{
			System.out.print(" ");
		}
		else
		{
			System.out.print("*");
		}
	  }
	System.out.println();
	}
   }
}