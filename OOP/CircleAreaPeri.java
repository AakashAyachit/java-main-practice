package OOP;

import java.util.Scanner;

public class CircleAreaPeri {

            static class Circle {

            int radius;

            public double area() {
                return Math.PI * radius * radius;

            }

            public double circumference() {
                return 2 * Math.PI * radius;
            }

            public double perimeter() {
                return circumference();
            }


        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle c1= new Circle();
        System.out.println("enter radius");

        c1.radius = sc.nextInt();
        System.out.println(c1.area());
        System.out.println(c1.perimeter());

        Circle c2 = new Circle();
        c2.radius = 21;
        System.out.println("area of c2 is " + c2.area() + " perimeter is " + c2.perimeter());

    }


}

