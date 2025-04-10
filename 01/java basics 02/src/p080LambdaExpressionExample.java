@FunctionalInterface
interface MyInterface{
    void show(); // Single abstract method
}
// Main class
public class p080LambdaExpressionExample {
    public static void main(String[] args){
      //Lambda Implementation
        MyInterface obj = () -> System.out.print("Lambda Expression Executed");


        obj.show();

    }
}
