package Basics;
//for - You know the exact number of iterations.	No guarantee of execution (if condition is false initially)
//while - You don’t know how many times it will run.	No guarantee of execution (if condition is false initially)
//do-while - You need to run the code at least once.	Yes guarantee of execution (runs at least once)



public class LoopBasics {

    public static void main(String[] args){

        for(int i = 1; i<=15;i++){
            System.out.println(i);
        }

        for(int a = 10; a>=0; a--){
            System.out.println(a);
        }

        int x = 7;
        while(x<=15){
            System.out.println(x);
//            x++;
             x+=3;
        }

        int y = 5;
        System.out.println("this is table of 5");
        while(y<=50){

            System.out.println(y);
            y+=5;
        }

        int n=7;
        for(int m = 1; m<=10; m++){
            System.out.println(n + "x" + m + "=" + (n*m));
        }

        int b = 10;
        do{
            System.out.println(b);
            b++;
        } while (b<=15);

        int c = 10;
        do{
            System.out.println(c);
            c++;
        } while (c>=50);
    }
}
