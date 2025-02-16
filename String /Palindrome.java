import java.util.*;
public class StringTOChar{

  public static void main(String x[])
  {
    String str="MY name is Sumit";

    String rev=str.reverse();

    if(str==rev)
    {  
        System.out.println("String is Palindrom");
    }
    else{
        System.out.println("String is not Palindrom");
    }
  }
}
