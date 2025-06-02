/*  
        *
  * * * * * * *
  *     * 
  * * * * * * *
        *     *
  * * * * * * * 
        *
*/

public class Apat6
{  public static void main(String x[])
   {
	for(int i=1; i<=7; i++)
	{
	  for(int j=1; j<=7; j++)
	  {
		if(i==2 || i==4 || i==6 || j==4)
		{
		   System.out.print("* ");	
		}
		else if(j==1 && i==3 || j==7 && i==5){System.out.print("* ");}
		else{System.out.print("  ");}
	  }
	System.out.println();
	}
   }
}