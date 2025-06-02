class ArrParent {
    int arr[];
    
    void setValue(int arr[]) {
        this.arr = arr;
    }
    
    void arrangeSeq() {
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class ArrangeAscendingOrder extends ArrParent {
    @Override
    void arrangeSeq() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted in Ascending Order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class ReverseArray extends ArrParent {
    @Override
    void arrangeSeq() {

        System.out.println("Reversed Array:");

	int l=arr.length-1;
        for (int i = 0;i<arr.length/2;i++) {
		int temp=arr[i];
		arr[i]=arr[l];
		arr[l]=temp;
		l--;
        }
	System.out.println("Reverse Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }  
    }
}

public class ArrayMethodOverriding {
    public static void main(String args[]) {
        int inputArr[] = {5, 2, 8, 1, 9};
        
        ArrParent obj1 = new ArrangeAscendingOrder();
        obj1.setValue(inputArr.clone());
        obj1.arrangeSeq();
        
        ArrParent obj2 = new ReverseArray();
        obj2.setValue(inputArr.clone());
        obj2.arrangeSeq();
    }
}
