import java.text.NumberFormat;

public class Main {
    public static void main(String[ ] args){
        // NumberFormat currancy = new NumberFormat() : we cant create instance
        // of  number class because its a abstract class
        NumberFormat currancy = NumberFormat.getCurrencyInstance();
        String result = currancy.format(1234567.89);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentResult = percent.format(0.1);
        System.out.println(percentResult);

    }
}
