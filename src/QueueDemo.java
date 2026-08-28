import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.ArrayDeque;

public class QueueDemo {
    public static void main(String[] args) {

        // 1. Queue using LinkedList -> FIFO order
        Queue<Integer> linkedListQueue = new LinkedList<>();
        linkedListQueue.add(10);
        linkedListQueue.add(20);
        linkedListQueue.add(30);
        System.out.println("LinkedList Queue: " + linkedListQueue);

        // 2. Queue using ArrayDeque -> FIFO order, faster than LinkedList
        Queue<Integer> arrayDequeQueue = new ArrayDeque<>();
        arrayDequeQueue.add(100);
        arrayDequeQueue.add(200);
        arrayDequeQueue.add(300);
        System.out.println("ArrayDeque Queue: " + arrayDequeQueue);

        // 3. PriorityQueue -> smallest element comes out first (natural order)
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(50);
        priorityQueue.add(10);
        priorityQueue.add(30);
        System.out.println("PriorityQueue (internal order): " + priorityQueue);

        // 4. add() vs offer()
        System.out.println("\n--- add() vs offer() ---");
        linkedListQueue.offer(40);   // safer insert
        System.out.println("After offer(40): " + linkedListQueue);

        // 5. peek() -> view head without removing
        System.out.println("\n--- peek() ---");
        System.out.println("Head element (peek): " + linkedListQueue.peek());
        System.out.println("Queue unchanged: " + linkedListQueue);

        // 6. poll() -> remove and return head
        System.out.println("\n--- poll() ---");
        int removed = linkedListQueue.poll();
        System.out.println("Removed element (poll): " + removed);
        System.out.println("Queue after poll(): " + linkedListQueue);

        // 7. remove() -> similar to poll but throws exception if empty
        System.out.println("\n--- remove() ---");
        int removedElement = linkedListQueue.remove();
        System.out.println("Removed element (remove): " + removedElement);
        System.out.println("Queue after remove(): " + linkedListQueue);

        // 8. Processing PriorityQueue in sorted order
        System.out.println("\n--- Emptying PriorityQueue (sorted order) ---");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        // 9. Looping through a Queue using for-each
        System.out.println("\n--- Loop through ArrayDeque Queue ---");
        for (int val : arrayDequeQueue) {
            System.out.println(val);
        }

        // 10. Checking empty queue behavior (safe vs unsafe)
        System.out.println("\n--- Empty Queue Behavior ---");
        Queue<Integer> emptyQueue = new LinkedList<>();
        System.out.println("poll() on empty queue: " + emptyQueue.poll());     // returns null
        System.out.println("peek() on empty queue: " + emptyQueue.peek());     // returns null
        // emptyQueue.remove();  // would throw NoSuchElementException
        // emptyQueue.element(); // would throw NoSuchElementException
    }
}