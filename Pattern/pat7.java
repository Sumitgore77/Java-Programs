public class pat7
{  public static void main(String x[])
   {
	for(int i=1; i<=5; i++)
	{
	  for(int j=1; j<=7; j++)
	  {
		if(j<=2+i && i<=j)
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