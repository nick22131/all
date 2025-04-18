import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class p023_Collection_Map_EntrySet_Iterator {
    public static void main(String[] args){
        Map <Integer, String> m = new HashMap<>();
        m.put(1,"Red");
        m.put(2,"Blue");
        m.put(3,"Green");

        //Get an Iterator for Entry Set
        Iterator <Map.Entry<Integer, String > > it = m.entrySet().iterator()    ;

        //Iterating over key-value pair
        System.out.print("Key-Value pair: ");
        while(it.hasNext()){
            Map.Entry<Integer, String> en = it.next();
            Integer key = en.getKey();
            String val  = en.getValue();
            System.out.println("Key: "  + key + ", Values: " + val);
        }
    }
}
