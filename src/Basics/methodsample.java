package Basics;

public class methodsample {

    static int max(int x, int y){
        if(x>y)
            return x;
        else
            return y;
    }

    public static void main(String args[]) {

        int a = 10, b = 2, c;
        c = max(a, b);
        System.out.println(c);
    }

}
