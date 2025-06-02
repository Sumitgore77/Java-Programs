public class InvertedCharTriangle {
    public static void main(String x[]){
        for(int i=4,n=68; i>=0;i--,n--){
 
         for(int j=1;j<=4-i;j++){
             System.out.print(" ");
 
         }
         
         for(int k=i;k>0;k--){
             System.out.print((char)(n)+" ");
             
         }
         System.out.println();
        }
     }
    
}
