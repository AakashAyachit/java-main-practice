package Basics;
import java.util.Scanner;

public class reverseNumAndShowInWords {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        String rev= "";
        int last;

        while(n>0){
            last = n%10;
            n=n/10;
            rev = rev + last;

        }
        System.out.println(rev);

        char c;
        for(int i = rev.length()-1;i>=0;i--){
            c = rev.charAt(i);
            switch (c){

                case '0': System.out.println("zero");
                break;
                case '1': System.out.println("one");
                    break;
                case '2': System.out.println("two");
                    break;
                case '3': System.out.println("three");
                    break;
                case '4': System.out.println("four");
                    break;
                case '5': System.out.println("five");
                    break;
                case '6': System.out.println("six");
                    break;
                case '7': System.out.println("seven");
                    break;
                case '8': System.out.println("eight");
                    break;
                case '9': System.out.println("nine");
                    break;
            }
        }
    }
}
