@FunctionalInterface
interface MyFunctionalInterface{
   //only single abstract method is allowed
    void disply();

    // any default method is allowed
    default void show() {
        System.out.print("Default method in Functional Interface");
    }
    // any stastic method is allowed
    static void printl(){
            System.out.print("Static method in Functional Interface");
        }

}

// Main method
public class p070FunctionalInterfaceExample {
    public static void main(String[] args){
     //Using Lambda Expression
        MyFunctionalInterface obj = () -> System.out.print("Lambda Function Executed.");
        obj.disply();
    }
}
