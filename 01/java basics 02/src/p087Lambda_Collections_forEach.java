import java.util.Arrays;
import java.util.List;


public class p087Lambda_Collections_forEach {
    public static void main(String[] args){
        List <String> name = Arrays.asList("Alice", "Bob","Charlie" );

        //Lambda wth Collection forEach();

        name.forEach(nam -> System.out.println(nam));


    }
}
