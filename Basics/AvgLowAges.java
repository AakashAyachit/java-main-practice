package Basics;

public class AvgLowAges {
    public static void main(String[] args){

        int[] ages = {10,13,15,53,43,23,65,2};
        float avg = 0;
        int sum = 0;
        int div = ages.length;

        for(int age : ages){
            sum += age;
        }

        avg = sum/div;
        System.out.println(avg);


        int lowestage = ages[0];
        for (int age : ages){
            if(lowestage>age){
                lowestage = age;
            }
        }
        System.out.println("lowest age is "+lowestage);
    }
}
