import java.lang.Exception;

public class MyArrayStack {
    private int size;
    private int[] arr;
    private int index = 0;

    public MyArrayStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) throw new StackOverflowError("Stack is full");
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is null");
        return arr[--index];
    }

    public boolean isEmpty() {
        return (index == 0);
    }

    public boolean isFull() {
        return (index == size);
    }

    public int size() {
        return index;
    }
}
