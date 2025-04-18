import java.util.HashMap;
import java.util.Map;

public class p060HashMapIterationEntrySet {
    public static void main(String[] args){
        Map <Integer,String> m = new HashMap<>();
        m.put(101 , "Alice");
        m.put(102, "Bob");
        // Iterating Using EntrySet()
        for(Map.Entry<Integer,String> en : m.entrySet())
        {
            System.out.println(en.getKey() + " = " + en.getValue());
        }
    }
}
