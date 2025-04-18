import java.util.Scanner;

public class p010SumOfDigit {
    public static void main(String[] args){
        System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num /10;
        }
        System.out.print("sum of digits are: " + sum);
        sc.close();
    }
}
