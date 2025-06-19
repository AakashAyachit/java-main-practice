package Basics;

public class Leapyear {
    public static void IsLeap(int n){

        if((n%4==0 && n%100!=0) || (n%400==0)){
            System.out.println("Yes " + n +" is a leap year");
        }
        else{
            System.out.println("No " +n+ " is not a leap year");

        }
    }

    public static void main(String [] args){

        IsLeap(2024);
        IsLeap(2023);
        IsLeap(2012);
    }
}
