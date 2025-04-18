import java.util.Scanner;

public class p011_Enum_Advance {

    enum Day {
        SUNDAY(1), MONDAY(2), TUESDAY(3), WENSDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
        private final int dayNumber;

        Day(int dayNumber) {
            this.dayNumber = dayNumber;
        }

        public int getDayNumber() {
            return dayNumber;
        }
    }
    // Main Method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day of a week : ");
        String input = sc.nextLine().toUpperCase();
        try{
            Day day =Day.valueOf(input); // Convert input string to enum Constant

            switch(day){
                case MONDAY, TUESDAY, WENSDAY, THURSDAY,FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY,SUNDAY -> System.out.println("It's a weekend ");
            }
        }
        catch(IllegalArgumentException e ){
            System.out.println("Please enter valid day");

        }
        sc.close();
    }
}
