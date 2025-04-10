import java.util.HashMap;
import java.util.Map;

public class p054HashMapExample {
    public static void main(String[] args){
        Map <Integer, String > m = new HashMap<>();
        m.put(1,"Apple");
        m.put(2,"Banana");
        m.put(1,"Cherry");
        System.out.print(m);

    }
}
