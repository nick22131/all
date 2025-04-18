import java.util.Arrays;
import java.util.Random;

public class checker {
    public static void main(String[] args) {
        String s = "sjkdklfjlskjdramskdfram";
        String e="ram";
        int total=0;
        int i=0;
        while(s.length()>i){
            for(int j = 0; j < e.length(); j++) {
               if(e.charAt(j)==s.charAt(i)){
                   if(j==e.length()-1) {i++;
                   total++;}
                   else {
                       i++;
                       break;
                   }
               }
            }
        }
        System.out.println(total);
    }
}