import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car4{
    String carName;
    String carType;
    Car4(String carName, String carType){
        this.carName = carName;
        this.carType = carType;
    }
    
   @Override
   public String toString(){
        return carName + " : " + carType;
   }
}


// Main class
public class p038_Comparator_CollectionExample {
    public static void main (String[] args){
        List <Car4> li = new ArrayList<>();
        li.add(new Car4("suv", "petrol"));
        li.add(new Car4("sedan", " diesel"));
        li.add(new Car4(" Hatchback", " cng"));

        Collections.sort(li, (Car4 o1, Car4 o2) -> o1.carName.compareTo(o2.carName) );


        // printing using Enhanced For Loop when Overriding of a toString is not present
        for(Car4 c : li){
            System.out.print("  " + c.carName + " $ " + c.carType)  ;
        }
        System.out.print("\n");
        //Printing when Overriding is Provided
        for(Car4 c: li ){
            System.out.print("  " + c);
        }
        System.out.print("\n");

        // Printing with forEach and Lambda Expression
        li.forEach((Car4 obj) -> System.out.print("   " + obj.carName + " ^ " + obj.carType));
    }
}
