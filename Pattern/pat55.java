public class pat55
{  public static void main(String x[])
   {
	for(int i=1; i<=5; i++)
        {	int count=64;
	   for(int j=0; j<=5;j++ )	
	   {
		System.out.printf("%c ",count+i);
		count++;
	   }
	  System.out.println();	
	}
   }
}