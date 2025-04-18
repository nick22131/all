import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] numbers = new int[5];
                // arrays are reference data type
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        int[] no= {2,3,4,5,6};
        Arrays.sort(no);
        System.out.println(Arrays.toString(no));
    }
}
