package Strings;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "hellooo how are yooou";
        char target = 'o';
        int targetFreq = 0;

        for(int i = 0; i< str.length();i++){
            if(str.charAt(i) == target){
                targetFreq++;
            }
        }
        System.out.println("character 'o' occurs "+ targetFreq + " times");
    }
}
