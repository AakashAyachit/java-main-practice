package Basics;

public class squarecube {

    public static int sq(int n){
        return n*n;

    }

    public static int cube(int n){
        return n*n*n;
    }
    public static void main(String[] args){

        int result = sq(5);
        System.out.println(result);

        int result2 = cube(4);
        System.out.println(result2);
    }
}
