public class CharDiamond {

        public static void main(String x[]){
    
            for (int i = 1; i <= 4; i++) {
                for (int j = i; j < 4; j++) {
                    System.out.print("  ");
                }
                char num = 'A';
                for (int j = 1; j <= i; j++) {
                    System.out.print(num++ +" ");
                }
                for (char j = (char)(num - 2); j >= 'A'; j--) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
    
            for (int i = 3; i>=1; i--) {
                for (int j = i; j < 4; j++) {
                    System.out.print("  ");
                }
                char num = 'A';
                for (int j = 1; j <= i; j++) {
                    System.out.print(num++ +" ");
                }
                for (char j = (char)(num - 2); j >= 'A'; j--) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
        
    
    
    
}
