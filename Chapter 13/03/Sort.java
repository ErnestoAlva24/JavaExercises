import java.util.ArrayList;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(7);
        list.add(13);
        list.add(12);
        list.add(100);
        list.add(10);

        sort(list);

        System.out.println(list.toString());
    }

    
    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Number min = list.get(i);
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (min.doubleValue() > list.get(j).doubleValue()) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            
            if (minIndex != i) {
                list.set(minIndex, list.get(i));
                list.set(i, min);
            }
        }
    }
}
