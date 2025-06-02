import java.util.*;
class DigitCount{

	int no;
	void setValue(int no){
		this.no=no;
	}

	int getDigCount(){

		int count=0;

		while(no!=0){
			count++;
		no=no/10;
		}

	   return count;
	}
	
}

public class DigCount
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number:");
	int num=xyz.nextInt();
	
	DigitCount d=new DigitCount();
	d.setValue(num);

	int result=d.getDigCount();
	
	System.out.println("The count of number is "+result);
   }
	
}