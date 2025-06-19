package Strings;

public class Palindrome {
    public static void main(String[] args) {

        String str = "madam";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){

        str = str.toLowerCase();
        String rev = "";

        for(int i = str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }
}
