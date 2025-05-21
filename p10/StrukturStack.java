package p10;

public class StrukturStack {
    private int[] array;
    private int capacity;
    private int TOP;
    public final int MIN = -1;

    // Konstruktor
    public StrukturStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    // Operasi push
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

    // Operasi pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1; // Atau bisa lempar exception
        } else {
            int data = array[TOP];
            TOP--;
            return data;
        }
    }

    // Cek apakah stack kosong
    public boolean isEmpty() {
        return (TOP == MIN);
    }

    // Cek apakah stack penuh
    public boolean isFull() {
        return (TOP == capacity - 1);
    }

    // Mendapatkan ukuran stack
    public int size() {
        return TOP + 1;
    }

    // Mendapatkan elemen paling atas
    public int top() {
        if (isEmpty()) {
            return -1; // Atau bisa lempar exception
        }
        return array[TOP];
    }

    // Menampilkan isi stack dari atas ke bawah
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return;
        }
        for (int i = TOP; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
