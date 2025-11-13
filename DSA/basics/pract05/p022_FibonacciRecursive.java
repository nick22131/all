package basics.pract05;

public class p022_FibonacciRecursive {
    public static void main(String[] args){
        int input = Utility.getNum();
        System.out.print("\n fibonacci series: ");
        for(int i = 0; i <= input; i++){
            System.out.print(" "+ fibonacci(i));
        }
        System.out.println("\n <<<<<<<end>>>>>>>>");
    }
    private static int fibonacci(int n){
        if(n <= 1 ){
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }
}
