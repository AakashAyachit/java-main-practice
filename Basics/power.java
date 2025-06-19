package Basics;

public class power {

    public static int ToPower(int n1, int n2){

        int result = 1;
        for(int i = 0; i < n2; i++){
            result *= n1;
        }
        return result;
    }
    public static void main(String[] args){

        System.out.println(ToPower(2,3));

    }
}
