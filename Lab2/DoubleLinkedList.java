public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Getters
    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return size;
    }

    // Setters
    public void setHead(Node head) {
        if (size == 0) {
            this.head = head;
            this.tail = head;
            size++;
        } else {
            Node oldhead = this.head;
            this.head = head;
            this.head.setNext(oldhead);
            size++;
        }
    }

    public void setTail(Node tail) {
        if (size == 0) {
            this.tail = tail;
            this.head = tail;
            size++;
        } else {
            Node oldTail = this.tail;
            this.tail = tail;
            this.tail.setPrev(oldTail);
            size++;
        }
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Other Methods
    public void addToFront(int value) {
        Node newNode = new Node(value);
        setHead(newNode);
    }

    public void removeFromFront() {
        if (size == 0) {
            return;
        } else if (size == 1) {
            this.head = null;
            this.tail = null;
            size--;
        } else {
            Node newHead = this.head.getNext();
            this.head = newHead;
            size--;
        }
    }

    public void addToEnd(int value) {
        Node newNode = new Node(value);
        setTail(newNode);
    }

    public void removeFromEnd() {
        if (size == 0) {
            return;
        } else if (size == 1) {
            this.head = null;
            this.tail = null;
            size--;
        } else {
            Node newTail = this.tail.getPrev();
            this.tail = newTail;
            size--;
        }
    }

    public String toString() {
        String returnString = "[ ";
        Node startingPoint = this.head;
        for (int i = 0; i < this.size; i++) {
            returnString += startingPoint.getData() + " ";
            startingPoint = startingPoint.getNext();
        }
        returnString += "]";
        return returnString;
    }
}
