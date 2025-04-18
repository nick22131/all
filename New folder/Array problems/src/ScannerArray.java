import java.util.Scanner;

public class ScannerArray {  // here we are creating a class called ScannerArray and storing it in the public class
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array elements separated by spaces: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int [] Arr = new int[ele.length];
        for (int i=0; i < ele.length; i++ ){
            Arr [i] = Integer.parseInt(ele[i]);
        } 
        System.out.print("Array elements are: ");
        for (int i = 0; i < Arr.length; i++){
            System.out.print(Arr[i] + " ");
        }
        sc.close();
    }
}




