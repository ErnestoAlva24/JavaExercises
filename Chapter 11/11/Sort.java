import java.util.ArrayList;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        sort(list);

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    public static void sort(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
    }
}
