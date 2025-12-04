package singlyLinkedList;

public class GLL<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public GLL() {
        this.size = 0;
    }

    // Node Class
    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    // ---------------- Insertion ----------------

    // Insert at beginning
    public void insertFirst(T val) {
        Node<T> node = new Node<>(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Insert at end
    public void insertLast(T val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node<T> node = new Node<>(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // Insert at specific index
    public void insert(T val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node<T> temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node<T> node = new Node<>(val, temp.next);
        temp.next = node;
        size++;
    }

    // ---------------- Deletion ----------------

    // Delete first node
    public T deleteFirst() {
        if (head == null) throw new RuntimeException("List is empty");

        T val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    // Delete last node
    public T deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node<T> secondLast = get(size - 2);
        T val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    // Delete at index
    public T delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node<T> prev = get(index - 1);
        T val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    // ---------------- Find ----------------

    public Node<T> find(T val) {
        Node<T> node = head;
        while (node != null) {
            if (node.value.equals(val)) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // ---------------- Display ----------------

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End\n");
    }

    // ---------------- Utilities ----------------

    public Node<T> get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int getSize() {
        return size;
    }

    // ---------------- Main (Example) ----------------
    public static void main(String[] args) {
        GLL<String> list = new GLL<>();

        list.insertFirst("C");
        list.insertFirst("B");
        list.insertFirst("A");
        list.insertLast("D");
        list.insert("X", 2);

        list.display();  // A -> B -> X -> C -> D -> End

        System.out.println("Deleted: " + list.deleteFirst()); // A
        list.display();  // B -> X -> C -> D -> End

        System.out.println("Deleted: " + list.deleteLast());  // D
        list.display();  // B -> X -> C -> End

        System.out.println("Find X: " + (list.find("X") != null)); // true
        System.out.println("Size: " + list.getSize()); // 3
    }
}
