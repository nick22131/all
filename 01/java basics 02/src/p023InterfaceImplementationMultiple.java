interface A {
    void methodA();
}
interface B {
    void methodB();
}
 class C implements A,B {
    public void methodA(){
        System.out.println("Method A from Interface A");
    }
    public void methodB(){
        System.out.println("method B from Interface B");
    }

 }

// Main class
public class p023InterfaceImplementationMultiple {
    public static void main(String[] args){
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
