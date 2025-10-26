package basics.pract;

import java.util.Scanner;

public class p043_RemovingJunk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to Clean: ");
        String input= sc.nextLine();
        System.out.print(" \n To clean: ");
        String cleaned = input.replaceAll("[^0-9a-zA-Z]", "");
        System.out.print("Cleaned String is : " + cleaned);
    }
}
