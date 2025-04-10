import java.util.Scanner;

public class RemoveJunk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter array : ");
        String a = sc.nextLine();
        
        System.out.print(" your array is : " + a);
         a = a.replaceAll("[^a-zA-z0-9 ]", "");
         System.out.print("clean string is : " + a);
        
    }
}


/* import java.util.Scanner;

public class RemoveJunk {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string (which may contain special characters)
        System.out.print(" enter array : ");
        String a = sc.nextLine();  // Read the input string from the user

        // Display the original input string
        System.out.print(" your array is : " + a);

        // Remove all special characters from the string using replaceAll() method
        // Explanation of the regex used in replaceAll():
        // [^a-zA-Z0-9 ] ->
        //   ^  - Negation, meaning "not these characters"
        //   a-z - Matches all lowercase English letters
        //   A-Z - Matches all uppercase English letters
        //   0-9 - Matches all digits (0 to 9)
        //   " " (space) - Matches spaces to preserve word spacing
        //
        // Thus, this pattern keeps only alphanumeric characters and spaces,
        // removing any special characters (e.g., @, #, $, %, &, etc.)
        a = a.replaceAll("[^a-zA-Z0-9 ]", "");

        // Display the cleaned string with only alphanumeric characters and spaces
        System.out.print("clean string is : " + a);
    }
}
*/
