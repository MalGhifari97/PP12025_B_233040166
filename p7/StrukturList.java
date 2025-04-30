package p7;

public class StrukturList {
	 private Node HEAD;

	    public StrukturList() {
	        HEAD = null;
	    }

	    public void addTail(int data) {
	        Node baru = new Node(data);
	        if (HEAD == null) {
	            HEAD = baru;
	        } else {
	            Node cur = HEAD;
	            while (cur.getNext() != null) {
	                cur = cur.getNext();
	            }
	            cur.setNext(baru);
	        }
	    }

	    public void display() {
	        Node cur = HEAD;
	        if (cur == null) {
	            System.out.println("List Kosong");
	        } else {

	        while (cur != null) {
	            System.out.print(cur.getData() + " ");
	            cur = cur.getNext();
	        }
	        System.out.println();
	       }
	    }

	    public boolean find(int x) {
	        Node curNode = HEAD;
	        boolean ketemu = false;
	        while (curNode != null && !ketemu) {
	            if (curNode.getData() == x) {
	                ketemu = true;
	            } else {
	                curNode = curNode.getNext();
	            }
	        }
	        return ketemu;
	    }

	    public int size() {
	        Node curNode = HEAD;
	        int jumlah = 0;
	        while (curNode != null) {
	            jumlah++;
	            curNode = curNode.getNext();
	        }
	        return jumlah;
	    }
	    
	    public void removeALL() {
	    	HEAD = null;	    
	    	}

}
