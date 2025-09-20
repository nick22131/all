package singlyLinkedList;

public class GLL<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    // Base Node Class
    private static class Node<T>{
        private T value;
        private Node<T> next ;

        public Node(T value){
            this.value = value ;
        }

        public Node(T value, Node<T> next){
            this.value = value;
            this.next = next;
        }
    }


    //Insertion
    public void insertFirst(T val){
        Node<T> node = new Node<T>(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size ++;
    }

    public void insertLast(T val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node<T> node = new Node<>(val);
        tail.next = node ;
        tail = node;
        size++;

    }




    //Display
    public void disply(){
        Node<T> temp = head;
        while (temp != null ){
            System.out.print(temp.value + " , ");
            temp = temp.next;
        }
        System.out.print(" End");
    }



    //Main
    public static void main(String[] args) {
        GLL<Integer> intList= new GLL<>();
        intList.insertFirst(34);
        intList.insertLast(45);

        intList.disply();

    }

}
