public class p014_Switch_Lambda_ReturnYield {
    public static void main(String[] args ){
        String day = "monday";

        String type = switch (day) {
            case "monday", "tuesday", "wednsday", " thursday", "friday" -> {
                System.out.println("processing weekday.....");
                yield "weekday";
            }
            case "sunday", "saturday" -> {
                System.out.println("processing weekend ");
                yield "weekend "  ;
            }
            default -> "invalid day"    ;
        };
        System.out.println("day type "  + type);
    }
}
