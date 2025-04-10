import java.util.Scanner;

public class p07NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            System.out.print("enter array ele:  ");
            sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] ele = input.split(" ");
            int[] array = new int[ele.length];
            for (int i = 0; i < ele.length; i++) {
                array[i] = Integer.parseInt(ele[i]);
            }
            System.out.print(" \n ");
            try {
                System.out.print("enter array index to get value: ");
                int a = sc.nextInt();
                System.out.print("array valu at index " + a + " :  " + array[a]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.print(" Inner catch " + e);
            }
        } catch (Exception e) {
            System.out.print(" outer catch " + e);
        } finally {
            sc.close();
            System.out.print(" \n finally block getting executed");
        }

    }
}
