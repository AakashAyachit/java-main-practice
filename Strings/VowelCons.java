package Strings;

public class VowelCons {

    public static void main(String[] args) {
        String str = "hello world";
        CountVowCons(str);
    }

    public static void CountVowCons(String str){

        str = str.toLowerCase();
        int vowels =0, consonants = 0;

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("vowels- " + vowels);
        System.out.println("consonants- "+ consonants);
    }

}
