import java.util.*;

class Armstrong{
	
	int num;
	void setValue(int num){
		this.num=num;
	}
	
	boolean getArmstrongNum(){
	
		int temp=num;
		int arm=0;
		while(temp!=0){
				
			int rem=temp%10;
			arm=arm+(rem*rem*rem);
			temp=temp/10;
		}
		if(num==arm){
			return true;
		}
		else{ return false;}

	}
}

public class ArmstrongNum
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter value:");
	int no=xyz.nextInt();
	
	Armstrong a=new Armstrong();
	a.setValue(no);
	a.getArmstrongNum();

	if(a.getArmstrongNum()){
		System.out.println(no+" :is Armstrong number.");
	}
	else{System.out.println(no+" :is not Armstrong number.");}
   }
}