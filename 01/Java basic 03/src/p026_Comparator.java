import java.util.Arrays;

public class p026_Comparator {
    public static void main(String[] args ) {
        Integer [] a = {3,5,2,6,1};
        Arrays.sort(a, (val1, val2) -> val1 - val2);
        for(int v : a ) {
            System.out.print(" " + v);
        }
    }
}
