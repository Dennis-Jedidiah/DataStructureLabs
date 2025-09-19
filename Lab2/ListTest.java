public class ListTest {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        System.out.println("Initial size = " + list.getLength()); 

        list.addToFront(10);
        System.out.println("After addToFront(10): " + list + " Size = " + list.getLength()); 

        list.addToEnd(20);
        System.out.println("After addToEnd(20): " + list + " Size = " + list.getLength()); 

        list.addToFront(5);
        System.out.println("After addToFront(5): " + list + " Size = " + list.getLength()); 

        list.removeFromFront();
        System.out.println("After removeFromFront(): " + list + " Size = " + list.getLength()); 

        list.removeFromEnd();
        System.out.println("After removeFromEnd(): " + list + " Size = " + list.getLength()); 

        list.removeFromFront();
        System.out.println("After removeFromFront(): " + list + " Size = " + list.getLength()); // [ ]

        list.removeFromFront();
        System.out.println("After removeFromFront() on empty: " + list + " Size = " + list.getLength());

        list.addToEnd(99);
        System.out.println("After addToEnd(99): " + list + " Size = " + list.getLength()); // [ 99 ]

        list.addToEnd(100);
        list.addToEnd(101);
        System.out.println("After addToEnd(100), addToEnd(101): " + list + " Size = " + list.getLength()); 
        list.removeFromEnd();
        list.removeFromEnd();
        list.removeFromEnd();
        System.out.println("After removing all from end: " + list + " Size = " + list.getLength()); 

        list.addToFront(1);
        list.addToEnd(2);
        list.addToFront(0);
        list.addToEnd(3);
        System.out.println("After alternating adds: " + list + " Size = " + list.getLength()); 
    }
}
