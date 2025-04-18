import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class p019_Collection_Iterator {
    public static void main(String[] args){
        List<Integer> li = new ArrayList<>();
        li.add(9);
        li.add(4);
        li.add(3);
        li.add(2);

        //Iterating values using iterator method
        Iterator <Integer> it = li.iterator();
        while(it.hasNext()){
            int val = it.next();
            System.out.print(" " + val);
            if (val == 3 ) {
                it.remove();
            }
        }
       System.out.print("\n");
        //Iterating using in  Enhanced for loooop
        for(int a : li){
            System.out.print(" " + a);
        }
          System.out.print("\n");
        //Iterating using forEach Loop
        li.forEach(n -> System.out.print(" " + n)   );
    }
}
