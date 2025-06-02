import java.util.*;

class Employee{

	int id,sal,per;
	String name;
	double inSal;

	void setInfo(int id,String name,int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	void setProgress(int per){
		this.per=per;

		if(per>60)
		{
			 inSal=sal+(0.30*sal);
		}
		else
		{	 inSal=sal;
		}
	}
	
	void showInfo(){

		System.out.println("Id :"+id+"\tName: "+name+"\tSal: "+sal+"\tIncremental Sal:"+inSal);
	}
}

public class EmployeeApp
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter Employee id");
	int id=xyz.nextInt();
	
	xyz.nextLine();
	
	System.out.println("Enter name:");
	String name=xyz.nextLine();
	
	System.out.println("Enter Basic Salary");
	int sal=xyz.nextInt();

	System.out.println("Enter progress in percentage:");
	int per=xyz.nextInt();

	Employee e=new Employee();
	e.setInfo(id,name,sal);
	e.setProgress(per);
	e.showInfo();
   }
}