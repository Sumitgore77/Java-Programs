/*
      1
     212
    32123
   4321234
  543212345
 65432123456
        */

public class pat3
{
   public static void main(String x[])
   {
	for(int i=0; i<=6;i++)
	{

	   for(int j=i; j<=6; j++)
	   {
		System.out.print(" ");
	   }
	   for(int j=i; j>0; j--)
	   {
		System.out.print(j);
	   }
	   for(int j=2; j<=i; j++)
	   {
		System.out.print(j);
	   }

	  System.out.println();
	}
	
   }
}
