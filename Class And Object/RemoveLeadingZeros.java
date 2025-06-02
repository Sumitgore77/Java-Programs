/*Q23. WAP to perform following operation on string 
Java String Program to Remove Leading Zeros
Input: 000012356098
Output: 12356098
Explanation: Removing all the elements from the beginning of String which doesn't add any value to the number. 

Your Task is:  you have to create class name as RemoveLeaningZero with two methods 

void setString(String s): this method accept string as parameter 
String getStringWithoutZero(): this method can remove zero and return string after removing leading zero.

*/

import java.util.*;

class RemoveLeading0{
	
	private String str;
	
	public void setString(String str){

		this.str=str;
	}
	
	public String getStringWithoutZero(){
	
		String s="";

		for(int i=0; i<str.length();i++){
	
			if(str.charAt(i)!='0'){
	
				s+=str.charAt(i);
			}

		}

		return s;
	}
}


public class RemoveLeadingZeros{

	public static void main(String x[]){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		String str=sc.nextLine();

		RemoveLeading0 r=new RemoveLeading0();
		r.setString(str);
		String result=r.getStringWithoutZero();

		System.out.println("The New String is: "+result);
	}

}