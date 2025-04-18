// keySet() getting all keys
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class p057keySet {
    public static void main(String[] args){
        Map <String , Integer> m = new HashMap<>();
        m.put("USA" ,1);
        m.put("India" ,2);
        m.put("Germany" ,3);

        //Getting all keys
        Set <String> k = m.keySet();
        System.out.println(k);
    }
}
