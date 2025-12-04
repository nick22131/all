package basics.pract05;

public class p026_FactorialIterative {
    public static void main(String[] args){
        int input = Utility.getNum();
        long fact = 1;
        for(int i = 1; i <= input;i++){
            fact = fact * i;
        }
        System.out.print("\n factorial of " + input + " : " + fact);
    }
}
