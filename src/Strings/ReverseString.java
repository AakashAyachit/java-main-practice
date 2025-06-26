package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String strRev = "";

        for(int i = str.length()-1; i >=0; i--){
            strRev += str.charAt(i);
        }
        System.out.println(strRev+ " is the reverse of "+ str);
    }
}


