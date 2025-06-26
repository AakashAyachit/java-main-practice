package Basics;

public class armstrong {

    public static boolean isArm(int num){
        int Ognum = num;
        int sum = 0;

        while(num !=0){
            int last = num % 10;
            sum += last*last*last;
            num/=10;

        }

        return sum == Ognum;

    }

    public static void main(String[] args){
        int n1 = 153;

        if(isArm(n1)){
            System.out.println(n1+" is an armstrong number");


        }
        else{
            System.out.println(n1+" is not an armstrong number");
        }
    }
}
