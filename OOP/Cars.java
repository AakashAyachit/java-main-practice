package OOP;

public class Cars {

    String brand;
    String model;

    Cars(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    void displayCar(){
        System.out.println("brand is "+ brand);
        System.out.println("model is "+ model);
    }

    public static void main(String[] args) {

        Cars myCar = new Cars("kia","seltos");
        Cars myCar2 = new Cars("pia", "peltos");

        myCar.displayCar();
        myCar2.displayCar();
    }
}
