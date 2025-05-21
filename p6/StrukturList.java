<<<<<<< HEAD
package p6;

import p5.Node;

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
    
    public void removeMid(int e) {
		Node preNode = new Node(0);
		Node tempNode;
		int i;
		boolean ketemu;
		
		if (isEmpty()) {
			System.out.println("Elemen List Kosong");
		} else {
			ketemu = false;
			i = 1;
			tempNode = HEAD;

			while (tempNode.getNext() != null && !ketemu) {
				if (tempNode.getNilai() == e) {
					ketemu = true;
				} 
				else {
					preNode = tempNode;
					tempNode = tempNode.getNext();
					i++;
				}
			}

			if (ketemu == true) {
				if (i == 1) {
					HEAD = null;
				} else {
					preNode.setNext(tempNode.getNext());
					dispose(tempNode);
				}
			} 
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
=======
package p6;

import p5.Node;

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
    
    public void removeMid(int e) {
		Node preNode = new Node(0);
		Node tempNode;
		int i;
		boolean ketemu;
		
		if (isEmpty()) {
			System.out.println("Elemen List Kosong");
		} else {
			ketemu = false;
			i = 1;
			tempNode = HEAD;

			while (tempNode.getNext() != null && !ketemu) {
				if (tempNode.getNilai() == e) {
					ketemu = true;
				} 
				else {
					preNode = tempNode;
					tempNode = tempNode.getNext();
					i++;
				}
			}

			if (ketemu == true) {
				if (i == 1) {
					HEAD = null;
				} else {
					preNode.setNext(tempNode.getNext());
					dispose(tempNode);
				}
			} 
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
>>>>>>> ecd375b34adc931b77122c14cc27dbdb03866234
