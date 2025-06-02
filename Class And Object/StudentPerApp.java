import java.util.*;

class Student{

	int arr[];
	double per;
	void setSubMark(int arr[]){
		this.arr=arr;		
	}
	
	void calculatPer(){
		
		int size=arr.length;
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
		  
		  sum=sum+arr[i];
		
		   per=sum/size;
		}
	  System.out.println("The percentage is: "+per+"%");
	}
	
	void checkGrade(){

		if(per>75 && per<=100){System.out.println("Distinction");}
		else if(per>60 && per<=75){System.out.println("First Division");}
		else if(per>50 && per<=60){System.out.println("Second Devision");}
		else if(per>40 && per<=50){System.out.println("Third Devision");}
		else if(per<40){System.out.println("Failed");}
	}
}

public class StudentPerApp
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter subject Marks");
	
	int arr[]=new int [6];
	
	for(int i=0; i<arr.length;i++)
	{
		arr[i]=xyz.nextInt();
	}
	
	Student s=new Student();
	s.setSubMark(arr);
	s.calculatPer();
	s.checkGrade();
   }
}