class Animal3{
    void makeSound(){
        System.out.println("Animal is making sound ");
    }
}
class Dog3 extends Animal3{
    @Override
    void makeSound(){
        System.out.println("Dog is Barking");
    }
}
class Cat extends Animal3{
    @Override
    void makeSound(){
        System.out.println("Meow");
    }

}

public class p014PolymorphismMethodOverriding {
    public static void main(String[] args){
        Animal3 ani;
        ani = new Dog3();  // Upcasting
        ani.makeSound();   // calls Dog's makeSound()


        ani = new Cat();  // Upcasting
        ani.makeSound();   // calls Cat's makeSound()
    }
}
