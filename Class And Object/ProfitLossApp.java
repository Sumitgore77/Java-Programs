/*WAP to create the class name as Seller with a following functions*/

import java.util.*;
class Seller{

	int cp,sp;
	void setValue(int cp,int sp){
	
		this.cp=cp;
		this.sp=sp;
	}
	
	void showProfitLoss(){
	
		if(cp>sp){
			System.out.println("Profit");
		}
		else if(cp==sp){
			System.out.println("No profit ,No loss");
		}
		else{
			System.out.println("Loss");
		}
	}
}
public class ProfitLossApp
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner (System.in);
	System.out.println("Enter Selling price :");
	int sp=xyz.nextInt();
	
	System.out.println("Enter cost price :");
	int cp=xyz.nextInt();

	Seller s=new Seller();
	s.setValue(sp,cp);
	s.showProfitLoss();
   }
}