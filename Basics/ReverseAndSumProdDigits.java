package Basics;

public class ReverseAndSumProdDigits {

    public static void main(String[] args){
        int num1 = 1234;
        int reversed = 0;

        while(num1>0){
            int last = num1%10;
            reversed = reversed * 10 + last;
            num1 /= 10;
        }

        System.out.println("reversed no= " + reversed);

        int n = 5678;
        int sum = 0;
        int prod = 1;

        while(n>0){
            int lastdig = n%10;
            sum += lastdig;
            prod *= lastdig;
            n /= 10;
        }
        System.out.println(sum);
        System.out.println(prod);

        int num = 456;
            
    }



}
