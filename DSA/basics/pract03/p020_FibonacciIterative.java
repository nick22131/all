package basics.pract03;

public class p020_FibonacciIterative {
    public static void main(String[] args){
        int input = Utility.getNumber();
        fibonacci(input);
    }
    static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        System.out.print("fibonacci series is: " + a + " " + b);
        for (int i = 2; i <= n; i++) {
            int c = a+ b;
            System.out.print(" " + c);
            a = b;
            b = c;

        }
    }
}
