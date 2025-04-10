import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read age
        System.out.print("Age: ");
        byte age = sc.nextByte();
        System.out.println("You are " + age);

        // Consume the newline character left by nextByte()
        sc.nextLine();

        // Read name
        System.out.print("Name: ");
        String name = sc.nextLine().trim();
        System.out.println("Hello " + name);

        // Close the scanner
        sc.close();
    }
}
