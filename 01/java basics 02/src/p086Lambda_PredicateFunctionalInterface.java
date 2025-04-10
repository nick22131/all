import java.util.function.Predicate;

public class p086Lambda_PredicateFunctionalInterface {
    public static void main(String[] args){
        // Predicate Functional interface
        Predicate <Integer> isEven = num -> num % 2 == 0;


        System.out.print("is 10 even? "  + isEven.test(10));
    }
}
