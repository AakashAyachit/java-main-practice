package OOP;

import java.util.Scanner;

public class RectangleArPer {

    public double length;
    public double breadth;

    public double area(){
        return length * breadth;
    }

    public double perimeter(){
        return (length + breadth)*2;
    }

    public boolean isSquare(){
        if (length==breadth){
            return true;
        }
        else
            return false;

    }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            RectangleArPer r1 = new RectangleArPer();

            System.out.println("enter l");
            r1.length  = sc.nextInt();
            System.out.println("enter b");
            r1.breadth = sc.nextInt();

            System.out.println(r1.area());
            System.out.println(r1.perimeter());
            System.out.println("is r1 a square? "+ r1.isSquare());


    }
}
