import java.util.Arrays;
import java.util.List;

public class p042_Stream_ParallelStream {
    public static void main(String[] args){
        List<Integer> li = Arrays.asList(4,453,24,2,6,34,4,2,1333,36,2);
        //Sequential processing
        long seqProcesStartTime= System.currentTimeMillis();
        li.stream()
                .map(v-> v * v  )
                .forEach(v -> System.out.print(" " + v) );
        System.out.print("\n Sequential timing :" + (System.currentTimeMillis()  - seqProcesStartTime));

        //Parallel Processing
        long parallelProTime = System.currentTimeMillis();
        li.parallelStream()
                .map(v -> v * v)
                .forEach(System.out::println) ; // same as .forEach(v -> System.out.println(v);

        System.out.print("\n Parallel Processing Time: " + (System.currentTimeMillis() - parallelProTime) );
    }
}
