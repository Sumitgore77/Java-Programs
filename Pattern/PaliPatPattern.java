/*
A
A B A
A B C B A
A B C D C B A
A B C D E D C B A */

import java.util.*;
public class PaliPatPattern 
{
    public static void main(String x[]) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the pattern: ");
        int size = scanner.nextInt();
        
        for (int i = 0; i < size; i++) 
	    {
            for (int j = 0; j <= i; j++) 	
	        {
                System.out.print((char)('A'+j) + " "); 
            }
           
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j) + " "); 
            }
            System.out.println(); 
        }
    }
}
