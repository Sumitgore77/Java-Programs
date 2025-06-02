/*Create the Class Name as Rectangle with a following methods and write its logics.*/

import java.util.*;
class Rectangle{

	int len,wed;
	void setValue(int len,int wed){
		this.len=len;
		this.wed=wed;
	}
	void showArea(){
	
		System.out.println("The Area of rectangle:"+len*wed);
	}
}
public class RectangleApp
{ 
   public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter length:");
	int len=xyz.nextInt();
	
	System.out.println("Enter width");
	int wed=xyz.nextInt();

	Rectangle a = new Rectangle();
	a.setValue(len,wed); 
	a.showArea();
   }
}