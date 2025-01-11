/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
  */
public class pat1
{
   public static void main(String [] x)
   {
	
	for(int i=0;i<=6;i++)
	{
	  int p=1;
	  for(int j=0; j<i;j++)
	  {
		System.out.print(p+++" ");
	  }
	System.out.println();
	}

   }
}
