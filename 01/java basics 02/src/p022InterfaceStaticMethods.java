interface Utility{
    static void showHelp(){
        System.out.println("Help guid for the application");
    }
}

// Main class
public class p022InterfaceStaticMethods {
    public static void main(String[] args){
        Utility.showHelp();
    }
}
