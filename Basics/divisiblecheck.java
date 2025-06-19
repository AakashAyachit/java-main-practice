package Basics;

public class divisiblecheck {

    public static void check(int n1) {
        if (n1 % 5 == 0) {
            System.out.println(n1 + " is div by 5");
        }
        else {
            System.out.println(n1+ " is not div by 5");
        }

    }

    public static void checkboth(int n2){
        if(n2%6 == 0 && n2%11==0){
            System.out.println(n2 + " is div by both 6 and 11");
        }
        else{
            System.out.println(n2 + " not div by both");
        }
    }

    public static void main(String[] args){

        check(50);
        check(51);
        checkboth(66);
        checkboth(60);
    }
}
