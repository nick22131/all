import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("L = ");
        int l = sc1.nextInt();

        System.out.print("B = ");
        int b = sc1.nextInt();

        if (l<1 || l>100 || b < 1 || b > 100 || l<b) {
            System.out.println("Invalid input");
        } else {
            int A = l * b;
            System.out.println(" area =" + A);
                }
    }
}
