package Strings;

public class ReplaceSpacesandVowels {
    public static void main(String[] args) {
        String str = "wat erme lo n";
        str = str.replace(" ", "-");

        System.out.println(str);

        String str2 = "hello how are you";
        str2 = str2.replaceAll("[aeiouAEIOU]","");

        System.out.println(str2);
    }
}
