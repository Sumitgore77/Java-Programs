//Q 3. Write program to find prime number in array.

public class PrimeNumbersInArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 17};
        
        System.out.println("Prime numbers in the array:");
        for (int element : array) {
            if (isPrime(element)) {
                System.out.print(element + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
