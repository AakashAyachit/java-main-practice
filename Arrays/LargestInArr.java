package Arrays;

public class LargestInArr {

    public static void main(String[] args){
        int[] arrnos = {1,23,432,33,343434};
        int large = arrnos[0];

        int n = arrnos.length;

        for( int i =0; i<n;i++){
            if(arrnos[i]>large){
                large = arrnos[i];
            }

        }
        System.out.println("largest no is "+ large );
    }
}
