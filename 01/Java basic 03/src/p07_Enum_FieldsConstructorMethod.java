enum Color{
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#OOOOFF");
    private String hexCode; // property for storing hex code
    // Constructor
    Color (String hexCode) {
        this.hexCode = hexCode;
    }
    // Method to get hexCode
    public String getHexCode(){
        return hexCode;
    }
}


// Main
public class p07_Enum_FieldsConstructorMethod {
    public static void main(String[] args){
        Color myColor = Color.RED;
        System.out.println("Selected Color : " + myColor)  ;
        System.out.println("Hex Code :  "  + myColor.getHexCode());
    }
}
