package basics.pract04;

public class p025_PrimeNumChecker {
    public static void main(String[] args){
        int input = Utility.getNumber();

        if(isPrime(input)){
            System.out.print("\n It is Prime");
        }else{
            System.out.print("\n It is NOT");
        }
    }
    static boolean isPrime(int  n){
        if(n <= 1){
            return false;
        }

        for(int i = 2; i< n ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
