public class p06_Enum_In_SwitchStatement {
    public static void main(String[] args)  {
        Day today = Day.FRIDAY; // Assign an Enum constant

        switch(today){
            case MONDAY, TUESDAY, WENSDAY, THURSDAY, FRIDAY -> System.out.println("It's a weekday");

            case SATURDAY, SUNDAY -> System.out.println(" It's a weekend!");
        }
    }
}
