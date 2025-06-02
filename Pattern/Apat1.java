/*
A B C D E F
G H I J
K L
M
N O
P Q R S
T U V W X Y
*/

public class Apat1
{
	public static void main(String x[])
	{
	int count=65;
	int a[]={6,4,2,1,2,4,6};

	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=7;j++)
		{
			if(j<=a[i-1])
			{
			System.out.printf("%c ",count);
			count++;
			}
		}
		System.out.println();
	}

   }
}