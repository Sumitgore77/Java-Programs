public class pat56
{  public static void main(String x[])
   {
	int count=65;
	for(int i=0; i<=4; i++)
	{
	   for(int j=0; j<=7;j++)
	   {
		if(j<=7-i && j>=i)
		{
			System.out.print(" ");
		}
		else{System.out.printf("%c",count);
		count++;}
	   }
	   System.out.println();
	}
   }
}