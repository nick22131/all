public class Main {
    public static void main(String[] args) {
        int temp = 32; // Initialize temperature variable

        // Check temperature range using if-else statements
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("It's a nice day");
        } else {
            System.out.println("It's cold");
        }
    }
}