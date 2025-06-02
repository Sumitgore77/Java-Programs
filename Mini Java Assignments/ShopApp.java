import java.util.*;
class Product{


	private int id;
	private String name;
	private int qty;
	private int price;

	Product(int id,String name,int qty,int price){

		this.id=id;
		this.name=name;
		this.qty=qty;	
		this.price=price;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getQty(){
		return qty;
	}
	public int getPrice(){
		return price;
	}
}

class Customer{
	
	 Product p[];
	 String name;
	 int id;
	 String Addr;
	 int t=0;
	
	Customer(Product ...p){
		this.p=p;
	}
	void setCust(String name,int id,String Addr){
		this.name=name;
		this.id=id;
		this.Addr=Addr;

	}
	
	void display(){

		System.out.println("Customer Name:"+name+"\tId:"+id+"\tAddress:"+Addr);
		System.out.println("---------------------------------------------------");
		System.out.println("Id\t"+"Name\t"+"Quantity\t"+"Rate\t"+"Total");
	
	
		int total=0;
		for(int i=0; i<p.length;i++)
		{	
			t=p[i].getQty()*p[i].getPrice();
			total+=t;
		
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getQty()+"\t\t"+p[i].getPrice()+"\t"+t);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Total bill is:"+total);
	}
}

public class ShopApp{

   public static void main(String x[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter How many products:");
	int size=sc.nextInt();
	
	Product p[]=new Product[size];
	
	Customer c=new Customer(p);

	c.setCust("Sumit",1,"Pune");

	for(int i=0; i<size;i++)
	{
		System.out.println("Enter product id:");
		int id=sc.nextInt();
		sc.nextLine();
	
		System.out.println("Enter product Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter product Quantity:");
		int qty=sc.nextInt();

		System.out.println("Enter product Price:");
		int price=sc.nextInt();
		
		p[i]=new Product(id,name,qty,price);

	}
	c.display();

	

	
	
   }
}