/*WAP to create the class Employee with a following methods*/

import java.util.*;
class Employee{

	String name;
	int id;
	int sal;
	int percent;
	void setPersonalInfo(String name,int id,int sal){

		this.name=name;
		this.id=id;
		this.sal=sal;
	
	}
	void setProgressPer(int percent){

		this.percent=percent;
	
	}
	void show(){
		System.out.println("Emoloyee Details.");
		System.out.println("------------------------------------");
		System.out.println("The Employee Name is "+name);
		System.out.println("The Emoloyee id is "+id);
		System.out.println("The Employee salary is "+sal);
		System.out.println("The Employee Progress is "+percent+" %");
	}	
}

public class EmployeeAppSimple
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("");

	
	System.out.println("Enter name of employee :");
	String name=xyz.nextLine();

	System.out.println("Enter id of employee:");
	int id=xyz.nextInt();

	System.out.println("Enter Salary of emoloyee:");
	int sal=xyz.nextInt();

	System.out.println("Enter Progress Percentage of Employee :");
	int percent=xyz.nextInt();
	
	
	
	Employee e = new Employee();
	e.setPersonalInfo(name,id,sal);
	e.setProgressPer(percent);
	e.show();
   }
}