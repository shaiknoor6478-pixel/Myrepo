import java.util.Queue;
import java.util.ArrayDeque;
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println("Queue after offer operations: " + queue);
        String headElement = queue.peek();
        System.out.println("Head element (peek): " + headElement);
        System.out.println("Queue after peek: " + queue);
        String polledElement = queue.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println("Queue after poll operation: " + queue);
        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Polling all remaining elements:");
        while (!queue.isEmpty()) {
            System.out.println("Polled: " + queue.poll());
        }
        System.out.println("Queue after polling all elements: " + queue);
        System.out.println("Is the queue empty now? " + queue.isEmpty());
    }
}