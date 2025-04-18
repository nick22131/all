import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class p043_Stream_DifferentWaysToCreateStream {
    public static void main(String[]args)   {
        // From Collection
        List <Integer> li = Arrays.asList(3,46,3,6,3,7,8,9,1    );
        Stream<Integer> st = li.stream();

        //From Array
        Integer [] arr = {3444,5,777,6542,2};
        Stream <Integer> sta = Arrays.stream(arr);

        //from Static method
        Stream<Integer> stst= Stream.of(400,322,44543,663);

        // from streamBuilder
        Stream.Builder<Integer> stbu = Stream.builder();
        stbu.add(2333).add(1555).add(311).add(325);
        Stream<Integer> sts= stbu.build();

        //from Stream Iterator
      Stream <Integer> stit = Stream.iterate(100, (Integer n) -> n + 5).limit(6);
      stit.forEach(n -> System.out.print(" " + n));
    }
}
