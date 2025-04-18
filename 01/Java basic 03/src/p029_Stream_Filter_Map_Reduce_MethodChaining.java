import java.util.Arrays;
import java.util.List;

public class p029_Stream_Filter_Map_Reduce_MethodChaining {
    public static void main(String [] args) {
        List<Integer> li = Arrays.asList(3,5,2,1,5,6);
        int result = li.stream()
                        .filter(n-> n % 2 == 0)
                         .map(n-> n*2)
                         .reduce(0, (c,e)-> c+e);
        System.out.print(result);
    }
}
