import java.util.Scanner;

public class p046ReverseEachWordInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter word string: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        System.out.print("entered String is: ");
        for(String w : ele){
            System.out.print(w + " ");
        }

        String revString = "";
        for(String i : ele){
            StringBuilder sb = new StringBuilder(i);
            sb.reverse();
            revString = revString + sb.toString() + " ";

        }
        sc.close();
        System.out.print("\n Reverse String is : " + revString);

    }
}
