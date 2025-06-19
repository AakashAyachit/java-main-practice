package Basics;

public class AbsoluteValue {

    public static int Abs(int n){

        if(n>0){
            return n;
        }
        else{
            return -n;
        }
    }

    public static void main(String[] args){

        System.out.println(Abs(10));
        System.out.println(Abs(-55));
    }

}
