package Strings;

public class RemovesDupes {

    public static void main(String[] args) {

        String str = "hello";
        System.out.println(noDupes(str));
    }

    public static String noDupes(String str){

        String result = "";

        for(int i = 0; i< str.length();i++){
            char ch = str.charAt(i);
            if (result.indexOf(ch)==-1){
                result += ch;
            }
        }
        return result;
    }
}
