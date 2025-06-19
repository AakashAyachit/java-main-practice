package Strings;

public class CountLetters {
    public static void main(String[] args) {
        String s = "hello";
        int letters = 0;

        for(int i = 0; i< s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                letters++;
            }
        }
        System.out.println("no of letters- " + letters);
    }
}
