public class p015_Switch_Lambda_Return_Yield_Enum  {

    enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

   public static String getDayType(Day day) {
        return switch (day){
            case  MONDAY, TUESDAY, WEDNESDAY, THURSDAY , FRIDAY-> "WEEKDAY";
            case SATURDAY, SUNDAY -> "weekend";
        };
   }
    //Main Method
    public static void main(String[] args){
        System.out.println(getDayType(Day.FRIDAY));

        System.out.println(getDayType(Day.SUNDAY));

    }
}
