// public class NumTriangle {
//     public static void main(String x[]){

//         for(int i=0; i<=4;i++){

//             int k=1;
//             for(int j=0; j<4-i;j++){
//                 System.out.print(" ");
            
//             }

//             for(int j=0;j<i;j++){
//                 System.out.print((k++)+" ");
//             }
//             System.out.println();
//         }
//     }
    
// }

//Character Logic 
public class NumTriangle {
    public static void main(String x[]){

        for(int i=0; i<=4;i++){

            char k=65;
            for(int j=0; j<4-i;j++){
                System.out.print(" ");
            
            }
            for(int j=0;j<i;j++){
                System.out.print((k++)+" ");
            }
            System.out.println();
        }
    }
    
}

