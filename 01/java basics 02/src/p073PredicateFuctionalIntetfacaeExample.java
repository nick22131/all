import java.util.function.Predicate;

public class p073PredicateFuctionalIntetfacaeExample {
    public static void main(String[] main){
        Predicate <Integer> isEven = num -> num % 2 == 0 ;
        System.out.print(" is 10 even ? " + isEven.test(10));
    }
}
