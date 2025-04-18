import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array ele :") ;
      String input = sc.nextLine();
      String [] ele = input.split(" ");
      int arr [] = new int [ele.length];
      for(int i =0; i < ele.length; i++){
          arr [i] = Integer.parseInt(ele[i]);
      }
      System.out.print(" array : ");
      for(int b : arr ){
          System.out.print(b + " ");

          int n = arr.length;
          for(int i =0; i < n-1 ; i++){
              for(int j= 0; j < n-1 ; j++){
                  if(arr[j] > arr[j+1]){
                      int a = arr [j];
                      arr[j] = arr [j+1];
                      arr[j+1]=a;
                  }
              }
          }

      }
        System.out.print( " sorted arra" + Arrays.toString(arr));
    }
}
/* import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter array elements
        System.out.print("Enter array elements: ");
        String input = sc.nextLine(); // Read the input as a single string

        // Split the input string into individual elements based on spaces
        String[] ele = input.split(" ");

        // Create an integer array to store the parsed elements
        int[] arr = new int[ele.length];

        // Convert each string element to an integer and store it in the array
        for (int i = 0; i < ele.length; i++) {
            arr[i] = Integer.parseInt(ele[i]);
        }

        // Print the original array
        System.out.print("Original array: ");
        for (int b : arr) {
            System.out.print(b + " ");
        }
        System.out.println(); // Move to the next line

        // Bubble Sort Algorithm
        int n = arr.length; // Get the length of the array
        for (int i = 0; i < n - 1; i++) { // Outer loop for passes
            for (int j = 0; j < n - i - 1; j++) { // Inner loop for comparisons
                if (arr[j] > arr[j + 1]) { // If the current element is greater than the next
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted array: " + Arrays.toString(arr));
    }
}*/