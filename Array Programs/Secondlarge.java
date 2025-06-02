
public class SecondLarge
{  public static void main(String x[])
   {
	int a[]={5,3,6,8,2,4};

	for(int i=0; i<a.length; i++)
	{
	  for(int j=i+1; j<a.length ;j++)
	  {
	     if(a[i]<a[j])
	     {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	     }
	  }
	}System.out.print(a[1]+" ");
   }
}