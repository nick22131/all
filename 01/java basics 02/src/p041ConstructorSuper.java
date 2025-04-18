class Parents{
    Parents(){
      System.out.println("Parent Constructor called");
    }
}
class Child extends Parents{
    Child(){
        super();
        System.out.println("Child Constructor called");
    }
}

// Main class
public class p041ConstructorSuper {
    public static void main(String[] args){
        Child c = new Child();
    }
}
