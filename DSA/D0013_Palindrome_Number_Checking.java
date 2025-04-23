import java.util.Scanner;

public class D0013_Palindrome_Number_Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check if it is a Palindrome : ");
        int inpu = sc.nextInt();
        int org_num = inpu;
        int rev = 0;
        while (inpu != 0) {
            int digit = inpu % 10;
            rev = rev * 10 + digit;
            inpu = inpu / 10;
        }
        if (rev == org_num) {
            System.out.println(org_num + " this number is palindrome number ");
        } else {
            System.out.println(org_num+ " this number is NOT palindrome number");
        }
    }
}
