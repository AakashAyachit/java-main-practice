package Basics;

public class LoopPatternsStars {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++){
            for (int j = 1; j<=i; j++){

                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i <=5; i++){
            for (int j = 1; j<=5-i+1; j++){

                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i <=5; i++){
            for (int j = 1; j<=5; j++){
                if (i<=j)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println("");
            }

        System.out.println("");
        for (int i = 1; i <=5; i++){
            for (int j = 1; j<=5; j++){
                if (j<=i)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 1; i <=5; i++){
            for (int j = 1; j<=5; j++){
                if (i+j > 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i <=5; i++){
            for (int j = 1; j<=5; j++){
                if (i+j > 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();






    }}
}
