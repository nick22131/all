import java.util.TreeSet;

public class p069TreeSetExample {
    public static void main(String[] args){
        TreeSet<Integer> t = new TreeSet<>();
        t.add(40);
        t.add(50);
        t.add(45);
        t.add(12);
        System.out.print("TreeSet(Sorted): " + t) ;
    }
}
