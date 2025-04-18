import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class p028_Stream_filter_map_reduce {
    public static void main(String[] args){
        List <Integer> li = Arrays.asList(4,3,2,5,7,6);
        Stream <Integer> s1= li.stream();
        Stream <Integer> s2= s1.filter(n -> n % 2 ==  0);
        Stream <Integer> s3 = s2.map(n-> n*2);
        int result =  s3.reduce(0, (c,e) -> c + e );
        System.out.print(result);

    }
}
