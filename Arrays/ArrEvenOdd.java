package Arrays;

public class ArrEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int even = 0;
        int odd = 0;

        for(int i = 0;i< arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
//        for(int num : arr){
//            if(num%2 == 0){
//                even++;
//            }
//            else{
//                odd++;
//            }
//        }

        System.out.println("odd "+odd);
        System.out.println("even "+ even);
    }
}
