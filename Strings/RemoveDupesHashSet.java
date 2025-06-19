package Strings;

import java.util.LinkedHashSet;

public class RemoveDupesHashSet {

    public static void removeDupes(String str){

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(int i =0; i<str.length();i++) {
            set.add(str.charAt(i));
        }
            for (Character ch:set)
                System.out.print(ch);

    }

    public static void main(String[] args) {

        String str = "hello";

        removeDupes(str);
    }
}
