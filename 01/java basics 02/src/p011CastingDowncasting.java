class Animal1{
    void eat(){
         System.out.print("Animal is eating");
    }
}
class Dog1 extends Animal1{
    void bark (){
        System.out.print("dog is barking");
    }
}


public class p011CastingDowncasting {
    public static void main(String[] args ){
        Animal1 ani = new Dog1();
        if(ani instanceof Dog1){
            Dog1 dog = (Dog1) ani;
            dog.eat();
            System.out.println("\n");
            dog.bark();
        }
        else{
            System.out.print(" ani is't instance of dog ");
        }
     
    }
}
