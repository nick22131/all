public class Main {
    public static void main(String[] args){
        String[] fruits = {"Apple" , "Mango" , "Orange" };

        // Corrected loop to iterate backwards and safely access elements
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }

        for(String fruit: fruits )
            System.out.println(fruit);
    }
}
