import java.util.function.Function;

public class p71FunctionFunctionalInterfaceExample {
    public static void main(String[] args){
        Function <Integer,String> convertToString = num -> "number " + num;
        System.out.print(convertToString.apply(10));
    }
}
