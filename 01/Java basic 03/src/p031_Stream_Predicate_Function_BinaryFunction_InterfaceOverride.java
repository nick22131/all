import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class p031_Stream_Predicate_Function_BinaryFunction_InterfaceOverride {
    public static void main(String[] args){
        List <Integer> li = Arrays.asList(4,3,54,2,4,2,1,6,3,3,5,6);

        Predicate <Integer> predicate = new Predicate<>(){
            @Override
            public boolean test(Integer n){
                return n %2 == 0;
            }
        };

        Function <Integer,Integer> function = new Function<>(){
            @Override
            public Integer apply (Integer n) {
                return n * 2;
            }
        };

        BinaryOperator <Integer> bo= new BinaryOperator <> (){
            @Override
            public Integer apply (Integer c , Integer e ){
                return c + e;
            }
        };

        int result = li.stream()
                .filter(predicate)
                .map(function)
                .reduce(0 ,bo );

        System.out.print(result);
    }
}
