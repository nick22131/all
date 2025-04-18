import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p062Bufferedreaderexample {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("enter your name: ");
       String input = br.readLine();
       System.out.println("Hello"  +  input);

    }
    
}
