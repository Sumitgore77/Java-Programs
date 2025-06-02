import java.util.*;
public class AnagramArr{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[5];
	int b[]=new int[5];
	int i,j;
	System.out.println("Enter Elements in first array");
	
	for(i=0;i<a.length;i++){
	a[i]=xyz.nextInt();
	}
	
	System.out.println("Enter elements in second Array");
	
	for(i=0;i<b.length;i++){
	b[i]=xyz.nextInt();
	}
	
	int temp;
	for(i=0;i<a.length;i++){
	      for(j=i+1;j<a.length;j++){
		if(a[i]>a[j]){
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
	    }
	}
	System.out.println();
	for(i=0;i<a.length;i++){
	System.out.printf("%d\t",a[i]);
	}
	
	for(i=0;i<b.length;i++){
	      for(j=i+1;j<b.length;j++){
		if(b[i]>b[j]){
		temp=b[i];
		b[i]=b[j];
		b[j]=temp;
		}
	    }
	}
	System.out.println();
	for(i=0;i<b.length;i++){
	System.out.printf("%d\t",b[i]);
	}

	boolean flag =true;
	for(i=0;i<a.length;i++){
	   if(a[i]!=b[i]){
	     flag=false;
	     break;
	  }
	}

	if(flag==true){
	System.out.println("\nArray is Anagram Array");
	}
	
	else{System.out.println("\nArray is not Anagram Array");}
   }
}