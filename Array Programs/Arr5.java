/* Q9 Write a program in java to separate odd and even integers in separate arrays ?
Test Data :
Input the number of elements to be stored in the array :5
Input 5 elements in the array :
element - 0 : 25
element - 1 : 47
element - 2 : 42
element - 3 : 56
element - 4 : 32
Expected Output :
The Even elements are :
42 56 32
The Odd elements are :
25 47
*/

public class Arr5
{ public static void main(String x[])
  {
	int arr[]={25,47,42,56,32};

	for(int i=0;i<arr.length; i++)
	{
	  if(arr[i]%2==0)
	  {
	    System.out.println("The Even numbers is : \t"+arr[i]);
	  }
	  else
	  {
	   System.out.println("The odd numbers is:\t"+arr[i]);
	  }
	}
  }
}