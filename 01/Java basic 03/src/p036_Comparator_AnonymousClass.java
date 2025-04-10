import java.util.Arrays;
import java.util.Comparator;

public class p036_Comparator_AnonymousClass {
    public static void main(String[] args){
      Integer [ ] arr = {3,6,73,2,1,8,5};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a1 , Integer a2 ) {
                return a1 - a2;
            }
        });
        for(int c : arr) {
            System.out.print(" " + arr);
        }
    }
}
