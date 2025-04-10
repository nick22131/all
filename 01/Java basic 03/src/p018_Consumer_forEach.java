import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class p018_Consumer_forEach {
    public static void main(String[] args){
        List <Integer> aa= Arrays.asList(5,676,7,8,4,3 );
        Consumer <Integer> co = new Consumer<>(){
           public void accept(Integer n){
              System.out.print(" " + n);
          }
        };

        Consumer<Integer> cl = (Integer c) -> System.out.print(" " + c);
       System.out.print("\n");
        aa.forEach(cl );

        System.out.print("\n");
        aa.forEach(co);

       System.out.print("\n");



        aa.forEach(n -> System.out.print(" " + n));

    }

}
