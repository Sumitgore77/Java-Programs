import java.util.*;
public class FindArray
{ public static void main(String x[])
  {
	Scanner xyz=new Scanner(System.in);	
	System.out.print("Enter a number array size :");
	int no=xyz.nextInt();
	System.out.print("ok");


	int number[]=new int[no];

	for(int i=0; i<=no; i++)
	{
         number[i]=xyz.nextInt();
	}
	
	System.out.print("Enter fining array number :");
	int a=xyz.nextInt();

	for(int i=0; i<number.length;i++)
	{
		if(number[i]==a)
		{
		System.out.print("The index of a number is :"+i);
		}
	}
  }

}

