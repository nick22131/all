@FunctionalInterface
interface Squ{
    int calculate(int x);
}

// Main
public class p084LambdaWthReturnValu {
    public static void main(String[] args){
       Squ sq = x -> x*x;

       System.out.print("Square of 4: " + sq.calculate(4)  );
    }
}
