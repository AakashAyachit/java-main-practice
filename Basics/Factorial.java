package Basics;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter num whose factorial needed ");
        int n = sc.nextInt();

        int factorial = 1;

        for(int i =1; i<=n;i++ ){
            factorial = factorial * i;
        }
        System.out.println("factorial of "+ n +" is " + factorial);
    }
}
