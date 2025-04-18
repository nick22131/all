import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class p01_Collection_Iteration_Lambda {
    public static void main(String[] args){
        List <Integer> li = new ArrayList<>();
        li.add(2);
        li.add(4);
        li.add(6);
        li.add(7);
        li.add(9);

        Iterator <Integer> lis= li.iterator();
        while(lis.hasNext()){
            int val = lis.next();
            System.out.println(val);
            if(val == 3 ){
                lis.remove();
            }
        }
        for (int b : li){
            System.out.println(b);

        }

        li.forEach((Integer c) -> System.out.println(c));
    }
}
