import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class p040_Comparator_Advance {
    public static void main(String[] args){
        Comparator <Integer> co = new Comparator<Integer>(){
            @Override
            public int compare(Integer i , Integer j ){
                if( i % 10 > j % 10 ) {
                    return 1 ;
                }
                else return -1;
            }
        };

     List <Integer> li = new ArrayList<>();
     li.add(32);
     li.add(45);
     li.add(31);
     li.add(56);

        Collections.sort(li, co)    ;
        System.out.print(li);
    }
}
