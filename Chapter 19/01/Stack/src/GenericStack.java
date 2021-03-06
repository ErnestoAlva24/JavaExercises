import java.util.Arrays;

public class GenericStack<E> {
    private E[] list = (E[]) new Object[5];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public E peek() {
        return list[size - 1];
    }

    public void push(E o) {
        if(size >= list.length){
            E[] tempList = (E[]) new Object[list.length * 2];
            System.arraycopy(list, 0, tempList, 0, list.length);
            list = tempList;
        }
        list[size++] = o;
    }

    public E pop() {
        E o = list[--size];
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}