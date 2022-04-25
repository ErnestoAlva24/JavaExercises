import java.util.ArrayList;

public class GenericStack<E> extends ArrayList{

    public E peek() {
        return (E)get(size() - 1);
    }

    public void push(E o) {
        add(o);
    }

    public E pop() {
        E o = (E)get(size() - 1);
        remove(size() - 1);
        return o;
    }
}