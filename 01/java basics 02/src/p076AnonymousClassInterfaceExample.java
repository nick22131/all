interface Greeting{
    void sayHello();
}

//Main class
public class p076AnonymousClassInterfaceExample {
    public static void main(String[] args){
        //Implementing interface Using Anonymous class
        Greeting gree = new Greeting(){
            @Override
            public void sayHello(){
                System.out.print("Hello from Anonymous Class");
            }
        };
        gree.sayHello();

    }
}
