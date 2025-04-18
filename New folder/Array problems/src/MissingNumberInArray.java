import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 = sum1 + a[i];
        }

        int sum2 = (n + 1) * (n + 2) / 2; // Sum of first n+1 natural numbers
        System.out.println("Missing Number is: " + (sum2 - sum1));
        scanner.close();
    }
}