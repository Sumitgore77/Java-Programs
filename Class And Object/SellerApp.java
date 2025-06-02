import java.util.*;

class Seller{

	int sp,cp;
	void acceptSellingCostPrice(int sp,int cp){
		this.sp=sp;
		this.cp=cp;
	}
	void showProfitLoss(){
		
		if(sp>cp){System.out.println("Profit");}
		else if(sp<cp){System.out.println("Loss");}
		else{System.out.println("No profit, No Loss");}
	}
}

public class SellerApp
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter Selling price:");
	int sp=xyz.nextInt();

	System.out.println("Enter cost price:");
	int cp=xyz.nextInt();

	Seller s=new Seller();
	s.acceptSellingCostPrice(sp,cp);
	s.showProfitLoss();
   }
}