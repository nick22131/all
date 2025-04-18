public class p016GenericClassArray {
    public static <T> void printArray(T[] array){
        for(T ele : array){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

     // Main Method
    public static void main(String[] args){
        Integer [] ia = { 1,2,5,6};
        System.out.print("integer Array :  ");
        printArray(ia);


        String [] sa = { "apple", "banana", "Mango" };
        System.out.print("String Array is : ");
        printArray(sa);
    }
}
