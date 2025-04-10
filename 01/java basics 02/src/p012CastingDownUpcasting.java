class Animal2 {
    void eat(){
        System.out.println("Animal is Eating ");
    }
}
class Dog2 extends Animal2 {
    void bark(){
        System.out.println("Dog is barking");
    }
}


public class p012CastingDownUpcasting {
    public static void main(String[] args){

        // Upcasting
        Animal2 ani = new Dog2();
        ani.eat();

        // Downcasting
        if (ani instanceof Dog2) {
            Dog2 dog = (Dog2) ani;
            dog.bark();
         }
    }
}
