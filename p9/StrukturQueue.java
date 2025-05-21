package p9;

public class StrukturQueue {
	 private Node front, rear;

	    public StrukturQueue() {
	        front = rear = null;
	    }

	    public void enqueue(int data) {
	        Node newNode = new Node(data);
	        if (rear == null) {
	            front = rear = newNode;
	        } else {
	            rear.setNext(newNode);
	            rear = newNode;
	        }
	    }

	    public void dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	        } else {
	            front = front.getNext();
	            if (front == null) {
	                rear = null;
	            }
	        }
	    }

	    public boolean isEmpty() {
	        return front == null;
	    }

	    public int size() {
	        int size = 0;
	        Node curNode = front;
	        while (curNode != null) {
	            size++;
	            curNode = curNode.getNext();
	        }
	        return size;
	    }

	    public int front() {
	        return front != null ? front.getData() : -1;
	    }

	    public void displayElements() {
	        System.out.print("Elemen Queue: ");
	        if (isEmpty()) {
	            System.out.println("Queue kosong");
	            return;
	        }

	        Node current = front;
	        while (current != null) {
	            System.out.print(current.getData() + " ");
	            current = current.getNext();
	        }
	        System.out.println();
	    }
}
