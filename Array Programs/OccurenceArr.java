
/*Q.7 WAP to enter the 10 element array and print the occurrence of every element ?
a[0] a[1] a[2] a[3] a[4] a[5] a[6] a[7] a[8] a[9]
10 20 30 10 20 50 30 10 30 10
Output :
Element count
10 -------------------- 4
20 -------------------- 2
30 -------------------- 3
50 -------------------- 1 */

// occurrence of elements with count

public class OccurenceArr{

	public static void main(String x[])
	{

	int a[]={1,2,2,2,3,5,5,7,7};

	boolean b[]=new boolean[a.length];

	for(int i=0;i<a.length;i++){

		if(b[i]){continue;}					//--------------->
		
			int count=1;

		for(int j=i+1;j<a.length;j++){

		if(a[i]==a[j])
		{
			count++;
			b[j]=true; 	
			// same element get true then it cannot again repeat to check}
		}
		}	

		System.out.printf("element=%d and its count= %d\n",a[i],count);
		


		}

}

}