public class occurance
{  public static void main(String x[])
   {
	int a[]={1,2,1,3,2,5,1};
	boolean b[]=new boolean[a.length];

	for(int i=0; i<a.length;i++)					//1st logic
	{
	if(b[i]==true)
	{
		continue;
	}	
	int count=1;
	for(int j=i+1; j<a.length; j++)
	  {
		if(a[i]==a[j])
		{
			b[j]=true;
			count++;
		}	
	  }System.out.println("The number"+a[i]+"coutnt is"+count);
	}
   }
}
/*import java.util.*;
public class occurance
{  public static void main(String x[])
   {
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array:");
	
	for(int i=0; i<a.length;i++)
	{
	a[i]=sc.nextInt();							//2nd logic
	}
	for(i=0;i<a.length;i++)
	{int count=0;
	  for(int j=i+1; j<a.length; j++)
	  {
		if(a[i]==a[j])
		{
		  count++;
		}	
	  }
	  if(a[i]!=-1 && )
	}
   }
}*/