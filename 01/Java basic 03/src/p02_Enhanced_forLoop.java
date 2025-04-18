 import java.util.Arrays;
import java.util.List;

public class p02_Enhanced_forLoop {
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(1,2,3,5,8,9,6,7,5,9,7);
        int sum = 0;
        for(int i : arr)   {
            if(i % 2 == 0){
                i = i *2;
                sum = sum + i;
            }
        }
        // Print the original list (it remains unchanged)
        System.out.print(arr);
        System.out.println("\n Sum of even numbers its double " + sum);
    }
}
