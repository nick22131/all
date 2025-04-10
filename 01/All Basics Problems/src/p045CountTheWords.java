import java.util.Scanner;

public class p045CountTheWords {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter elements of arrays : ");
        String st = sc.nextLine();
        int count = 1 ;
        for(int i = 0; i < st.length() -1; i++){
            if((st.charAt(i) == ' ') && (st.charAt(i+1) != ' ' )){
                count++;
            }
        }
        System.out.print("word count is : " + count);
    }
}
