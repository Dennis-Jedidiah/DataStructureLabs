public class Node {
    private int data;
    private Node prev;
    private Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    // Getters
    public int getData() {
        return data;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }

    // Setters
    public void setData(int data) {
        this.data = data;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
