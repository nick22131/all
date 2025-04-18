class Car3{
    String model;
    int year;;


    // parameterized constructor
     Car3(String model, int year){
        this.model = model;
        this.year = year;
    }
    void disply(){
         System.out.println("Model: " + model + ", Year : " + year);

    }
}

//Main class
public class p37ParamaterizedConstructor {
    public static void main(String[] args){
          Car3 car = new Car3("Toyota" , 2022);
          car.disply();
    }
}
