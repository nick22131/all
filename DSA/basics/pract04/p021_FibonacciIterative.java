package basics.pract04;

public class p021_FibonacciIterative {
    public static void main(String[] args){
        int input = Utility.getNumber();
        System.out.print("\n Fibonacci series upto "+ input + " : "  );
        fibonacci(input);

    }
    static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.print("\n series : " + a  + " " + b);
        for(int i = 2; i <= n; i++){
            int c = a + b ;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
