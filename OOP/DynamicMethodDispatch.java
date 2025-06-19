package OOP;

class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog1 extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat1 extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatch {    //  AKA RUNTIME POLYMORPHISM
    public static void main(String[] args) {


        Animal d = new Dog1();  // reference is Animal, object is Dog
        d.makeSound();  // Output: Dog barks

        Animal c = new Cat1();  // reference is Animal, object is Cat
        c.makeSound();  // Output: Cat meows
    }

}
