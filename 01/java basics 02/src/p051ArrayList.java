import java.util.ArrayList;
import java.util.List;

public class p051ArrayList {
    public static void main(String[] args){
        List <String> li = new ArrayList<>();
        li.add("Apple");
        li.add("Banana");
        li.add("Cherry");
        System.out.println(li.get(1));
        // Iterating over elements

        for(String st: li){
            System.out.print(st + " ");
        }


    }
}
