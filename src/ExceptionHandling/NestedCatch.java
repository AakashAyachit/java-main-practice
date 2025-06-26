package ExceptionHandling;

public class NestedCatch {
    public static void main(String[] args) {

        int[] arr1 = {0,1,2,3,4,5,6};

        try {
            int c = arr1[4] / arr1[0];
            System.out.println(c);

            try {

                System.out.println(arr1[8]);//WILL NOT EXECUTE IF ONE EXCEPTION ALREADY DONE
            }
            catch (ArrayIndexOutOfBoundsException o){
                System.out.println("no array element in 8th pos");
                System.out.println(o);
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }


        System.out.println(arr1[3]);

    }
}
