import java.util.HashMap;
import java.util.Map;

public class p058IteratingforEach {
    public static void main(String[] args){
        Map <Integer,String> m = new HashMap<>();
        m.put(1 , "A");
        m.put(2,"B");
        m.put(3,"C");

        m.forEach((key,value ) -> System.out.println(key + " = " + value ));
    }
}
