abstract class Animal6{
    abstract void makeSound();
}
// Main class
public class p075AnonymousClassExtendingAClass {
    public static void main(String[] args){
        // Creating Anonymous subclass of Animal6

        Animal6 cat = new Animal6(){
            @Override
            void makeSound(){
                System.out.print("Meow meow");
            }

        };
        cat.makeSound();
    }
}
