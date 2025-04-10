import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class p021_Collection_Map_ValusIterator {
    public static void main(String[] args ) {
        Map <Integer,String> hmp= new HashMap<>();
        hmp.put(1,"Red");
        hmp.put(2, "Blue");
        hmp.put(3,"Green")  ;

        // Get an Iterator for the values in the Map
        Iterator <String> it = hmp.values().iterator();

        //Iterating over Values
        System.out.print("Values in the map :");
        while(it.hasNext()){
            String value= it.next();
            System.out.print(" " + value);
        }
    }
}
