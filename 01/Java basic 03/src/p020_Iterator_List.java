import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class p020_Iterator_List {
    public static void main(String[] args){
        List<String> li = new ArrayList<>();
        li.add("Java"   );
        li.add("Python");
        li.add("c++");
        li.add("JavaScript");
        // Creating Iterator
        Iterator <String> it = li.iterator();
        //Iterating using iterator
        while(it.hasNext()){
            String la = it.next();
            //Removing element Safely
            if(la.equals("c++")){
                it.remove();
            }
        }

        System.out.print("Updated list : " + li);

    }
}
