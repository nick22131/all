abstract class Animal5{
    //Abstract Class
    abstract void makeSound();

    //Concrete Method
     void sleep(){
         System.out.println("sleep");
     }
}
class Dog5 extends Animal5{
    void makeSound(){
        System.out.println("Bark Bark!");
    }

}
   //Main Class
public class p042AbstractClassExample {
    public static void main(String[] args){
    Dog5 dog = new Dog5();
    dog.makeSound();
    dog.sleep();
    }
}
