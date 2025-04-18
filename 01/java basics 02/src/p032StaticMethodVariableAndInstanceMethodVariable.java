class Example1{
    String instanceVar = "I am instance variable ";
    static String staticVar= "I am static variablr ";
    void instanceMethod(){
        System.out.println(instanceVar); // can access instance variable
        System.out.println(staticVar);  // can access static variable
    }
    static void staticMethod(){
        System.out.println(staticVar); // can access only static variable
       // System.out.println(instanceVar); // can't access instance variable

    }
}
// Main class
public class p032StaticMethodVariableAndInstanceMethodVariable {
    public static void main(String[] args){
    Example1 obj = new Example1();
    obj.instanceMethod();
    Example1.staticMethod(); // Calling static method Directly
    }
}
