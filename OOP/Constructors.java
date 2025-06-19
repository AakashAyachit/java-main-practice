package OOP;
//A constructor is a special method that runs automatically when an object is created.
// Same name as the class.
//To initialize (set up) the values of object properties (also called fields or attributes).
//No return type (not even void).
//Every class has a constructor, either default (built-in) or custom (you define it)
//Can take parameters.
public class Constructors {

    private int length;
    private int breadth;

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return (length+breadth)*2;
    }

    public Constructors(){
        length =1;
        breadth=1;
    }

    public Constructors(int l, int b){
        length = l;
        breadth = b;
    }

    public Constructors(int squareSide){
        length = breadth = squareSide;
    }

    public static void main(String[] args) {

        Constructors r1 = new Constructors();
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        Constructors r2 = new Constructors(10,5);
        System.out.println(r2.area());
        System.out.println(r2.perimeter());

        Constructors sq1 = new Constructors(4);
        System.out.println(sq1.area());
        System.out.println(sq1.perimeter());

    }

}
