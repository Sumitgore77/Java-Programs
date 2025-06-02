public class SortData {
    int n, temp, i, j;

    public void asec(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Assending Order");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " "); // Changed println to print for proper formatting
        }
        System.out.println(); // Added a newline after printing the array.
    }

    public void desc(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Descending Order");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " "); // Changed println to print for proper formatting
        }
        System.out.println(); // Added a newline after printing the array.
    }
}

public class Prac4a {
    public static void main(String[] args) {
        SortData obj = new SortData();
        int arr[] = {13, 22, 27, 11, 4};
        obj.asec(arr);
        obj.desc(arr);
    }
}