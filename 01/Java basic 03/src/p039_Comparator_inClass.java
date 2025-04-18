import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Car5 implements Comparator<Car5> {
    String carName;
    String carType;
  // default Constructor
    Car5() {
    }
   // parameterized constructor
    Car5(String carName,String carType) {
            this.carName = carName;
            this.carType = carType;
        }
        @Override
        public int compare (Car5 o1, Car5 o2){
            return o1.carType.compareTo(o2.carType);
        }

}

// Main Class
public class p039_Comparator_inClass {
    public static void main(String[] args){
        List <Car5> li = new ArrayList<>();
        li.add(new Car5("Suv", " petrol"));
        li.add(new Car5("sedan", "diesel" ));
        li.add(new Car5("HatchBack", " cng"));
     // pass parameterised constructor
        Collections.sort(li, new Car5());

        li.forEach(ob -> System.out.print("   " +ob.carName + "-" + ob.carType  ));

    }
}
