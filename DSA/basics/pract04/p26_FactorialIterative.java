package basics.pract04;

public class p26_FactorialIterative {
    public static void main(String[] args){
        int input = Utility.getNumber();
        long fact = 1;
        for(int i = 1; i <= input ; i++){
            fact = fact * i;
        }

        System.out.print("Factorial of " + input + " : " + fact);
    }
}
