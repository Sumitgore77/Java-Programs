//Find third highest Salary of product using class and object

import  java.util.*;

class Product{

	int id;
	String name;
	int price;
	Product(int id,String name,int price){
		this.id=id;
		this.name=name;	
		this.price=price;
	}
		
	int getPrice(){
		return price;
	}
	
}

public class HighSal
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);	
	
	Product p[]=new Product[4];

	System.out.println("Enter Product datails:");
	for(int i=0; i<p.length;i++)
	{
		System.out.println("Enter Product id:");
		int id=xyz.nextInt();
		
		System.out.println("Enter Product Name:");
		String name=xyz.next();
			
		System.out.println("Enter Product Price:");
		int price=xyz.nextInt();

		p[i]=new Product(id,name,price);
	}
	
	for(int i=0; i<p.length; i++){
	   for(int j=i+1; j<p.length;j++)
	   {
		if(p[i].getPrice()>p[j].getPrice()){
			Product temp=p[i];
			p[i]=p[j];
			p[j]=temp;
	        }	
	   }
	}
	
	System.out.println("The maximum third number person salary is :");
        System.out.println("ID: " + p[2].id + ", Name: " + p[2].name + ", Price: " + p[2].price);
	
   }
}