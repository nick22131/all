import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class p022_Collection_Map_EntrySet {
    public static void main(String[] args){
        Map<Integer, String >   m = new HashMap<>();
        m.put(1, "Red" );
        m.put(2,"Blue");
        m.put(3,"Green");

        // Get an Entry set(set of key-value pair)
        Set <Map.Entry<Integer, String > > e = m.entrySet();

        //Print Entry Set
        System.out.print("Entry Set :");
        for(Map.Entry<Integer, String> en : e){
            System.out.print(" " + en);
        }
    }
}
