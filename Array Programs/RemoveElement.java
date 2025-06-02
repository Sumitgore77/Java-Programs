//Q 4. Write program to remove element in specific index.

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner xyz=new Scanner(System.in);
        System.out.println("Enter delet element index");
        int indexToRemove=xyz.nextInt();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
     

        int[] newArray = new int[array.length - 1];
        
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == indexToRemove) {
                continue;
            }
            newArray[k++] = array[i];
        }

        System.out.println("Array after removing element at index " + indexToRemove + ": " + Arrays.toString(newArray));
    }
}
