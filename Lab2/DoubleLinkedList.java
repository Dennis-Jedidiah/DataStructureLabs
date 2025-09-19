public class DoubleLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    // Constructor
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Getters
    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public int getLength() {
        return size;
    }

    // Setters
    public void setHead(Node<E> head) {
        if (size == 0) {
            this.head = head;
            this.tail = head;
            size++;
        } else {
            Node<E> oldhead = this.head;
            this.head = head;
            this.head.setNext(oldhead);
            size++;
        }
    }

    public void setTail(Node<E> tail) {
        if (size == 0) {
            this.tail = tail;
            this.head = tail;
            size++;
        } else {
            Node<E> oldTail = this.tail;
            this.tail = tail;
            this.tail.setPrev(oldTail);
            size++;
        }
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Other Methods
    public void addToFront(E value) {
        Node<E> newNode = new Node<E>(value);
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
            Node<E> newHead = this.head.getNext();
            this.head = newHead;
            size--;
        }
    }

    public void addToEnd(E value) {
        Node<E> newNode = new Node<E>(value);
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
            Node<E> newTail = this.tail.getPrev();
            this.tail = newTail;
            size--;
        }
    }

    public String toString() {
        String returnString = "[ ";
        Node<E> startingPoint = this.head;
        for (int i = 0; i < this.size; i++) {
            returnString += startingPoint.getData() + " ";
            startingPoint = startingPoint.getNext();
        }
        returnString += "]";
        return returnString;    
    }
}
