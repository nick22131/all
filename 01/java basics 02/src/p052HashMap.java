import java.util.HashMap;
import java.util.Map;

public class p052HashMap {
    public static void main(String[ ] args){
        Map <Integer,String> m = new HashMap<>();
        m.put(1,"Apple");
        m.put(2,"Banana");
        m.put(3,"Cherry");
        System.out.println(m.get(1));
        //Iterating over Key Value Pair
          for(Map.Entry<Integer,String> en : m.entrySet()){
              System.out.println(en.getKey() + " -> " + en.getValue() );
          }
    }
}
