package Arrays;

public class ArrElement {
    public static void main(String[] args) {
        int[] arr = {1,23,44,43,345,98};
        int target1 = 1;
        int target2 = 5;

        boolean found = false;

        for(int i = 0; i<arr.length;i++){
            if(arr[i] == target1){
                found = true;
                break;
            }

        }
        if(found == true){
            System.out.println("num " + target1+" is present in array");
        }
        else{
            System.out.println("num not present in array");
        }
    }
}
