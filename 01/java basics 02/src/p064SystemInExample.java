import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p064SystemInExample {
    public static void main(String[] args) throws IOException {
        // Wrapping System.in inside InputStreamReader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter your favorite color: ");
        String input = br.readLine();
        System.out.println("Your favorite color is  " + input);

    }
}
