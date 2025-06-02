public class Apat9
{  public static void main(String x[])
   {
	int a=0,b=1,temp;
    	for (int i=0;i<=15; i++)
	 {    
 	    temp=a;
  	    System.out.println(temp+"  ");
  	    a=a+b;
  	    b=temp;
	}
	for(int i=5; i>=1; i--)
	{
	   boolean flag=true;
	   for(int j=1; j<=9; j++)
	   {
		if((j>=6-i && j<=4+i) && flag){
		System.out.print("* ");
		flag=false;
		}
		else{	
			flag=true;
			System.out.print("  ");
		
		}
	   }
	System.out.println();
	}
   }
}