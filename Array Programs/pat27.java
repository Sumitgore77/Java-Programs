public class pat27 {
    public static void main(String[] args) {
        int n = 5;  // Number of rows

        // Upper part of the combined arrow
        for (int i = 0; i < n; i++) {
            // Left arrow part
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            
            // Space between the arrows
            System.out.print("   ");
            
            // Right arrow part
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the combined arrow
        for (int i = n - 2; i >= 0; i--) {
            // Left arrow part
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            
            // Space between the arrows
            System.out.print("   ");
            
            // Right arrow part
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
