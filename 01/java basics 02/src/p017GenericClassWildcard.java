import java.util.List;

public class p017GenericClassWildcard {
    public static  void printList(List<?> list){
        for(Object ele : list){
            System.out.print(ele + " ");
        }

    }

    public static void main(String[] arg) {
        List <Integer> intList= List.of(1,3,4,5);
        List <String>  stringList = List.of("df", "ef", "et");

        printList(intList);
        printList(stringList);
    }
}
