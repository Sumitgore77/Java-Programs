/*
A B C D E F 
B C D E F A 
C D E F A B
D E F A B C 
E F A B C D 
F A B C D E
*/

public class Apat7
{  public static void main(String x[])
   {
	for(int i=6 ; i>=1; i--)
	{
	int count=71;
	int count1=65;
	   for(int j=1; j<7; j++)	
	   {
		if(j<=i){
		System.out.printf("%c ",count-i);
		count++;
		}
		else{
		System.out.printf("%c ",count1);
		count1++;
		}
	   }
	System.out.println();
	}
   }
}

