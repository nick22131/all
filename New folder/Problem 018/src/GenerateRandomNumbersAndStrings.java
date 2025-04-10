import org.apache.commons.lang3.RandomUtils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumbersAndStrings {
    public static void main(String[] args){
        // Approach 1: Using the Random class to generate random numbers
        Random random = new Random(); // Create an instance of the Random class

        int ran  = random.nextInt(100);// Generate a random integer between 0 (inclusive) and 1000 (exclusive)
        System.out.println(ran); // Print the random number

       double ran2 = random.nextDouble();  // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive) 
       System.out.println(ran2);
          
       // Approch 2: Using the Math.random() method to generate random numbers
       double ran3 = Math.random(); // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
       System.out.println(ran3);

       // Approch 3: Using the ThreadLocalRandom class to generate random numbers here ThreadLocalRandom is specifically used for multi-threaded applications , it is more efficient than the Random class
       int ran4 = ThreadLocalRandom.current().nextInt(100); // Generate a random integer between 0 (inclusive) and 100 (exclusive)
       System.out.println(ran4);
        
       // Approch 4 : using a appache common library
       int ran5 = RandomUtils.nextInt(); // Generate a random integer between 0 (inclusive) and 100 (exclusive)
       System.out.println(ran5);
       

    }

}
