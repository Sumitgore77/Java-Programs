public class CharTRiangle {
    public static void main(String x[]){
        
        for(int i=0; i<4;i++){
            for(int j=1; j<=4-i;j++){
                System.out.print(" ");
            }
            int cal=1;
            for(int j=0;j<=i;j++){
                System.out.print(cal+" ");

                 cal=cal*(i-j)/(j+1);
            }
            System.out.println();
        }
     }
    
}


/*
    1 
   1 1
  1 2 1
 1 3 3 1
 
 */