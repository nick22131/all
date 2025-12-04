package basics.pract04;

public class p012_SumOfDigits {
    public static void main(String[] args) {
        int input = Utility.getNumber();
        int sum = 0;
        while(input > 0){
            int digit = input % 10;
            sum = sum + digit;
            input = input / 10;
        }
        System.out.print("\n Sum of Digit is: " + sum);
    }
}
