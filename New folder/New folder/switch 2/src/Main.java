public class Main {
    public static void main(String[] args) {
        int role = 1; // Initialize role variable as an integer

        // Use switch statement to check role
        switch (role) {
            case 1:
                System.out.println("You're an admin");
                break;
            case 2:
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
                break;
        }
    }
}