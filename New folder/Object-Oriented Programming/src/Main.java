class car {
    String color;
    int speed;
    void drive(){
        System.out.println(" car is driving" + color +" " + speed);
    }
}
public class Main {
    public static void main(String[] args) {
        car mycar = new car();
        mycar.color = "red";
        mycar.speed = 32;
        mycar.drive();
        

    }
}