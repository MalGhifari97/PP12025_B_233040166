package p9;

public class QueueMain {
	public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        System.out.println("### Enqueue 4x ###");
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);
        queue.displayElements();
        System.out.println("size: " + queue.size());
        System.out.println("Front: " + queue.front());

        System.out.println("\n### Dequeue 3x ###");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.displayElements();
        System.out.println("size: " + queue.size());
        System.out.println("Front: " + queue.front());
    }
}
