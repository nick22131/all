public class Main {
    public static void main(String[] args) {
        // implicit casting
        // byte > short > int > long> flot > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        // explicit casting
        double a = 1.1;
        int b = (int) a + 2;
        System.out.println(b);

        // wrapper class from reference  to primitive
        String c = "123";
        //int d = Integer.parseInt(c);
        int d = Integer.parseInt(c) + 2;
        System.out.println(d);    
     }
}
