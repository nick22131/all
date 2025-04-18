 class Box <T>{
    private T item;
    public Box(T item){
        this.item = item;
    }
    public T getItem (){
        return item;
    }
    public void setItem(T item){
        this.item = item;
    }
 }
 // Main Class
 public class p015GenericClassExample {
    public static void main(String[] args){
    Box <Integer> box = new Box <>(123);
    System.out.print("Integer Box:  "+ box.getItem());

    Box <String> stringBox= new Box<>("Hello");
    System.out.println("\n String Box:  " + stringBox.getItem());
    }
}
