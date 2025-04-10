@FunctionalInterface
interface  Greet{
    void sayHello();
}
 class MethodReferenceExample{
    static void greetMessage(){
        System.out.print("Hello, Method Reference");
    }
}



//Main class
public class p074MethodRefernceINFuctionalInterface {

    public static void main(String[] args){
   // Using Method Reference
        Greet gree = MethodReferenceExample :: greetMessage;
        gree.sayHello();
    }

}
