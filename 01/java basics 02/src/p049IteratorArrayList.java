import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class p049IteratorArrayList {
    public static void main(String[] args){
        List <String> li = new ArrayList<>(Arrays.asList("Apple" , "Banana" , "Cherry"));
        Iterator <String> it = li.iterator();
        while( it.hasNext()){
            System.out.println(it.next());
        }
    }
}
