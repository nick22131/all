@FunctionalInterface
interface Printer1{
    void print(String mess);
}
// Main class
public class p082LambdaWthOneParameter1 {
    public static void main(String[] args){
        Printer1 pri  = mess -> System.out.print("Message" + mess);

        pri.print("Lambda is Powerful");
    }
}
