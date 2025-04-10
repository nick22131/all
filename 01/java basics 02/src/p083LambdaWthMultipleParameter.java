@FunctionalInterface
interface MathOper {
    int operate(int a , int b);
}
// MAIN
public class p083LambdaWthMultipleParameter {
    public static void main(String[ ] args){
       MathOper ad = (a,b) -> a + b ;


       System.out.println("Addition : " + ad.operate(5,6));

    }
}
