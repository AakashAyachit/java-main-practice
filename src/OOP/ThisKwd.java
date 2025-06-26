package OOP;

//this is a special keyword in Java that refers to the current object — the object that is calling the method or using the variable.
//
//You mostly use this when your method or constructor parameters have the same name as instance variables.

class Rectangle{
    int length,breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void showlb(){
        System.out.println(this.length);
        System.out.println(this.breadth);
    }
}

public class ThisKwd {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5,7);
        r1.showlb();

        Rectangle r2 = new Rectangle(20,30);
        r2.showlb();
    }
}
