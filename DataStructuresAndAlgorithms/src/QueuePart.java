import java.util.LinkedList;
import java.util.Queue;

public class QueuePart {

    public static void main(String[] args) {
//      add    = enqueue, offer()
//      remove = dequeue, poll()

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        queue.poll();

        System.out.println(queue.contains("Steve"));

        System.out.println(queue);
    }

}
