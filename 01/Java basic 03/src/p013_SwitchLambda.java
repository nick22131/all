public class p013_SwitchLambda {
    public static void main(String[] args){
        String d  = "monday";
        // lambda allows direct return
        String type = switch(d){
            case "monday" , "tuesday", "wednesday","thursday","friday" -> "weekday";
            case "saturday" , " sunday " -> "weekend";
            default -> "Invalid day";
        };
        System.out.print("day type : "  + type );
    }
}
