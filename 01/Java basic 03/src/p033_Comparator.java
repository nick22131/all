import java.util.Arrays;
import java.util.Comparator;

class Car1{
    String carName;
    String carType;
    Car1(String carName, String carType){
        this.carName= carName;
        this.carType= carType;
    }

    @Override
    public String toString (){
        return carName  + " - " + carType;
    }
}
//Main class
public class p033_Comparator {
    public static void main(String[] args){
        Car1[] arr = new Car1[3];
        arr[0] = new Car1("suv", " petrol");
        arr[1] = new Car1("sedan", "diesel");
        arr[2]= new Car1("Hatchback", " cng");

        //sorting
        Arrays.sort(arr, Comparator.comparing(car -> car.carType ));

        for(Car1 c : arr)   {
            System.out.print("  "+ c     );
        }
    }
}
