import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

 class DequeOperations {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        System.out.println("=== Deque Operations ===\n");

        // 1. append() - Insert at right end
        System.out.println("1. append(5), append(10), append(15)");
        deque.addLast(5);
        deque.addLast(10);
        deque.addLast(15);
        displayDeque(deque);

        // 2. appendleft() - Insert at left end
        System.out.println("\n2. appendleft(1), appendleft(2)");
        deque.addFirst(1);
        deque.addFirst(2);
        displayDeque(deque);

        // 3. pop() - Remove from right end
        System.out.println("\n3. pop() - Remove from right");
        int poppedRight = deque.removeLast();
        System.out.println("Removed: " + poppedRight);
        displayDeque(deque);

        // 4. popleft() - Remove from left end
        System.out.println("\n4. popleft() - Remove from left");
        int poppedLeft = deque.removeFirst();
        System.out.println("Removed: " + poppedLeft);
        displayDeque(deque);

        // 5. Access front element [0]
        System.out.println("\n5. Access front element [0]: " + deque.getFirst());

        // 6. Access back element [-1]
        System.out.println("6. Access back element [-1]: " + deque.getLast());

        // 7. len() - Get size
        System.out.println("\n7. Size of deque: " + deque.size());

        // 8. extend() - Add multiple values at right end
        System.out.println("\n8. extend([20, 25, 30])");
        deque.addLast(20);
        deque.addLast(25);
        deque.addLast(30);
        displayDeque(deque);

        // 9. extendleft() - Add multiple values at left end (reversed order)
        System.out.println("\n9. extendleft([100, 200, 300]) - Note: Order reversed");
        deque.addFirst(300);
        deque.addFirst(200);
        deque.addFirst(100);
        displayDeque(deque);

        // 10. contains() - Check if element exists
        System.out.println("\n10. Check if 10 exists: " + deque.contains(10));
        System.out.println("    Check if 999 exists: " + deque.contains(999));

        // 11. indexOf() - Find first index
        System.out.println("\n11. Find index of element 25");
        int index = findIndex(deque, 25);
        if (index != -1) {
            System.out.println("Index: " + index);
        } else {
            System.out.println("Element not found");
        }

        // 12. remove() - Remove first occurrence
        System.out.println("\n12. Remove first occurrence of 25");
        deque.remove(25);
        displayDeque(deque);

        // 13. count() - Count occurrences
        System.out.println("\n13. Add duplicate 10 and count occurrences");
        deque.addLast(10);
        displayDeque(deque);
        int count = countOccurrences(deque, 10);
        System.out.println("Count of 10: " + count);

        // 14. reverse() - Reverse deque
        System.out.println("\n14. Reverse the deque");
        reverseDeque(deque);
        displayDeque(deque);

        // 15. rotate() - Rotate deque
        System.out.println("\n15. Rotate right by 2 positions");
        rotateRight(deque, 2);
        displayDeque(deque);

        System.out.println("\n16. Rotate left by 1 position");
        rotateLeft(deque, 1);
        displayDeque(deque);

        // Clear deque
        System.out.println("\n17. Clear deque");
        deque.clear();
        System.out.println("Deque cleared. Size: " + deque.size());
    }

    // Helper method to display deque
    public static void displayDeque(Deque<Integer> deque) {
        System.out.print("Deque: ");
        for (int num : deque) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Helper method to find index
    public static int findIndex(Deque<Integer> deque, int value) {
        int index = 0;
        for (int num : deque) {
            if (num == value) {
                return index;
            }
            index++;
        }
        return -1;
    }

    // Helper method to count occurrences
    public static int countOccurrences(Deque<Integer> deque, int value) {
        int count = 0;
        for (int num : deque) {
            if (num == value) {
                count++;
            }
        }
        return count;
    }

    // Helper method to reverse deque
    public static void reverseDeque(Deque<Integer> deque) {
        Deque<Integer> temp = new ArrayDeque<>();
        while (!deque.isEmpty()) {
            temp.addLast(deque.removeLast());
        }
        while (!temp.isEmpty()) {
            deque.addLast(temp.removeLast());
        }
    }

    // Helper method to rotate right
    public static void rotateRight(Deque<Integer> deque, int steps) {
        int size = deque.size();
        steps = steps % size;
        for (int i = 0; i < steps; i++) {
            deque.addFirst(deque.removeLast());
        }
    }

    // Helper method to rotate left
    public static void rotateLeft(Deque<Integer> deque, int steps) {
        int size = deque.size();
        steps = steps % size;
        for (int i = 0; i < steps; i++) {
            deque.addLast(deque.removeFirst());
        }
    }
}