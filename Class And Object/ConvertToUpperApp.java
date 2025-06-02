/*create the class name as ConvertToUpper with a following methods*/

class ConvertToUpper{

	char ch[];
	
	void setCharArray(char ch[]){

		this.ch=ch;	
	}
	void convertToUpperCase(){

		for(int i=0; i<ch.length;i++)
	 	{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}	
		}
		System.out.print("The upper case array is:");
		for(int i=0; i<ch.length; i++)
		{
			System.out.print(ch[i]);
		}
	}
}

public class ConvertToUpperApp
{
  public static void main(String x[])
  {
	char ch[]=new char[]{'s','u','m','i','t'};
	
	ConvertToUpper cu= new ConvertToUpper();
	cu.setCharArray(ch);
	cu.convertToUpperCase();
  }
}