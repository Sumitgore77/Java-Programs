/*
 Q24. Perform Method overloading using string operation 
void stringOperation(String s): this function can accept string as parameter and sort it
void stringOperation(String first,String second): this function can compare two strings with each other and if strings 
are equal then show message strings are equal otherwise not
void stringOperation(String s,char ch): this function can accept string as parameter and search specific character
in it if character found say character found otherwise show message character not found.

*/
import java.util.*;
public class StringOpe{

	private String s;
	

	public void stringOperation(String s){

		this.s=s;

		char ch[]=s.toCharArray();
	
		for(int i=0;i<ch.length-1;i++)
		{

			for(int j=i+1; j<ch.length;j++ ){
		
				if(ch[i]>ch[j]){
					
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println("Sorted String");
		
		String SortedStr=new String(ch);
		System.out.println(SortedStr);
	
	}
	public void stringOperation(String s,String s1){

		this.s=s;
		
		boolean b=false;
		for(int i=0; i<s.length();i++){

			if(s.equals(s1)){
			
				b=true;	
			}
			else{
				b=false;
			}
		}
		if(b){
			System.out.println("Two String are Similar.");
		}
		else{
			System.out.println("String are not Similar.");
		}	
	}
	public void stringOperation(String s,char ch){

		this.s=s;
		
		boolean b=false;
		for(int i=0; i<s.length();i++){

			int index=s.indexOf(ch);  
			if(index!= -1){

				System.out.println("Character is Found "+index);
				b=true;
				break;
			}
			else{
				System.out.println("Character is not Found..!!");
				
			}
		}
		
	}

}

public class StringOperations{

	public static void main(String x[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("---Stlect---");
		System.out.println("1.Sort String");
		System.out.println("2.Compare Two String");
		System.out.println("3.Find Character in String");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Main String: ");
		String s=sc.nextLine();

		StringOpe v=new StringOpe();

		switch(choice){

		case 1:
			v.stringOperation(s);
		  break;
		case 2:
			System.out.println("Enter String Which you want to Compare:");
			String s1=sc.nextLine();

			v.stringOperation(s,s1);

		
		  break;
		case 3:

			System.out.println("Enter Character you want to search:");
			char ch=sc.next().charAt(0);;

			v.stringOperation(s,ch);

		
		  break;
		default:
			System.out.println("Invalid Choice");		
		}
	}
}
