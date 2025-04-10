import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class p027_Stream {
    public static void main(String[] args ) {
        List <Integer> li= Arrays.asList(3,2,5,6,3,1,6);
        Stream <Integer> s1 = li.stream();
        s1.forEach(n-> System.out.print(" " + n));
    }
}
