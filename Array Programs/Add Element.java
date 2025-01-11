//Q 5. Write program to add element in specific index of array.
public class AddElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToAdd = 99;
        int indexToAdd = 2;  // Adding element at index 2 (3rd position)

        int[] newArray = new int[array.length + 1];
        
        for (int i = 0, k = 0; i < newArray.length; i++) {
            if (i == indexToAdd) {
                newArray[i] = elementToAdd;
            } else {
                newArray[i] = array[k++];
            }
        }

        System.out.println("Array after adding element at index " + indexToAdd + ": " + Arrays.toString(newArray));
    }
}
