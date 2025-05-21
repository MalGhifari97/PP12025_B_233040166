package p4;

public class Node {
	private int Data;
	private Node Next;
	
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
