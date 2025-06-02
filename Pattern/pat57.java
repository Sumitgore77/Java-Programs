public class pat57
{  public static void main(String x[])
   {
	for(int i=1; i<=7; i++)
	{
	   for(int j=1; j<=7; j++)
	   {	
		if(i<=4 && (j==3+i || j==5-i))
		{
			System.out.print("* ");
		}
		else if(i==4 || j==4){
			System.out.print("* ");
		}
		else if(i>4 && (j==i-3 || j==11-i)){
			System.out.print("* ");
		}
		else{
			System.out.print("  ");
		}
		
	   }
	  System.out.println();
	}
   }
}