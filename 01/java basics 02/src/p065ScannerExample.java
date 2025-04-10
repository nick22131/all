import java.util.Scanner;

public class p065ScannerExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your name : ");
        sc.nextLine();//consume next line left by sc.nextInt();
        String name = sc.nextLine(); //Reads full line

        System.out.println("Name: " + name + "  Age : "+ age);
        sc.close();
    }
}
