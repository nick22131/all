public class p022_VolatileVariable {
    private static volatile  boolean flag = false;
    public static void main(String[] args ) {
        Thread writer = new Thread(() -> {
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Writer: Setting flag to true...");
            flag = true; // Update flag
        });

        Thread reader = new Thread(() -> {
            int counter = 0;
            while (!flag) {  // Might loop forever if flag update isn't visible
                counter++;
                // Print occasionally
                    System.out.println("Reader: Still waiting... " + counter);

            }
            System.out.println("Reader: Detected flag change after " + counter + " iterations.");
        });

        reader.start();
        writer.start();
    }
}
