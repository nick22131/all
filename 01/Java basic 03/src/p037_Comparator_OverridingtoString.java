import java.util.Arrays;

class Car3{
    String cName;
    String cType;
    Car3(String cName, String cType){
        this.cName = cName;
        this.cType = cType;
    }
    @Override
    public String toString(){
        return cName + " : " + cType;
    }
}
//Main Class
public class p037_Comparator_OverridingtoString {
    public static void main(String [] args){
   Car3[] arr = new Car3[3];
   arr [0] = new Car3("suv", "petrol");
   arr [1] = new Car3("sedan", " diesel");
   arr[2]  = new Car3("Hatchback", "cng");

    // Array in Descending Order

        Arrays.sort(arr, (Car3 o1 , Car3 o2) -> o2.cType.compareTo(o1.cType));

        //when we Override toString()
        for(Car3 c : arr){
            System.out.print(" " + c);
        }
        System.out.print("\n");
        //when we dont provide Override Of toString()
        for(Car3 a : arr){
            System.out.print("  " + a.cName + " $ "+ a.cType);
        }
        System.out.print("\n");
    // Array in Ascending order
        Arrays.sort(arr, (Car3 o1, Car3 o2) -> o1.cType.compareTo(o2.cType));

     for(Car3 a: arr ){
         System.out.print("   "  + a  ) ;
     }

    }
}
