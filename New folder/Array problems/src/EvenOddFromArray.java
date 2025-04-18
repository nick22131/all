import java.util.Scanner;

public class EvenOddFromArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array eleme wh space : ");
        String inp = sc.nextLine();
        String [] ele = inp.split(" ");
        int [] arr = new int[ele.length];
        for (int i =0 ; i < ele.length; i++){
            arr[i] = Integer.parseInt(ele[i]);
        }
        System.out.println(" elements r : ");
        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\neven no: ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i]+ " " );
            }
        }
      System.out.println(" \nodd no: " );
        for( int i= 0; i< arr.length; i++){
            if ( arr[i] % 2 != 0 ){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
