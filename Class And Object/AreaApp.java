/*WAP to create the class name as Circle with a following methods*/

import java.util.*;
class Area{
	float r;	
	
	void setArea(float r){
		this.r=r;

	}
	void CalculateArea(){

		System.out.println("The area id circle is:"+3.14*r*r);
	}

}
public class AreaApp
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner (System.in);
	System.out.println("Enter your number :");
	float r=xyz.nextFloat();
	
	Area a = new Area();
	a.setArea(r);
	a.CalculateArea();
   }
}