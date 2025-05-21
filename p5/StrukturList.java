package p5;

public class StrukturList {
	private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }
    
    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addTail(int data) {
        Node newNode = new Node(data);
        
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    public void addMid(int data, int position) {
        if (position <= 0) {
            addHead(data);
            return;
        }
        
        Node newNode = new Node(data);
        Node curNode = HEAD;
        int index = 1;
        
        while (curNode != null && index < position - 1) {
            curNode = curNode.getNext();
            index++;
        }
        
        if (curNode == null) {
            addTail(data);
        } else {
            newNode.setNext(curNode.getNext());
            curNode.setNext(newNode);
        }
    }

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
    
    private void dispose(Node node) {
        node.setNext(null);
        node = null;
    }

    
    public void removeHead() {
        if(isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose (temp);
        }
    }

    
    public void removeTail() {
		Node preNode = null, LastNode;
		if (HEAD != null) {
			if (HEAD.getNext() == null) {
				HEAD = null;
			} else {
				LastNode = HEAD;
				while (LastNode.getNext() != null) {
					preNode = LastNode;
					LastNode = LastNode.getNext();
				}
				preNode.setNext(null);
				dispose(LastNode);
			}
		} else {
			System.out.println("List Kosong");
		}
	}


    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(10);
        list.addTail(20);
        list.addTail(30);
        
        System.out.println("Isi Linked List:");
        list.displayElement();
        
        list.addMid(25, 2);
        System.out.println("Setelah menambahkan 25 di posisi 2:");
        list.displayElement();
    }
}
