package Strings;

public class StringBasics {
    public static void main(String[] args) {
        String str = "hello java";

        System.out.println("length of string is " + str.length());

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println("has the word 'hello' - "+ str.contains("hello"));

        System.out.println("index of letter j is "+ str.indexOf("j"));

        System.out.println("a substring is - " + str.substring(2,7));

        System.out.println("replace the word 'java' with 'python' - "+str.replace("java", "python"));

        String s = "        whitespaces are from start and end letter of string ie between doublequotes        ";
        System.out.println("original string- "+"'"+ s+ "'");
        System.out.println("after trimming whitespaces- "+ "'" + s.trim()+ "'");



    }
}
