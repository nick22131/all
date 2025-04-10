enum Day{
        SUNDAY, MONDAY, TUESDAY, WENSDAY, THURSDAY, FRIDAY, SATURDAY;
}

//Main
public class p05_Enum_Define_Assigning_Accessing {
    public static void main(String[] args){
         Day today = Day.FRIDAY; // Assign an enum constant

        System.out.print("Today is : "  + today);
    }
}
