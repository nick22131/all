import java.util.HashMap;
import java.util.Map;

public class p055GetMethodHashMap {
    public static void main(String[] args){
        Map <String, Integer> m = new HashMap<>();
        m.put("Alice" , 45);
        m.put("Bob" , 32);
        System.out.println(m.get("Alice"));
        System.out.println(m.get("Charlie")); // If key is not present get() gives null key which you can set
    }
}
