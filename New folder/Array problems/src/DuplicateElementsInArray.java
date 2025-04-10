import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElementsInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array elements: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int arr [] = new int [ele.length];
        for ( int i = 0 ; i < ele.length; i++){
            arr[i] = Integer.parseInt(ele[i]);
        }
        System.out.print(" array; ");
        for(int i =0 ; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        HashSet<Integer> set = new HashSet< >() ;
        boolean flag = false;
        for( int i=0; i < arr.length; i++){
            if (set.contains(arr[i])){
                System.out.println("found duplicate :  " + arr[i]);
            }
            else {set.add(arr[i]);
        }

        }
        if (!flag) {
            System.out.println("No Duplicate Elements Found");
        }
        sc.close();

    }
}
