abstract class Shape{
    String name;

    // Constructor
    Shape(String name){
        this.name = name ;
        System.out.println("Shape Constructor called" + name);
    }

    abstract void draw();
}
class Circle extends Shape{
    Circle(){
     super (" Circle");
    }

    void draw(){
        System.out.println("Drawing Circle...");
    }
}



public class p044AbstractClassWithConstructor {
    public static void main(String[] args){
        Circle c = new Circle();
        c.draw();
    }
}
