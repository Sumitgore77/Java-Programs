
import java.util.*;
public class SumofDiagonal2D{
    public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter size square of matrix ");
	int n=xyz.nextInt();
	int i,j;
	int a[][]=new int[n][n];
	System.out.println("Enter elements ");
	
	for(i=0;i<n;i++){
	    for(j=0;j<n;j++){
	a[i][j]=xyz.nextInt();
	    }
	}
	
	System.out.println("\n matrix");
	for(i=0;i<n;i++){
	    for(j=0;j<n;j++){
	System.out.printf("%d\t",a[i][j]);
	    }
	System.out.println();
	}

	  int suml=0,sumr=0;
	for(i=0;i<n;i++){
	    for(j=0;j<n;j++){
	            if(i==j){
	            suml=suml+a[i][j];
                              }
	        if(i+j==n-1){
	       sumr=sumr+a[i][j];
	       }
	        
	    }
	}
	System.out.println("Sum of left diagonal is "+suml);
	System.out.println("Sum of right diagonal is "+sumr);
	
   }
}