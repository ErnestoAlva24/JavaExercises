import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter 10 integers: ");

        for (int i = 0; i < 10; i++)
            list.add(input.nextInt());

        removeDuplicate(list);
        System.out.println(list);

    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            for (int j = i + 1; j < list.size(); j++)
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
    }
}
