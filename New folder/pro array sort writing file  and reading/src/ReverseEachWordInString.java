import java.util.Scanner;

public class ReverseEachWordInString {
    public static void main(String[] args ){
        System.out.print("enter string : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] s = input.split(" ");
         String reverseStr ="" ;
         for (String word : s){
             StringBuilder sb = new StringBuilder(word);
             sb.reverse();
             reverseStr = reverseStr + sb.toString() + " " ;
         }
    System.out.print(" reverse String : " + reverseStr.trim());


    }
}

/*
public class ReverseEachWordInString {
    public static void main(String[] args) {
        // Define the input string to be processed
        String str = "Welcome To Java";

        // Split the input string into words based on spaces and store them in an array
        String[] words = str.split(" ");

        // Initialize an empty string to store the final reversed result
        String reverseString = "";

        // Iterate through each word in the words array
        for (String w : words) {
            // Create a StringBuilder object for the current word
            StringBuilder sb = new StringBuilder(w);

            // Reverse the characters in the current word
            sb.reverse();

            // Convert the reversed word to string and concatenate it to the final result with a space
            reverseString += sb.toString() + " ";
        }

        // Print the reversed string after trimming the trailing space at the end
        System.out.println("Reversed string: " + reverseString.trim());
    }
}

/*
   The StringBuilder class in Java:

   - `StringBuilder` is a mutable sequence of characters, unlike the immutable `String` class.
   - It allows modification of character sequences without creating new objects, making it more memory-efficient.
   - Key features:
     1. Provides methods like `append()`, `insert()`, `delete()`, and `reverse()`.
     2. Performance is better than `String` when multiple modifications are needed.
     3. It is not thread-safe, unlike `StringBuffer`, but offers faster performance in single-threaded scenarios.
   - In this code, `StringBuilder` is used to reverse each word efficiently.
*/