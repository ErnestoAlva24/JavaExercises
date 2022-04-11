import java.util.ArrayList;

public class MyStack extends ArrayList {
    private java.util.ArrayList<Object> list;

    public MyStack() {
        list = new java.util.ArrayList<Object>();
    }

    public void push(Object o) {
        list.add(0, o);
    }

    public Object pop() {
        Object object = list.get(0);
        list.remove(0);
        return object;
    }
}
