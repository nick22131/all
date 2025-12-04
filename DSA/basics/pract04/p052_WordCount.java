package basics.pract04;

public class p052_WordCount {
    public static void main(String[] args){
        String input = Utility.getStringLine();
        String[] array = input.split(" ");
        System.out.print("\n word count is : " + array.length);
    }
}
