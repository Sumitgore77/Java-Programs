public class PaliPat56
{  public static void main(String x[])
   {	
	for(int i=0; i<7;i++)
	{
	int num=1;
	   for(int j=0; j<=i; j++)	
	   {
		System.out.print(num+" ");
		num=num*(i-j)/(j+1);
	   }
	  System.out.println();
	}
   }
}