//bubble sort

public class bubblesort
{  public static void main(String x[])
   {	
	int num[]={7,6,9,4,5,10,8};
	
	for(int i=0; i<num.length; i++)
	{
	  for(int j=1+i; j<num.length; j++)
	   {
		if(num[i]>num[j])
		{
		  int temp=num[i];
		  num[i]=num[j];
		  num[j]=temp;
		  
		  System.out.print(temp);
		}
		else
		{
		  System.out.print(num[i]+" ");
		}
	
		
   	   }
	}
   }
}