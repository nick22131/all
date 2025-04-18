import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class p061HashMapIterationIterator {
    public static void main(String[] args){
        Map <String , Integer> m = new HashMap<>();
        m.put("One" , 1);
        m.put("Two", 2);
        m.put("Three", 3);
        // Iterating Using Iterator with EntrySet

        Iterator<Map.Entry<String, Integer>> ite= m.entrySet().iterator();
        while(ite.hasNext()){
            Map.Entry<String,Integer> en = ite.next();
            System.out.println(en.getKey() + " = " + en.getValue());
        }
    }
}
