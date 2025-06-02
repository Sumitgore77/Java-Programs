Q 1. Write program to search element in array , its element found or not.

java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int elementToSearch = scanner.nextInt();
        boolean found = false;

        for (int element : array) {
            if (element == elementToSearch) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
ay in specific index.