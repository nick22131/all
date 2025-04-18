import java.util.function.Supplier;

public class p072SupplierFunctionalInterfaceExample {
    public static void main(String[] args){
        Supplier <Double> randomSupplier = () -> Math.random();
        System.out.print("Random number: " + randomSupplier.get() );
    }
}
