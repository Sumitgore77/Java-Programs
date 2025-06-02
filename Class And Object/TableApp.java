/*Q1. WAP to create class name as Table with two functions 
void setValue(): this function is used for accept number from keyboard 
void showTable(): this function can display the table of number 
*/
import java.util.*;
class Table{

int num;

public void setValue(int num){

	this.num=num;
}

public void showTable(){

	System.out.println("Table for Number is: ");
	for(int i=1; i<=10;i++){

		 System.out.println((i*num));
	}
}
	
}
public class TableApp{

	public static void main(String x[]){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
	
		Table t=new Table();
		t.setValue(num);
		t.showTable();
	}
}