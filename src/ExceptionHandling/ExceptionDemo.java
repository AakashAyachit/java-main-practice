package ExceptionHandling;


import java.util.Scanner;

public class ExceptionDemo {

    static int meth1(){
        return 10/0;
    }

    static void meth2(){
        meth1();
    }
    static void meth3(){
        try {
            meth2();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a");
//        int a = sc.nextInt();
//        System.out.println("enter b");
//        int b = sc.nextInt();
        try {
            int a=10,b=0;
            int c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println("error, cant divide by 0");
            System.out.println(e);
        }

        System.out.println("hello");

        meth3();






    }
}
