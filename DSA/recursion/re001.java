package recursion;

public class re001 {
    public static void main(String[] args) {

        printf(7);
    }

    static void printf(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printf(n-1);
    }
}
