import java.util.Arrays;

class Car implements Comparable<Car>{
    String carName;
    String carType;
    Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }
    @Override
    public int compareTo(Car ob ){
        return this.carName.compareTo(ob.carName);
    }

    @Override
    public String toString(){
        return carName + "(" + carType + ")";
    }
}

// Main Class
public class p032_Comparable_Of_Object {
    public static void main(String[] args){
        Car[ ] arr = new Car[3];
        arr[0] = new Car("Suv", " petrol");
        arr[1] = new Car("sedan", "diesel");
        arr[2] = new Car("Hatchback", "cng");


        Arrays.sort(arr);

        for(Car c : arr){
            System.out.print("  " +c );
        }
    }
}
