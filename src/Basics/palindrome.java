package Basics;

public class palindrome {
    public static boolean isPal(int num){
        int n = num;
        int rev = 0;
        while(n!=0){
            int last = n%10;
            rev = rev*10 + last;
            n/=10;
        }
        return rev == num;
    }
    public static void main(String[] args){
        int n1 = 123454321;
        if(isPal(n1)){
            System.out.println(n1+" is a Basics.palindrome number");
        }
        else{
            System.out.println(n1+" is not a Basics.palindrome number");
        }


    }
}
