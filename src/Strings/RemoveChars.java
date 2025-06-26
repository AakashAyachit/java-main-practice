package Strings;

public class RemoveChars {

    public static void main(String[] args) {

        String str = "Hello World";
        char target = 'o';
        StringBuilder finalstr = new StringBuilder();

        for (int i = 0; i< str.length();i++){
            if(str.charAt(i)!=target){
                finalstr.append(str.charAt(i));
            }
        }

        System.out.println("final string after removing 'o' is - "+ finalstr);
    }
}
