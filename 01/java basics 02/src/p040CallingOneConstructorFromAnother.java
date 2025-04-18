class Car4{
    String model;
    int year;

    //Default Constructor
    Car4 () {
        this("Unknown",0 ); // Calls Another Constructor
    }

    //Parameterized Constructor
    Car4 (String model, int year ){
        this.model = model;
        this.year = year;
    }

    void disply(){
        System.out.println("Model: " + model + " , Year : " + year);
    }
}

// Main class
public class p040CallingOneConstructorFromAnother {
    public static void main(String[] args){
        Car4 c1= new Car4(); // Calls Default Constructor
        Car4 c2= new Car4("Toyota", 2022);

        c1.disply();
        c2.disply();
    }
}
