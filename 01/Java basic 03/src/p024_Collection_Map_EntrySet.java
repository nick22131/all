import java.util.HashMap;
import java.util.Map;

public class p024_Collection_Map_EntrySet {
    public static void main(String[] args){
        //Create  a Map
        Map <Integer, String > m = new HashMap<>();
        m.put(1,"Red");
        m.put(2,"Blue");
        m.put(3,"Green");

        //Iterating Over Keys
        System.out.println("Keys: ");
        for(Integer k : m.keySet()){
            System.out.print(" " + k);
        }
        // Iterating over Values
        System.out.println("\n Values: ");
        for(String val :m.values()){
            System.out.print(" " + val);
        }
        //Iterating over key-value pair
        System.out.print("\n key-value pair: ");
        for(Map.Entry<Integer,String> en : m.entrySet()){
            System.out.println("Key: " + en.getKey() + "  Values: " + en.getValue() );

        }
    }
}
