package Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            sum += arr[i];
        }

        System.out.println("sum is "+ sum);
    }

}
