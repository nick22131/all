@FunctionalInterface
interface Greeting1{
    void sayHello();
}
// Main class
public class p081LambdaNoParameter {
    public static void main(String[] args){
        Greeting1 gree = () -> System.out.print("Hello Lambda");
        gree.sayHello();
    }
}
