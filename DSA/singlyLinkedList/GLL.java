package singlyLinkedList;

public class GLL<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;


    private static class Node<T> {
        private T value ;
        private Node<T> next;

        public Node(T value ){
            this.value = value ;
        }

        public Node(T value , Node<T> next){
            this.value = value ;
            this.next = next;
        }
    }

    //Insert
    public void insertFirst(T val){
        Node<T> node = new Node<>(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }

}
