public class InvertedNumPat {
    public static void main(String x[]){

        for(int i=4; i>=0;i--){

            for(int j=1; j<=4-i;j++){
                System.out.print(" ");
            }
            int no=1;
            for(int j=0;j<i;j++){

                System.out.print(no++ +" ");
            }
            System.out.println();
        }
    }
    
}
