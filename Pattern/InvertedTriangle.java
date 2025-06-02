public class InvertedTriangle {
        public static void main(String x[]){
           for(int i=4; i>=0;i--){
    
            for(int j=1; j<=4-i;j++){
                System.out.print(" ");
    
            }
            
            for(int k=i;k>0;k--){
                System.out.print(i+" ");
                
            }
            System.out.println();
           }
        }
        
    
     
    
}
