 /*WAP to create the class name as Student with a following methods */

import java.util.*;
class Student{
	int arr[];
	int per;
	void setSubMarks(int arr[]){
		this.arr=arr;
	}
	void calculatePer(){
		int sum=0;
		for(int i=0; i<arr.length;i++){
			sum=sum+arr[i];
		}

		 per=sum/arr.length;
		System.out.println("The sum of Subject is:"+sum);
		  System.out.println("The percentage is: " + per + "%");
	}
	void checkGrades(){

		if(per>75 && per<=100){
				
			System.out.println("The Student in Distinction.");
		}
		else if(per>60 && per<=75){
	
			System.out.println("The Student in first Division");
		}
		else if(per>=50 && per<=60){
		
			System.out.println("The Student in Second Division.");
		}
		else if(per>40 && per<=50){	
		
			System.out.println("The Student in Third Division .");
		}
		else if(per<=40){
	
			System.out.println("Student Failed.");
		}
		
	}	
}

public class StudentApp
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter Six Subject Marks :");
	
	int arr[]=new int[6];
	for(int i=0; i<arr.length; i++){
	
		arr[i]=xyz.nextInt();
	}
	System.out.print("The six subject marks respectively :");
	for(int i=0; i<arr.length; i++)
	{
	    System.out.printf("%d\t",arr[i]);
	}
	Student s=new Student();
	s.setSubMarks(arr);
	s.calculatePer();
	s.checkGrades();
   }
}
