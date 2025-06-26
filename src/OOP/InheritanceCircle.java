package OOP;

public class InheritanceCircle {

    public double radius;

    public double area(){
        return radius*radius*Math.PI;
    }

    public double circumference(){
        return 2*radius*Math.PI;
    }
}

class Cylinder extends InheritanceCircle{

    public double height;

    public double volume(){
        return area()*height;
    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.height=5;
        c.radius=7;
        System.out.println(c.area());
        System.out.println(c.volume());
        System.out.println(c.circumference());


    }
}
