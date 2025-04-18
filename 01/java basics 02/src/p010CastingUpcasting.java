class Animal{
    void eat(){
        System.out.print("Animal is eating ");
    }
}


class Dog extends Animal{
    void bark (){
    System.out.print("Dog is Barking ");
    }
}

public class p010CastingUpcasting {
    public static void main(String[] args){
      Animal ani = new Dog ();
       ani.eat();
        // myAnimal.bark(); // Invalid: Cannot access subclass-specific methods
    }

}
