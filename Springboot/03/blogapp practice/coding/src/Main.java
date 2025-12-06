import java.util.Optional;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Optional<String> a = Optional.ofNullable(null);
        if(!a.isEmpty()){
            System.out.println(a.get());





        }else System.out.println("no value");
    }
}