package Arrays;

import java.util.Arrays;
//q: explain the code

public class SecondLargestEl {

    public static int get2ndLargest(int[] arr){
        int n = arr.length;

        Arrays.sort(arr);
        for(int i = n-2;i>=0;i--){
            if (arr[i] != arr[n-1]){
                return  arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,55,32,36};
        System.out.println(get2ndLargest(arr));
    }
}
