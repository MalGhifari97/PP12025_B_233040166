package p3;

public class Node {
	private int Data;
	private Node Next;
	
	//inisialisasi Node
	public Node(int Data) {
		this.Data = Data;
	}
	
	public void setData (int Data) {
		this.Data=Data;
	}
	
	public int getData() {
		return Data;
	}
	
	public void setNext (Node Next) {
		this.Next = Next;
	}
	
	public Node getNext() {
		return Next;
	}
}
