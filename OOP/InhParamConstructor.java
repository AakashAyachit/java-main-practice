package OOP;

class Parent {

    Parent(){
        System.out.println("non param of parent");
    }

    Parent(int x){
        System.out.println("param of parent "+x);
    }

}

class Child extends Parent{

    Child(){
        System.out.println("non param of child");
    }

    Child(int y){
        System.out.println("param of child "+y);
    }

//  call parent/super class constructor using kwd super(), must be in 1st line

    Child(int x, int y){
        super(x);
        System.out.println("child param "+y);
    }
}

public class InhParamConstructor{
    public static void main(String[] args) {

        Child c = new Child();
        System.out.println(" ");
        Child c2 = new Child(20);
        System.out.println(" ");
        Child c3 = new Child(10,25);

    }

}
