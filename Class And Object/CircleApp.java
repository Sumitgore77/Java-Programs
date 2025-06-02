import java.util.*;

class Circle{
	float r;
	void setRadius(float r){
		this.r=r;
	}
	
	void getArea(){
	 System.out.println("The area of circle is: "+(3.14f*r*r));
	}
}

public class CircleApp
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter radius of circle:");
	float r=xyz.nextFloat();

	Circle c=new Circle();
	c.setRadius(r);
	c.getArea();
   }
}