package basics.pract05;

public class p022_FibonacciIterative {
    public static void main(String[] args ){
        int input = Utility.getNum();
        System.out.print("\n fibonacci series : ");
        fibonacci(input);
    }
    static void fibonacci(int input){
        int a = 0 , b = 1;
        System.out.print("\n " + a + " " + b);
        for(int i = 2; i <= input; i++ ){
            int c = a + b;
            System.out.print(" " + c);
            a = b ;
            b = c;
        }
    }
}
