package p10;

public  abstract class AbstractStack {
    protected int[] arr;
    protected int top;

    public AbstractStack(int capacity) {
        arr = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top < arr.length - 1) {
            arr[++top] = value;
        } else {
            System.out.println("Stack overflow!");
        }
    }

    public int pop() {
        if (top >= 0) {
            return arr[top--];
        } else {
            System.out.println("Stack underflow!");
            return 0; // default value
        }
    }

    public int size() {
        return top + 1;
    }
}
