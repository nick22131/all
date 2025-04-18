import java.util.HashMap;
import java.util.Map;

public class p059HashMapIterationkeySet {
    public static void main(String[] args){
        Map <String, Integer> m = new HashMap<>();
        m.put("Alice" , 23);
        m.put("Bob", 34);
        // Iterating using keySet()
        for(String k : m.keySet()){
            System.out.println(k + " = " +  m.get(k));
        }
    }
}
