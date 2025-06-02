public class Apat11 {

    public static void main(String x[]){

        int arr[]={8,6,4,3,5};

        int count=65;
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i];j++){

                System.out.print(" "+(char)count++);

            }
            System.out.println();
        }
    }
    
}
