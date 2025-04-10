class Car {
    String model;
    int year;
    String color;
    int speed = 0;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void accelerate() {
        this.speed += 10;
        System.out.println("Accelerating. Current Speed : " + this.speed);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota Camry", 2023, "Red");
        Car yourCar = new Car("Honda Civic", 2022, "Blue");
        System.out.println("My car model: " + myCar.model);
        System.out.println("Your car model: " + yourCar.model);
        myCar.accelerate();
        yourCar.accelerate();
        System.out.println("My car speed : " + myCar.speed);
        System.out.println("Your car speed : " + yourCar.speed);
    }
}