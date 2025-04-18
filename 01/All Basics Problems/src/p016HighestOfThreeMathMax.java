import java.util.Scanner;

public class p016HighestOfThreeMathMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = Math.max(Math.max(a,b),c);
        System.out.print("Largest number is : " + largest);
    }
}
