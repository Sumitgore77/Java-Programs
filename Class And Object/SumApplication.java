/*WAP program create the class name as Sum with a following methods */

class Sum{
	void setValue(int...x){
		
		int sum=0;
		for(int i=0; i<x.length; i++){
		
			sum=sum+x[i];
		}
		System.out.println("The sum of all elements is: " + sum);
	}
}

public class SumApplication
{   public static void main(String x[])
   {

	Sum s= new Sum();

	s.setValue(20,30,40);
	s.setValue(40,50);
	s.setValue(10,20,30);
   }
}