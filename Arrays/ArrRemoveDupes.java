package Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrRemoveDupes {

    public static void main(String[] args) {

        int[] arr = {1,2,1,3,4,6,8,4,4,5,5,5,5};

        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for(int num : arr){
            uniqueSet.add(num);

        }
        System.out.println("unique elements are "+ uniqueSet);
//        System.out.println("unique elements are ");
//        for (int num : uniqueSet){
//            System.out.println(num + " ");
        }
    }

