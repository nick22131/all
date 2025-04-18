//import java.util.Random;
//import org.apache.commons.lang3.RandomStringUtils;
//public class p026GenerateRandomNumbersAndStrings {
//// Ensure you have the Apache Commons Lang library added to your project
//
//
//        public static void main(String[] args) {
//
//            // Approach 1: Using the Random class to generate random numbers
//            Random rand = new Random();  // Create an instance of the Random class
//
//            int randInt = rand.nextInt(1000);
//            // Generate a random integer between 0 (inclusive) and 1000 (exclusive)
//            System.out.println("Random Integer (0-999): " + randInt);
//            // Print the generated random integer
//
//            double randDouble = rand.nextDouble();
//            // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
//            System.out.println("Random Double (0.0-1.0): " + randDouble);
//            // Print the generated random double
//
//            // Approach 2: Using the Math class to generate random numbers
//            double mathRandom = Math.random();
//            // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
//            System.out.println("Random Double using Math.random(): " + mathRandom);
//            // Print the generated random double
//
//            // Approach 3: Using Apache Commons Lang library to generate random strings
//            String randomNumeric = RandomStringUtils.randomNumeric(10);
//            // Generate a random numeric string of length 10
//            System.out.println("Random Numeric String: " + randomNumeric);
//            // Print the generated random numeric string
//
//            String randomAlphabetic = RandomStringUtils.randomAlphabetic(5);
//            // Generate a random alphabetic string of length 5
//            System.out.println("Random Alphabetic String: " + randomAlphabetic);
//            // Print the generated random alphabetic string
//        }
//    }
//
//
