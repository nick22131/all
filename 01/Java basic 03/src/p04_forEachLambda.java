import java.util.Arrays;
import java.util.List;

public class p04_forEachLambda {
    public static void main(String[] args){
        List<Integer> lis = Arrays.asList(1,2,8,7,9);
        lis.forEach(n -> System.out.print(" " + n));
    }
}
