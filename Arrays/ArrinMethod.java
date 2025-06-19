package Arrays;

public class ArrinMethod {

    public static void min(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i])
                min = nums[i];
        }
        System.out.println(min);

    }

    public static void main(String[] args) {
        int[] arr1 = {12, 32, 34453, 543, 5, 435, 4, 53};
        min(arr1);
    }
}

