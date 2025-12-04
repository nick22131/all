package recursion;

public class re001 {
    public static void main(String[] args) {

        printfBoth(7);
    }

    static void printf(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printf(n-1);
    }

    static void printfRev(int n ){
        if(n == 0){
            return;
        }
        printfRev(n-1);
        System.out.println(n);
    }

    static void printfBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printfBoth(n-1);
        System.out.println(n);
    }
}
