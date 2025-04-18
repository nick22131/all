import java.util.Arrays;
import java.util.Comparator;

class Car2{
    String cName;
    String cType;
    Car2(String cName, String cType){
        this.cName = cName;
        this.cType = cType;
    }

    @Override
    public String toString(){
        return cName + " : " + cType;
    }

}
//Custom Comparator Class
class CarComparator implements Comparator<Car2 >{
    @Override
    public int compare(Car2 o1 , Car2 o2){
        return o1.cType.compareTo(o2.cType) ;
    }
}
// Main class
public class p034_Comparator_CustomClass {
    public static void main(String[] args ) {
        Car2 [ ] arr = new Car2[3];
        arr[0] = new Car2("suv", " petrol");
        arr[1] = new Car2("sedan", " diesel");
        arr[2] = new Car2 (" hatchbace", "cng");
  Arrays.sort(arr,new CarComparator());
  for(Car2 c : arr){
      System.out.print("   " +c);
  }

    }
}
