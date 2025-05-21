<<<<<<< HEAD
package p8;

public class ListMatakuliah {
	private Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addTail(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node cur = HEAD;
            while (cur.getNext() != null) {
                cur = cur.getNext();
            }
            cur.setNext(newNode);
        }
    }

    public void addMid(Matakuliah data, int posisi) {
        Node newNode = new Node(data);
        if (posisi <= 1 || isEmpty()) {
            addHead(data);
            return;
        }

        Node cur = HEAD;
        for (int i = 1; i < posisi - 1 && cur.getNext() != null; i++) {
            cur = cur.getNext();
        }

        newNode.setNext(cur.getNext());
        cur.setNext(newNode);
    }

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.println("Matakuliah :"+curNode.getData().getKode()+curNode.getData().getNama()+curNode.getData().getSks()+"");
                curNode = curNode.getNext();
            }
        }
        System.out.println();
    }
}
=======
package p8;

public class ListMatakuliah {
	private Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addTail(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node cur = HEAD;
            while (cur.getNext() != null) {
                cur = cur.getNext();
            }
            cur.setNext(newNode);
        }
    }

    public void addMid(Matakuliah data, int posisi) {
        Node newNode = new Node(data);
        if (posisi <= 1 || isEmpty()) {
            addHead(data);
            return;
        }

        Node cur = HEAD;
        for (int i = 1; i < posisi - 1 && cur.getNext() != null; i++) {
            cur = cur.getNext();
        }

        newNode.setNext(cur.getNext());
        cur.setNext(newNode);
    }

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.println("Matakuliah :"+curNode.getData().getKode()+curNode.getData().getNama()+curNode.getData().getSks()+"");
                curNode = curNode.getNext();
            }
        }
        System.out.println();
    }
}
>>>>>>> ecd375b34adc931b77122c14cc27dbdb03866234
