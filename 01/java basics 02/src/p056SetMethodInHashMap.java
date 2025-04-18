import java.util.HashMap;
import java.util.Map;

public class p056SetMethodInHashMap {
    public static void main(String[ ] args){
        Map <String,Integer> m = new HashMap<>();
        m.put("Alice", 76);
        m.put("Bob", 87);

        //Updating Bob's score
        m.put("Bob", 9);
        System.out.print(m);

    }
}
