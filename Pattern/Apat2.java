/*
1
0 1 
1 0 1
0 1 0 1
1 0 1 0 1  */

public class Apat2
{  public static void main(String x[])
   {
	for(int i=1; i<=5;i++)
	{
	  for(int j=1; j<=i; j++)
	  {
	     if(i%2==0)
	     {  if(j%2==0)
		{
		System.out.print("1 ");
		}
		else{System.out.print("0 ");}
	     }
	    
	     else
	     {
	     
		if(j%2==1)
		{
		System.out.print("1 ");
		}
		else{System.out.print("0 ");}
	     

	     }
	  }
	System.out.println();
	}
   }
}