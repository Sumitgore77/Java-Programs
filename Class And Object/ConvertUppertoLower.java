import java.util.*;

class ConvertUpper{

	char ch[];
	void setCharArray(char ch[]){

		this.ch=ch;
	}

	void convertToUpper(){
		System.out.println("\nBefore :");
		for(int i=0; i<ch.length;i++)
		{
			System.out.printf("%c\t",ch[i]);
			
		}
		System.out.println("\nAfter :");
		for(int i=0; i<ch.length;i++)
		{
			System.out.printf("%c\t",ch[i]-32);
			
		}
	}
}

public class ConvertUppertoLower
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter character value :");
	
        String input = xyz.nextLine(); 

        char[] ch = input.toCharArray();
	
	ConvertUpper c=new ConvertUpper();
	c.setCharArray(ch);
	c.convertToUpper();
   }
}