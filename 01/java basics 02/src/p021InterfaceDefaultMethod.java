interface Phone {
    default void batteryStatus(){
        System.out.println("Battery is 80% ");
    }
}
class Smartphone implements Phone{
    public void call(){
        System.out.println("Calling from SmartPhone");
    }
}

// Main class
public class p021InterfaceDefaultMethod {
    public static void main(String[] args){
        Smartphone sm = new Smartphone();
        sm.call();
        sm.batteryStatus();
    }
}
