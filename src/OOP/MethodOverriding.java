package OOP;

class Super{
    public void display(){
        System.out.println("super class");
    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("sub class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Super sp = new Super();
        sp.display();

        System.out.println(" ");

        Sub sb = new Sub();
        sb.display();

        System.out.println(" ");

        // CREATED OBJECT OF SUB CLASS WITH REFERENCE TO SUPER CLASS. METHOD OF OBJECT WILL BE CALLED || called DYNAMIC METHOD DISPATCH
        Super s = new Sub();
        s.display();

    }

}
