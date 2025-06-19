package Basics;

public class findArea {
    public static void ArPer(int l, int b){

        int ar = l * b;
        int peri = 2*(l+b);
        System.out.println("area is "+ar);
        System.out.println("peri is "+ peri);
    }

    public static void ArPerTriangle(int l, int b){
        int Tri = (l*b)/2;
        System.out.println("area of triangle " + Tri);
    }

    public static void main(String[] args){
        ArPer(2,3);
        ArPerTriangle(2,3);

    }
}
