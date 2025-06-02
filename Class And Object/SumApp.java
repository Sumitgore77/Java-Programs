
class Sum{
		
	void calSum(int ...x){
	
		int sum=0;
		for(int i=0; i<x.length;i++){
		
			sum=sum+x[i];
		}
		System.out.println("The sum is:"+sum);
	}
}

public class SumApp
{  public static void main(String x[])
   {	
	Sum s= new Sum();
	s.calSum(40,20,69,40);
	s.calSum(40,30,50);
	s.calSum(4,68,8);
   }
}