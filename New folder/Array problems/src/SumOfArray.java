import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array eleme wh space : ");
        String input = sc.nextLine();
         String [] ele =  input.split(" ");
         int [] arr = new int[ele.length ];
         for ( int i = 0 ; i < ele.length ; i++){
            arr [i] = Integer.parseInt(ele[i]);
         }
         System.out.print( " arr ele r : ");
         for ( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
         }
          int sum = 0;
          for ( int i = 0 ; i < arr.length ; i++){
            
            sum = sum + arr[i];

    }
    System.out.println("sum of array ele is : " + sum);
}

    
}

/* import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter array elements separated by spaces
        System.out.print("Enter array elements separated by spaces: ");
        String input = sc.nextLine();

        // Split the input string into an array of strings
        String[] ele = input.split(" ");

        // Convert the string array to an integer array
        int[] arr = new int[ele.length];
        for (int i = 0; i < ele.length; i++) {
            arr[i] = Integer.parseInt(ele[i]);
        }

        // Print the array elements
        System.out.print("Array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to the next line

        // Calculate the sum of the array elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // Print the sum of the array elements
        System.out.println("Sum of array elements is: " + sum);

        sc.close(); // Close the scanner
    }
} */
