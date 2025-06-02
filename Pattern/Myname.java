/*9.
 Write a program to enter the character array and print the pattern 
 M 
 Y N A 
 M E I S S
 H U B H A M P
 A T H A D E F R O 
 M P A I T H A N . . .
*/


public class Myname
{  public static void main(String x[])
   {
	int a[]={'M','Y','N','A','M','E','I','S','S','U','M','I','T','J','A','L','I','N','D','A','R','G','O','R','E'};
	int count=0;
	for(int i=0; i<=9;i=i+2)
	{
	   for(int j=0; j<=i; j++)
	   {
		System.out.printf("%c ",a[count]);
		count++;
	   }
	System.out.println();
	}
   }
}
