package Strings;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s1, String s2){

        if (s1.length() != s2.length()){
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s1.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        String str1 = "pool";
        String str2 = "polo";

        if (isAnagram(str1,str2)){
            System.out.println("it is anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}
