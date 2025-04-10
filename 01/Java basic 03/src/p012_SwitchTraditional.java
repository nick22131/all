public class p012_SwitchTraditional {
    public static void main(String[] args){
        String day = "MONDAY";
        String type;
        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WENSDAY":
            case "THURSDAY":
            case "FRIDAY":
                type = "weekday";
                break;

            case "SATURDAY":
            case "SUNDAY":
                type = "weekend";
            default:
                type = "invalid day";
        }
        System.out.print("Day Type : " + type);
    }
}
