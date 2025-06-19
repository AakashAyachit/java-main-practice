package Arrays;

public class arraybasics {

    public static void main(String[] args){

        String[] letters = {"a","b","c","d","e"};
        System.out.println(letters[1]);

        int[] nums = {1,2,3,4,5,6};
        nums[0] = 100;
        System.out.println(nums[0]);

        System.out.println(nums.length);

        int[] loopnos = {10,20,30,40,50};
        for(int i = 0; i < loopnos.length; i++){
            System.out.println(loopnos[i]);
        }

        for(int i : loopnos){
            System.out.println(i);
        }

}}
