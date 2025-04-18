class person{
    String name;
    void greet(){
        System.out.println("Hello my name is "  + name );
    }
    
}

public class p031InstanceVariableMethod {
    public static void main(String[ ] args){
     person p1 = new person();
     p1.name = "Alice";
     p1.greet();
    }
}
