/* Write a Java program to separate even and odd numbers from a given array of 
integers. Put all even numbers first, and then odd numbers. 
Input – 20 12 23 17 7 8 10 2 1 0
Output- 20 12 0 2 10 8 7 17 1 23 */

public class oddEvenArray
{  public static void main(String x[])
   {	
	int num[]={20,12,23,17,7,8,10,2,1,0};
	int len=num.length;

	for(int i=0; i<len;i++)
	{
	  if(num[i]%2==0)
	  {	
		System.out.println("The even number is :"+num[i]);
	  }
	
	  else{ 
		System.out.println("The odd number is :"+num[i]);
	      }
	}
   }
}
