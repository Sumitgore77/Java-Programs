public class CharTriangleJ{
    public static void main(String x[]){

        for(int i=0; i<=4; i++){
            for(int j=0; j<4-i;j++){
                System.out.print(" ");
            
            }
            for(int j=0; j<i;j++){
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
    }
}