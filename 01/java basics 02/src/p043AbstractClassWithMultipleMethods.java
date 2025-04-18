abstract class Vehical1{
    abstract void start();
    void fuel() {
        System.out.println("Refueling.... ");
    }
}
class Car5 extends Vehical1{
    void start(){
        System.out.println(" Car is starting with a key");
    }
}
class Bike3 extends Vehical1{
    void start(){
        System.out.println("Bike start with a self start ..... ");
    }
}

// Main class
public class p043AbstractClassWithMultipleMethods {
    public static void main(String[] args){
        Car5 car = new Car5();
        Bike3 bike = new Bike3();

        car.start();
        bike.start();

        car.fuel();
        bike.fuel();
    }
}
