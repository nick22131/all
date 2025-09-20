package doublyLinkedList;

public class DLL {

    private Node head;

    private class Node{
        int val ;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    // Insertion
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }


    //Display
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " , ");
            temp = temp.next;
        }
        System.out.println();
    }


}
