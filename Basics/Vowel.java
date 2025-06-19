package Basics;

public class Vowel {

    public static void CheckVowel(char a){
        a= Character.toLowerCase(a);

        if(a == 'a' || a == 'e' || a == 'i' || a == 'u' || a == 'o'){
            System.out.println(a + " is a vowel");
        }
        else{
            System.out.println(a + " is a consonant");
        }

    }
    
    public static void main(String[] args){

        CheckVowel('e');
        CheckVowel('m');
        CheckVowel('k');
        CheckVowel('a');
        CheckVowel('U');
    }
}
