package p8;

public class Node {
	private Matakuliah data;
    private Node next;

    public Node(Matakuliah data) {
        this.data = data;
    }

    public Matakuliah getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
