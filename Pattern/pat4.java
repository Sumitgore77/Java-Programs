/*
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
6 6 6 6 6 6
  */
public class pat4
{
  public static void main(String x[])
  {
	for(int i=1; i<7;i++)	
	{
	     for (int j=7-i; j>1; j--)
            {
                System.out.print(" ");
            }
	    for (int j=1; j<=i; j++ )
            {
                System.out.print(i+" ");
            }
	  System.out.println();
	}
  }
}
