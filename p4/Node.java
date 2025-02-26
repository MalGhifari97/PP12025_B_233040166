package p4;

public class Node {
	private double Data;
	private Node Next;
	
	//inisialisasi Node
	public Node(double Data) {
		this.Data = Data;
	}
	
	public void setData (double Data) {
		this.Data=Data;
	}
	
	public double getData() {
		return Data;
	}
	
	public void setNext (Node Next) {
		this.Next = Next;
	}
	
	public Node getNext() {
		return Next;
	}
}
