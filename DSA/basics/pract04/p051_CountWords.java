package basics.pract04;

public class p051_CountWords {
    public static void main(String[] args){
        String input = Utility.getStringLine();
        int count = 1;
        for(int i = 0; i < input.length()-1; i++){
            if((input.charAt(i) == ' ') && (input.charAt(i+1) != ' ')){
                count ++;
            }
        }
        System.out.print("\n Num of words : " + count   );
    }
}
