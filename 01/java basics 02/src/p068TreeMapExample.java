import java.util.TreeMap;

public class p068TreeMapExample {
    public static void main(String[] args){
        TreeMap <Integer,String> m = new TreeMap<>();
        m.put(3,"Apple");
        m.put(1,"Banana");
        m.put(2,"Cherry");
        m.put(5,"Mango");
        m.put(6,"Peach");

        System.out.print("TreeMap (Sorted by keys)  "+ m);
    }
}
