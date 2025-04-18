public class p016_Switch_Wth_MethodCall {

    static String getWorkMessage(){
        return "Time to work";
    }
    static String getRelaxMessage(){
         return "time to relax";
    }

    public static void main(String[] args){
        String day = "friday";
        String mess = switch(day){
            case "monday" , "tuesday", "thursday", "wednesday", "friday" -> getWorkMessage()    ;
            case "saturday", "sunday" -> getRelaxMessage();
            default -> "invalid day";
        };
    }
}
