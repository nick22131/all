import java.util.function.Consumer;

public class p072ConsumerFunctionalInterfaceExample {
    public static void main(String[] args){
        Consumer <String> printMessage = msg -> System.out.print("Message: " + msg  );
        printMessage.accept("Hello Functional Interface");

    }
}
