import java.util.Scanner;

public class p03_ScannerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array elements : ");
        String input = scanner.nextLine();
        String[] ele = input.split(" ");
        int[] array = new int[ele.length];
        for (int i = 0; i <ele.length ; i++) {
            array[i] = Integer.parseInt(ele[i]);
        }

        System.out.print("\n entered array is: ");
        for(int a : array){
            System.out.print(" " + a);
        }
    }
}
