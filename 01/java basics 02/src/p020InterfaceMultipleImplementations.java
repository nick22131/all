interface Vehical{
    void start();
}
class Car implements Vehical{
    public void start(){
        System.out.print("Car is starting with key Ignition. ");
    }
}
class Bike implements Vehical{
    public void start(){
        System.out.println("\n Bike start with self start button ");
    }
}

public class p020InterfaceMultipleImplementations {
    public static void main(String[] args){
      Vehical car = new Car();
      Vehical bike= new Bike();

      car.start();
      bike.start();
    }
}
