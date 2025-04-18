interface Animal4{
    void makeSound();
}
class Dog4 implements Animal4 {
    public void makeSound(){
        System.out.print("Dog is barking");
    }
}


public class p019InterfaceBasicExample {
    public static void main(String[] args){
       Animal4 dog = new Dog4();
       dog.makeSound();
    }
}
