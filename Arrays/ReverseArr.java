package Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        int[] revarr = new int[n];

        for(int i = 0;i<n;i++){
            revarr[i] = arr[n-1-i];
        }

        System.out.println("reversed array ");
        for(int num : revarr){
            System.out.print(num + " ");
        }
    }
}
