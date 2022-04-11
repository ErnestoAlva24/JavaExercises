import java.util.ArrayList;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        shuffle(list);

        System.out.println(list);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Random r = new Random();

        for (int i = 0; i < list.size(); i++) {
            int i1 = r.nextInt(list.size() - 1);
            int i2 = r.nextInt(list.size() - 1);

            int n1 = list.remove(i1);
            list.add(n1);
            int n2 = list.remove(i2);
            list.add(n2);
        }
    }
}
