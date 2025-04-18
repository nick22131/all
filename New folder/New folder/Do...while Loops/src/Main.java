import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.print("input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);

        } while (!input.equals("quit"));
    }
}
