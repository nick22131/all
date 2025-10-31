package basics.pract04;

public class p022_FibonacciRecursive {
    public static void main(String[] args) {
        int input = Utility.getNumber();
        System.out.print("\n series : ");
        for(int i = 0 ; i <= input ; i++){
            System.out.print(" " + fibonacci(i));
        }

    }

    static int  fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
