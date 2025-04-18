public class p10_Enum_ComparingValues {
    public static void main(String[] args){
       /* String today = "FRIDAY";

        if (today.equals(Day.FRIDAY) ){                // .equals() points to value
            System.out.println("It's almost weekend");
        }

        // or == which compare memory address

        if(today = Day.FRIDAY){
            System.out.println("fsfs")
        }*/




                String today = "FRIDAY";

                // Convert String to Enum before comparison
                Day todayEnum = Day.valueOf(today);

                if (todayEnum == Day.FRIDAY) {
                    System.out.println("It's almost weekend");
                }

                // Another way to compare
                if (Day.FRIDAY.equals(todayEnum)) {
                    System.out.println("It's almost weekend (checked using .equals())");
                }
            }
        }



