public class ListTest {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        // Test 1: Initial state
        System.out.println("Test 1: Initial size = " + list.getLength()); // Expect 0

        // Test 2: Add to front
        list.addToFront(10);
        System.out.println("Test 2: After addToFront(10): " + list + " Size = " + list.getLength()); // [ 10 ]

        // Test 3: Add to end
        list.addToEnd(20);
        System.out.println("Test 3: After addToEnd(20): " + list + " Size = " + list.getLength()); // [ 10 20 ]

        // Test 4: Add to front again
        list.addToFront(5);
        System.out.println("Test 4: After addToFront(5): " + list + " Size = " + list.getLength()); // [ 5 10 20 ]

        // Test 5: Remove from front
        list.removeFromFront();
        System.out.println("Test 5: After removeFromFront(): " + list + " Size = " + list.getLength()); // [ 10 20 ]

        // Test 6: Remove from end
        list.removeFromEnd();
        System.out.println("Test 6: After removeFromEnd(): " + list + " Size = " + list.getLength()); // [ 10 ]

        // Test 7: Remove from front (should be empty)
        list.removeFromFront();
        System.out.println("Test 7: After removeFromFront(): " + list + " Size = " + list.getLength()); // [ ]

        // Test 8: Remove from empty list (should do nothing)
        list.removeFromFront();
        System.out.println("Test 8: After removeFromFront() on empty: " + list + " Size = " + list.getLength());

        // Test 9: Add to end on empty list
        list.addToEnd(99);
        System.out.println("Test 9: After addToEnd(99): " + list + " Size = " + list.getLength()); // [ 99 ]

        // Test 10: Add multiple to end
        list.addToEnd(100);
        list.addToEnd(101);
        System.out.println("Test 10: After addToEnd(100), addToEnd(101): " + list + " Size = " + list.getLength()); // [ 99 100 101 ]

        // Test 11: Remove from end until empty
        list.removeFromEnd();
        list.removeFromEnd();
        list.removeFromEnd();
        System.out.println("Test 11: After removing all from end: " + list + " Size = " + list.getLength()); // [ ]

        // Test 12: Add to front and end alternately
        list.addToFront(1);
        list.addToEnd(2);
        list.addToFront(0);
        list.addToEnd(3);
        System.out.println("Test 12: After alternating adds: " + list + " Size = " + list.getLength()); // [ 0 1 2 3 ]
    }
}
