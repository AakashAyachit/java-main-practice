package OOP;

public class Calculator {
    public double add(double num1, double num2){
        return num1+num2;
    }

    public double subtract(double num1, double num2){
        return num1-num2;
    }

    public double multiply(double num1, double num2){
        return num1*num2;
    }

    public double divide(double num1, double num2){
        if(num2 == 0){
            System.out.println("cant divide by 0");
            return 0;

        }
        else{
            return num1/num2;
        }

    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(1,232));
        System.out.println(calc.subtract(1,20));
        System.out.println(calc.multiply(3,9));
        System.out.println(calc.divide(3,0));
        System.out.println(calc.divide(30,10));
    }

}
