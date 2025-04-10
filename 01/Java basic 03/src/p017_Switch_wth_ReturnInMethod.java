public class p017_Switch_wth_ReturnInMethod {
  static String getTrafficLightAction(String light){
      return switch(light){
          case "Red" -> "stop";
          case "Yellow" -> "Slow down";
          case "Green"  -> "Go" ;
          default -> "invalid Light";
      };
  }
 // Main method
  public static void main(String[] args){
        System.out.println(getTrafficLightAction("Red"));
        System.out.println(getTrafficLightAction("Green"));
    }
}
