
public class Main {
    public static void main(String[] args) {
        // Example 1: Logical AND (&&) Operator
        // The && operator returns true only if both conditions are true.
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // Check if temperature is between 20 and 30
        System.out.println("Is it warm? " + isWarm); // Output: true

        // Example 2: Logical OR (||) Operator
        // The || operator returns true if at least one of the conditions is true.
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean isEligibleForLoan = hasHighIncome || hasGoodCredit; // Check if either condition is true
        System.out.println("Is eligible for loan? " + isEligibleForLoan); // Output: true

        // Example 3: Logical NOT (!) Operator
        // The ! operator negates the boolean value (true becomes false, and false becomes true).
        boolean hasCriminalRecord = false;
        boolean isEligibleForJob = !hasCriminalRecord; // Check if there is no criminal record
        System.out.println("Is eligible for job? " + isEligibleForJob); // Output: true

        // Example 4: Combining Logical Operators
        // You can combine multiple logical operators to create complex conditions.
        boolean isEligibleForPromotion = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        // Check if either hasHighIncome or hasGoodCredit is true AND there is no criminal record
        System.out.println("Is eligible for promotion? " + isEligibleForPromotion); // Output: true
    }
}
