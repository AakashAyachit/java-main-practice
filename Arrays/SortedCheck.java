package Arrays;

public class SortedCheck {
    public static void isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array is not sorted");
                return;
            }
        }
        System.out.println("Array is sorted");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 8, 9};
        isSorted(arr);

        int[] arr2 = {1,2,4,3,5,6,7,8,9};
        isSorted(arr2);
    }
}
