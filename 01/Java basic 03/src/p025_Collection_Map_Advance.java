import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class p025_Collection_Map_Advance {
    public static void main(String[] args ){
        Map <Integer , String > m = new HashMap<>();
        m.put(1,"Red");
        m.put(2,"Blue");
        m.put(3,"Green");

        //Iterating over Keys
        Iterator <Integer> kit = m.keySet().iterator()  ;
        System.out.println("Keys: ");
        while(kit.hasNext())    {
            System.out.print(" " + kit.next());
        }

        // Iterating Over Values
        Iterator<String> sit= m.values().iterator();
        System.out.println("\n Values: ");
        while (sit.hasNext()){
            System.out.print(" " + sit.next());
        }

        // Iterating over Key-Value pair
        Iterator<Map.Entry<Integer, String>> em = m.entrySet().iterator();
        System.out.println("\n Key-Value pair : ");
        while(em.hasNext()){
            Map.Entry<Integer,String >  en = em.next();
            System.out.print("Keys: "  + en.getKey() +  " Values: " + en.getValue()  );
        }


    }
}
