public class pat13
{  public static void main(String x[])
   {
	for(int i=1; i<=6; i++)
	{
	  for(int j=1; j<=6; j++)
	  {
	    if(i==j || i==1 || j==6)
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