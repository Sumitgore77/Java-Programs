import java.util.*;

class FindCommon{
	int a1[],a2[],a3[];
	void setValue(int a1[],int a2[],int a3[]){
		this.a1=a1;
		this.a2=a2;
		this.a3=a3;
	}
		
	void getCommonElement(){

		int i = 0, j = 0, k = 0;
       	        int commonCount = 0;

       		 System.out.println("Common elements:");
       		 while (i < a1.length && j < a2.length && k < a3.length) {
           
        	    if (a1[i] == a2[j] && a2[j] == a3[k]) {
         	       System.out.print(a1[i] + " ");
         	       i++;
          	       j++;
          	       k++;
                	commonCount++;
           	 } 
           
          	  else if (a1[i] < a2[j]) {
              		  i++;
          	  } else if (a2[j] < a3[k]) {
               		 j++;
           	  } else {
             	         k++;
           	  }

           
         	   if (commonCount == 2) {
               		 break;
           	 }
        	}
        
      	  if (commonCount == 0) {
      	      System.out.println("No common elements found.");
          }
		
	}
}


public class CommonElementApp
{  public static void main(String x[])
   {
	Scanner xyz=new Scanner(System.in);

	System.out.println("Enter size of 1st array");
	int s1=xyz.nextInt();
	int arr1[]=new int [s1];

	
	System.out.println("Enter value in 1st arry");
	for(int i=0; i<arr1.length;i++){
		arr1[i]=xyz.nextInt();
	}
	
	System.out.println("Enter size of 2st array");
	int s2=xyz.nextInt();
	int arr2[]=new int [s2];

	System.out.println("Enter value in 2st arry");
	for(int i=0; i<arr2.length;i++){
		arr2[i]=xyz.nextInt();
	}

	
	System.out.println("Enter size of 3st array");
	int s3=xyz.nextInt();
	int arr3[]=new int [s3];

	System.out.println("Enter value in 3st arry");
	for(int i=0; i<arr3.length;i++){
		arr3[i]=xyz.nextInt();
	}
	
	FindCommon f=new FindCommon();
	f.setValue(arr1,arr2,arr3);
	f.getCommonElement();

   }
}