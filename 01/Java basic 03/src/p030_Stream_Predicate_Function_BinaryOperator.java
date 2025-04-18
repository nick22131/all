import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class p030_Stream_Predicate_Function_BinaryOperator {
    public static void main(String[] args){
        List<Integer> li = Arrays.asList(4,6,6,2,5,1,6,7,8,9,6);
        Predicate<Integer> filter= n -> n % 2 == 0;
        Function <Integer,Integer> map = n -> n*2;
        BinaryOperator <Integer> reduce = (a,b) -> a+b;

        int result = li.stream()
                       .filter(filter)
                        .map(map)
                         .reduce(0,reduce);

        System.out.print(result);
    }
}
