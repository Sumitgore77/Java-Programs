import java.util.*;

class Rectangle{

	int l,w;
	void setLengthWidth(int l,int w){
		this.l=l;
		this.w=w;
	}
	void showArea(){
		
		System.out.println("The area of rectangle is: "+(0.5*l*w));
	}
}
	
public class RectAreaApp
{
   public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter Length of rectangle: ");
	int length=xyz.nextInt();	

	System.out.println("Enter Width of rectangle:");
	int width=xyz.nextInt();
	
	Rectangle r=new Rectangle();
	r.setLengthWidth(length,width);
	r.showArea();
   }
}