interface Printer{
    void printMessage();
}

class AnonymousMethodExample{
    static void displayMessage(Printer printer)  {
        printer.printMessage();
    }
}

// Main class
public class p077AnonymousClassAsMethodArgument {
    public static void main(String[] args){
        // passing an anonymous class implementation as an argument
        AnonymousMethodExample.displayMessage(new Printer(){
        @Override
        public void printMessage() {
            System.out.print("Message from Anonymous class!");
            }                                               }
        );
    }
}
