

// Given an array/list 'ARR' of integers and a position ‘M’. You have to reverse the array after that position.
//
//Example:
//
//We have an array ARR = {1, 2, 3, 4, 5, 6} and M = 3 , considering 0
//based indexing so the subarray {5, 6} will be reversed and our
//output array will be {1, 2, 3, 4, 6, 5}.
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//1 <= T <= 10
//0 <= M <= N <= 5*10^4
//-10^9 <= ARR[i] <= 10^9



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of test cases
        System.out.print("Enter the number of test cases: ");
        int T = sc.nextInt();

        // Process each test case
        while (T-- > 0) {
            // Input the size of the array
            System.out.print("Enter the size of the array: ");
            int N = sc.nextInt();

            // Input the position M
            System.out.print("Enter the position M: ");
            int M = sc.nextInt();

            // Input the array elements
            int[] ARR = new int[N];
            System.out.print("Enter the array elements: ");
            for (int i = 0; i < N; i++) {
                ARR[i] = sc.nextInt();
            }

            // Reverse the array after position M
            reverseAfterM(ARR, M);

            // Output the modified array
            System.out.print("Modified array: ");
            for (int num : ARR) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Function to reverse the array after position M
    public static void reverseAfterM(int[] ARR, int M) {
        int left = M + 1; // Start index of the subarray to reverse
        int right = ARR.length - 1; // End index of the subarray to reverse

        // Swap elements from left to right
        while (left < right) {
            int temp = ARR[left];
            ARR[left] = ARR[right];
            ARR[right] = temp;
            left++;
            right--;
        }
    }
}