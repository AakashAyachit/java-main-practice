package Strings;

public class CountWords {
    public static void main(String[] args) {
        String str = "hello i am here";

        //using split()
        String[] words = str.trim().split("\\s");
        System.out.println("no of words using split- "+ words.length);

        //using loops
        int noOfWords = 0;
        boolean isWord = false;

        for(int i = 0;i < str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                if(!isWord){
                    noOfWords++;
                    isWord = true;
                }
            }
            else{
                isWord = false;
            }
        }
        System.out.println("no of words using loop- "+ noOfWords);

    }
}
