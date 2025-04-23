import java.util.Scanner;

public class D0015_HighestOfThree_MathMax {
    public static void main (String[ ] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = Math.max(Math.max(a,b), c);
        System.out.println("Largest number is : "  + largest);
        sc.close();

    }
}
