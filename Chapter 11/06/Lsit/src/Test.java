import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Loan());
        list.add(new Date());
        list.add("String");
        list.add(new Circle2D());

        for (Object o : list) System.out.println(o);
    }
}
