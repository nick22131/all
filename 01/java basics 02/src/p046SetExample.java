import java.util.HashSet;
import java.util.Set;

public class p046SetExample {
    public static void main(String[] args){
        Set <String> s = new HashSet<>();
        s.add("Apple");
        s.add("Banana");
        s.add("Apple");
        System.out.print(s);
    }
}
