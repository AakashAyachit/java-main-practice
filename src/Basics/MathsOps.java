package Basics;

public class MathsOps {

    public static int sum(int num1,int num2){

        return num1 + num2;
    }

    public static int diff(int num1, int num2){
        return num1-num2;
    }

    public static int product(int num1, int num2){
        return  num1*num2;
    }

    public static float div(float num1, float num2){
        return num1/num2;
    }

    public static void main(String[] args){

        int result = MathsOps.sum(20,30);
        System.out.println("sum is "+ result);

        int result2 = MathsOps.sum(30,45);
        System.out.println(result2);

        int diffresult = MathsOps.diff(30,15);
        System.out.println(diffresult);

        int prodresult = MathsOps.product(3,9);
        System.out.println(prodresult);

        float divresult = MathsOps.div(10,50);
        System.out.println(divresult);
    }
}
