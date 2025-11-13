package basics.pract05;

public class p025_PrimeNumCheck {
    public static void main(String[] args){
        int input = Utility.getNum();

        if(isPrime(input)){
            System.out.print("\n Yes , Prime");
        }else{
            System.out.print("\n Not Prime");
        }
    }

    private static boolean isPrime(int n) {
        if(n <= 1 ){
            return false;
        }
        for(int i = 2 ; i < n; i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
}
