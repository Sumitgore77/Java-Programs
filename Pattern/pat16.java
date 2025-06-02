public class pat16
{  public static void main(String x[])
   {
      for(int i=1; i<=5; i++)
      {
	for(int j=1; j<=9; j++)
	{
	  if( i==5||j==6-i && j<=5)
	  {
		System.out.print("* ");
	  }
	  else if(j>5 &&j==4+i)
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