import java.util.function.Function;

public class p085LambdaFunctional {
    public static void main(String[] args){
       // Functional Interface <T,R>
        Function <Integer,Integer> sq =  x -> x*x ;

        System.out.print("Square of 5: " + sq.apply(5));
    }
}
