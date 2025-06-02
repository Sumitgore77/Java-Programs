public class PaliPyrimidTri {
    public static void main(String x[]){

        for(int i=1; i<=4; i++){

            for(int j=i;j<=4; j++){

                System.out.print("  ");
            }

            int num=1;
            for(int j=1;j<=i;j++){
                System.out.print(num++ +" ");
            }

            for(int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}

/*
        1 
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
  
 */