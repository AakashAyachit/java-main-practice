package Basics;
import java.lang.reflect.Field;
import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of terms");
        int n = sc.nextInt();
        System.out.println("enter 1st no");
        int a = sc.nextInt();
        System.out.println("enter increment difference");
        int d = sc.nextInt();

        for (int i = 0; i<n;i++){
            int finalTerm = a + i * d;
            System.out.println(finalTerm);
        }
    }
}
