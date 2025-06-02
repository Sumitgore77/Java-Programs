import java.util.*;

class Subject{
	
	int s1,s2,s3,s4,s5,s6;
	void setValue(int s1,int s2,int s3,int s4,int s5,int s6){
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
		this.s5=s5;
		this.s6=s6;
	}

	int getPer(){
	
		int total=s1+s2+s3+s4+s5+s6;
		int per=total/6;
		return per;
	}
}

public class CalculatPercentage
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner (System.in);
	System.out.println("Enter how many Subjet 1:");
	int s1=xyz.nextInt();
	
	System.out.println("Enter how many Subjet 2:");
	int s2=xyz.nextInt();
	
	System.out.println("Enter how many Subjet 3:");
	int s3=xyz.nextInt();

	System.out.println("Enter how many Subjet 4:");
	int s4=xyz.nextInt();
	
	System.out.println("Enter how many Subjet 5:");
	int s5=xyz.nextInt();
	
	System.out.println("Enter how many Subjet 6:");
	int s6=xyz.nextInt();
	

	Subject s=new Subject();
	s.setValue( s1, s2, s3, s4, s5, s6);
	s.getPer();

	System.out.println("The Percentage is:"+s.getPer()+"%");
   }
}