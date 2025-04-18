import java.util.Arrays;
import java.util.List;

public class p03_ForLoop {
    public static void main(String[] args){
        List<Integer> li = Arrays.asList(6,5,8,2,3,4,1);
        for (int i = 0; i < li.size(); i++){

            System.out.print(" " + li.get(i));
        }
    }
}
