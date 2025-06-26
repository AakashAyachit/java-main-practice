package OOP;

abstract class Shape{           //used to set the blueprint

    abstract public double area();
    abstract public double perimeter();
}

class Circle extends Shape{     //must override all methods of abstract class in sub class

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }
}

class AbstractRectangle extends Shape{

    double length, breadth;

    AbstractRectangle(double l,double b){
        length = l;
        breadth = b;
    }

    @Override
    public double perimeter(){
        return (length+breadth)*2;
    }

    @Override
    public double area() {
        return length*breadth;
    }
}

public class AbstractClass {

    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new AbstractRectangle(10,3);

        System.out.println(s1.area());
        System.out.println(s1.perimeter());

        System.out.println(s2.area());
        System.out.println(s2.perimeter());

    }
}
