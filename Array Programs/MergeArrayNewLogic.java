import java.util.*;
public class MergeArrayNewLogic {
    public static void main(String x[])
    {
            Scanner xyz=new Scanner(System.in);
            System.out.println("Enter array 1");
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        int arr3[]=new int[arr1.length+arr2.length];

        for(int i=0; i<arr1.length;i++){
            arr1[i]=xyz.nextInt();
        }
        System.out.println("Enter 2 array");
        for(int i=0; i<arr2.length; i++){
            arr2[i]=xyz.nextInt();
        }
        for(int i=0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        for(int i=0; i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        int index=0;

        for(int i=0; i<arr1.length;i++){
            arr3[index++]=arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            arr3[index++]=arr2[i];
        
        }
        for(int i=0; i<arr3.length;i++){
            System.out.printf("%d\t",arr3[i]);
        }
    }
}
