import java.util.*;

class Power{

	int a;
	int b;
	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	int getPower(){
	
		int pow=1;
		for(int i=0; i<b;i++)
		{
			pow=pow*a;	
		}
		return pow;
	}
}

public class PowerCal
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	
	System.out.println("Enter base value:");
	int base=xyz.nextInt();
	
	System.out.println("Enter index value :");
	int index=xyz.nextInt();
	
	Power p=new Power();
	p.setValue(base,index);
	p.getPower();
	
	System.out.println("The power of"+base+" is "+p.getPower());
   }
}