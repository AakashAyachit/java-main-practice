package Basics;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks of 3 subjects ");

        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();

        float avg = (float)(sub1+sub2+sub3)/3;

        if(avg>=80){
            System.out.println("grade A");
        }

        else if (avg>=60 && avg<70){
            System.out.println("grade B");
        }

        else if (avg>=40 && avg<60){
            System.out.println("grade C");
        }
        else{
            System.out.println("fail");
        }

    }
}
